package gov.va.vba.kafka.streams.cogrouping;

import java.util.ArrayList;
import java.util.List;

public class PersonCombined {

    public String id;
    public String personJson;
    public List<String> claims = new ArrayList<>();
    public List<String> changes = new ArrayList<>();
}
