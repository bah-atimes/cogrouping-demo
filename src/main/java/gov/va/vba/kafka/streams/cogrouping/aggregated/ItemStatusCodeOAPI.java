package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ItemStatusCodeOAPI
 */
public enum ItemStatusCodeOAPI {
  
  PERSON_OR_CLAIM_NOT_FOUND("PERSON_OR_CLAIM_NOT_FOUND"),
  
  ERROR("ERROR");

  private String value;

  ItemStatusCodeOAPI(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ItemStatusCodeOAPI fromValue(String text) {
    for (ItemStatusCodeOAPI b : ItemStatusCodeOAPI.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

