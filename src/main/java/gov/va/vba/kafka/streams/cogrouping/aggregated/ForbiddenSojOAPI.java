package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * ForbiddenSojOAPI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class ForbiddenSojOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("forbiddenSoj")
  private String forbiddenSoj;

  @JsonProperty("personId")
  private Long personId;

  public ForbiddenSojOAPI forbiddenSoj(String forbiddenSoj) {
    this.forbiddenSoj = forbiddenSoj;
    return this;
  }

  /**
   * Get forbiddenSoj
   * @return forbiddenSoj
  */
  @ApiModelProperty(value = "")


  public String getForbiddenSoj() {
    return forbiddenSoj;
  }

  public void setForbiddenSoj(String forbiddenSoj) {
    this.forbiddenSoj = forbiddenSoj;
  }

  public ForbiddenSojOAPI personId(Long personId) {
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
    ForbiddenSojOAPI forbiddenSojOAPI = (ForbiddenSojOAPI) o;
    return Objects.equals(this.forbiddenSoj, forbiddenSojOAPI.forbiddenSoj) &&
        Objects.equals(this.personId, forbiddenSojOAPI.personId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forbiddenSoj, personId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForbiddenSojOAPI {\n");

    sb.append("    forbiddenSoj: ").append(toIndentedString(forbiddenSoj)).append("\n");
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

