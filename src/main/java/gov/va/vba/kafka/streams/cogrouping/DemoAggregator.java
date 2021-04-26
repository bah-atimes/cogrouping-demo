package gov.va.vba.kafka.streams.cogrouping;

import org.apache.kafka.streams.kstream.Aggregator;

public class DemoAggregator implements Aggregator<String,String,String> {

    @Override
    public String apply(String key, String value, String newValue) {
        return null;
    }
}
