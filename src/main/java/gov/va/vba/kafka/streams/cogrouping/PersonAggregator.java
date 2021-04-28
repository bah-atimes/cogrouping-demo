package gov.va.vba.kafka.streams.cogrouping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.streams.kstream.Aggregator;

import java.util.LinkedHashMap;

public class PersonAggregator implements Aggregator<String, String, String> {

    @Override
    public String apply(String key, String newData, String aggregation) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            PersonCombined person = (aggregation.length() > 0) ? mapper.readValue(aggregation, new TypeReference<PersonCombined>() {}) : new PersonCombined();
            LinkedHashMap<String, Object> latest = mapper.readValue(newData, new TypeReference<LinkedHashMap<String, Object>>() {});

            person.id = key;
            if (latest.get("claim") != null) {
                if(!person.claims.contains(newData)) {
                    person.claims.add(newData);
                }
            }

            else if(latest.get("personChanges") != null) {
                if(!person.changes.contains(newData)) {
                    person.changes.add(newData);
                }
            }

            else {
                person.personJson = newData;
            }
            System.out.println("Id:" + person.id + " claims:" + person.claims.size() + " changes:" + person.changes.size());
            aggregation = mapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return aggregation;
    }
}