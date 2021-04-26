package gov.va.vba.kafka.streams.cogrouping;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Aggregator;
import org.apache.kafka.streams.kstream.KGroupedStream;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KeyValueMapper;
import org.apache.kafka.streams.state.Stores;

import java.util.Collections;
import java.util.Properties;
import java.util.UUID;

public class App {

    private final static String PERSON_TOPIC = "person-topic";
    private final static String CLAIM_TOPIC = "claim-topic";

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

        final Aggregator<String, String, String> loginAggregator = new DemoAggregator();

        StreamsBuilder builder = new StreamsBuilder();
        builder.addStateStore(
                Stores.keyValueStoreBuilder(
                        Stores.inMemoryKeyValueStore("store"),
                        Serdes.String(),
                        Serdes.String()));


        final KStream<String,String> personStream = builder.stream(Collections.singletonList(PERSON_TOPIC));
        final KStream<String,String> claimStream = builder.stream(Collections.singletonList(CLAIM_TOPIC));

        final KGroupedStream<String,String> personGrouped = personStream.groupByKey();

        final KGroupedStream<String,String> claimGroupedByPerson = claimStream.groupBy(new KeyValueMapper<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return "32435876";
            }
        });

        personGrouped.cogroup(loginAggregator)
                .cogroup(claimGroupedByPerson, loginAggregator)
                .aggregate(() -> String.valueOf("thing"))
                .toStream().to("output-topic");

        KafkaStreams streams = new KafkaStreams(builder.build(), streamsConfiguration);
        streams.start();
        System.out.println("Started");
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));
    }

    private String aggregateClaims(String key, String newValue, String aggValue) {
        return null;
    }
}
