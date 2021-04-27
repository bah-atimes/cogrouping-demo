package gov.va.vba.kafka.streams.cogrouping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.streams.kstream.Aggregator;

import java.util.LinkedHashMap;

public class ClaimAggregator implements Aggregator<String, String, String> {
    @Override
    public String apply(String key, String newData, String aggregation) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            ClaimCombined claim = (aggregation.length() > 0) ? mapper.readValue(aggregation, new TypeReference<ClaimCombined>() {}) : new ClaimCombined();
            LinkedHashMap<String, Object> latest = mapper.readValue(newData, new TypeReference<LinkedHashMap<String, Object>>() {});

            claim.id = key;
            if(latest.get("claimChanges") != null) {
                if(!claim.changes.contains(newData)) {
                    claim.changes.add(newData);
                }
            }
            else {
                claim.claim = newData;
            }
            aggregation = mapper.writeValueAsString(claim);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return aggregation;
    }
}
