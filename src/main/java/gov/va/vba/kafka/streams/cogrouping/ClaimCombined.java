package gov.va.vba.kafka.streams.cogrouping;

import java.util.ArrayList;
import java.util.List;

public class ClaimCombined {

    public String id;
    public String claim;
    public List<String> changes = new ArrayList<>();
}
