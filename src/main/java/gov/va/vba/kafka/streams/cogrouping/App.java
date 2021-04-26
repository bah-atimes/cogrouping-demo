package gov.va.vba.kafka.streams.cogrouping;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Aggregator;
import org.apache.kafka.streams.kstream.KGroupedStream;
import org.apache.kafka.streams.kstream.KStream;

import java.util.Collections;
import java.util.Properties;
import java.util.UUID;

public class App {

    private final static String PERSON_TOPIC = "person-topic";
    private final static String CLAIM_TOPIC = "claim-topic";
    private final static String PERSON_CHANGES_TOPIC = "person-changes-topic";

    public static void main(String []args) {
        new App();
    }

    public App() {
        Properties streamsConfiguration = new Properties();

        //ensure the stream always start at the beginning
        streamsConfiguration.put(StreamsConfig.APPLICATION_ID_CONFIG, UUID.randomUUID().toString());
        streamsConfiguration.put(ConsumerConfig.GROUP_ID_CONFIG, UUID.randomUUID().toString());
        streamsConfiguration.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        String bootstrapServers = "broker:9092";
        streamsConfiguration.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);

        streamsConfiguration.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        streamsConfiguration.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG,Serdes.String().getClass().getName());

        final Aggregator<String, String, String> personAggregator = new PersonAggregator();

        StreamsBuilder builder = new StreamsBuilder();
//        builder.addStateStore(
//                Stores.keyValueStoreBuilder(
//                        Stores.inMemoryKeyValueStore("store"),
//                        Serdes.String(),
//                        Serdes.String()));


        final KStream<String,String> personStream = builder.stream(Collections.singletonList(PERSON_TOPIC));
        final KStream<String,String> claimStream = builder.stream(Collections.singletonList(CLAIM_TOPIC));
        final KStream<String,String> personChangesStream = builder.stream(Collections.singletonList(PERSON_CHANGES_TOPIC));

        final KGroupedStream<String,String> personGrouped = personStream.groupByKey();
        final KGroupedStream<String,String> claimGroupedByPerson = claimStream.groupBy(new ClaimToPersonKeyValueMapper());
        final KGroupedStream<String,String> personChangesGrouped = personChangesStream.groupByKey();

        personGrouped.cogroup(personAggregator)
                .cogroup(claimGroupedByPerson, personAggregator)
                .cogroup(personChangesGrouped, personAggregator)
                .aggregate(String::new)
                .toStream().to("output-topic");

        KafkaStreams streams = new KafkaStreams(builder.build(), streamsConfiguration);
        streams.start();
        System.out.println("Started");
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));
    }
}
