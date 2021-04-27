package gov.va.vba.kafka.streams.cogrouping;

import org.apache.kafka.streams.kstream.Aggregator;

public class ClaimAggregator implements Aggregator<String, String, String> {
    @Override
    public String apply(String key, String newData, String aggregation) {
        return null;
    }
}
