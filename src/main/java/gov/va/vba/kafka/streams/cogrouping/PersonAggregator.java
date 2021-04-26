package gov.va.vba.kafka.streams.cogrouping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.streams.kstream.Aggregator;

import java.util.LinkedHashMap;

public class PersonAggregator implements Aggregator<String, String, String> {

    @Override
    public String apply(String key, String value, String newValue) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            PersonCombined person = (newValue.length() > 0) ? mapper.readValue(newValue, new TypeReference<PersonCombined>() {}) : new PersonCombined();
            LinkedHashMap<String, Object> latest = mapper.readValue(value, new TypeReference<LinkedHashMap<String, Object>>() {});
            if (latest.get("claim") != null) {
                if(!person.claims.contains(value)) {
                    person.claims.add(value);
                }
            } if(latest.get("personChanges") != null) {
                if(!person.changes.contains(value)) {
                    person.changes.add(value);
                }
            }
            else {
                person.personJson = value;
            }
            person.id = key;
            System.out.println("Id:" + person.id + " claims:" + person.claims.size() + " changes:" + person.changes.size());
            newValue = mapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return newValue;
    }
}