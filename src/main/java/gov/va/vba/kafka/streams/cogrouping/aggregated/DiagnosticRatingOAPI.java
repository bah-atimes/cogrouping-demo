package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * DiagnosticRatingOAPI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class DiagnosticRatingOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("diagnosticTypeCode")
  private String diagnosticTypeCode;

  @JsonProperty("personId")
  private Long personId;

  public DiagnosticRatingOAPI diagnosticTypeCode(String diagnosticTypeCode) {
    this.diagnosticTypeCode = diagnosticTypeCode;
    return this;
  }

  /**
   * Get diagnosticTypeCode
   * @return diagnosticTypeCode
  */
  @ApiModelProperty(value = "")


  public String getDiagnosticTypeCode() {
    return diagnosticTypeCode;
  }

  public void setDiagnosticTypeCode(String diagnosticTypeCode) {
    this.diagnosticTypeCode = diagnosticTypeCode;
  }

  public DiagnosticRatingOAPI personId(Long personId) {
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
    DiagnosticRatingOAPI diagnosticRatingOAPI = (DiagnosticRatingOAPI) o;
    return Objects.equals(this.diagnosticTypeCode, diagnosticRatingOAPI.diagnosticTypeCode) &&
        Objects.equals(this.personId, diagnosticRatingOAPI.personId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagnosticTypeCode, personId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticRatingOAPI {\n");

    sb.append("    diagnosticTypeCode: ").append(toIndentedString(diagnosticTypeCode)).append("\n");
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

