package gov.va.vba.kafka.streams.cogrouping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.streams.kstream.KeyValueMapper;

import java.util.LinkedHashMap;

public class ClaimToPersonKeyValueMapper implements KeyValueMapper<String,String,String> {

    @Override
    public String apply(String s, String s2) {

        ObjectMapper mapper = new ObjectMapper();
        String key = null;

        try {
            LinkedHashMap<String,Object> latest = mapper.readValue(s2, new TypeReference<LinkedHashMap<String,Object>>() {});
            LinkedHashMap<String,Object> claimMap = mapper.readValue(latest.get("claim").toString(), new TypeReference<LinkedHashMap<String,Object>>() {});
            LinkedHashMap<String,Object> claim = (LinkedHashMap<String, Object>) claimMap.get("claim");
            if(claim.get("veteranPersonId") == null) {
                key = String.valueOf(claim.get("claimantPersonId"));
            }
            else key = String.valueOf(claim.get("veteranPersonId"));

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return key;
    }
}
