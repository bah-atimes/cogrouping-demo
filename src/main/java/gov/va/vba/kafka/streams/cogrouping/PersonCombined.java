package gov.va.vba.kafka.streams.cogrouping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonCombined {

    public String id;
    public String personJson;
    public Map<Long, ClaimCombined> claims = new HashMap<>();
    public List<String> changes = new ArrayList<>();
}
