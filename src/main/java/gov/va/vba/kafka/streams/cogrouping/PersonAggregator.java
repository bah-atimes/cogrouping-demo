package gov.va.vba.kafka.streams.cogrouping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.streams.kstream.Aggregator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class PersonAggregator implements Aggregator<String, String, String> {

    @Override
    public String apply(String key, String newData, String aggregation) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            PersonCombined person = (aggregation.length() > 0) ? mapper.readValue(aggregation, new TypeReference<PersonCombined>() {}) : new PersonCombined();
            LinkedHashMap<String, Object> latest = mapper.readValue(newData, new TypeReference<LinkedHashMap<String, Object>>() {});

            person.id = key;
            if (latest.get("claim") != null) {
                ClaimCombined claim = mapper.readValue(newData, new TypeReference<ClaimCombined>() {});
                person.claims.put(Long.valueOf(claim.id), claim);
            }

            else if(latest.get("personChanges") != null) {
                if(!person.changes.contains(newData)) {
                    person.changes.add(newData);
                }
            }

            else {
                person.personJson = newData;
            }
            aggregation = mapper.writeValueAsString(person);
            if(person.claims.size() > 100) {
                System.out.println("Person id:" + person.id + " claims:" + person.claims.size() + " changes:" + person.changes.size());
                List<Long> keys = new ArrayList<>(person.claims.keySet());
                Collections.sort(keys);
                for (Long k : keys) {
                    ClaimCombined c = person.claims.get(k);
                    System.out.println("    Claim id:" + c.id + " changes:" + c.changes.size());
                }
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return aggregation;
    }
}