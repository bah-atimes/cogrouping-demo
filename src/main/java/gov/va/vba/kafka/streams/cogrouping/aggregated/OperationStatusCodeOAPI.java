package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets OperationStatusCodeOAPI
 */
public enum OperationStatusCodeOAPI {
  
  SUCCESS("success"),
  
  FAILURE("failure");

  private String value;

  OperationStatusCodeOAPI(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OperationStatusCodeOAPI fromValue(String text) {
    for (OperationStatusCodeOAPI b : OperationStatusCodeOAPI.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

