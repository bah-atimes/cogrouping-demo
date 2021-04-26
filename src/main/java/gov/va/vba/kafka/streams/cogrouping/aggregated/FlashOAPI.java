package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * FlashOAPI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class FlashOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("flashName")
  private String flashName;

  @JsonProperty("personId")
  private Long personId;

  public FlashOAPI flashName(String flashName) {
    this.flashName = flashName;
    return this;
  }

  /**
   * Get flashName
   * @return flashName
  */
  @ApiModelProperty(value = "")


  public String getFlashName() {
    return flashName;
  }

  public void setFlashName(String flashName) {
    this.flashName = flashName;
  }

  public FlashOAPI personId(Long personId) {
    this.personId = personId;
    return this;
  }

  /**
   * Get personId
   * @return personId
  */
  @ApiModelProperty(value = "")


  public Long getPersonId() {
    return personId;
  }

  public void setPersonId(Long personId) {
    this.personId = personId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlashOAPI flashOAPI = (FlashOAPI) o;
    return Objects.equals(this.flashName, flashOAPI.flashName) &&
        Objects.equals(this.personId, flashOAPI.personId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flashName, personId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlashOAPI {\n");

    sb.append("    flashName: ").append(toIndentedString(flashName)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

