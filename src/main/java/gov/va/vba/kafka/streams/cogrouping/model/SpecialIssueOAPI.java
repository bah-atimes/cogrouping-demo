package gov.va.vba.kafka.streams.cogrouping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Objects;

/**
 * SpecialIssueOAPI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class SpecialIssueOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("claimId")
  private Long claimId;

  @JsonProperty("contentionId")
  private Long contentionId;

  @JsonProperty("specialIssueCode")
  private String specialIssueCode;

  public SpecialIssueOAPI claimId(Long claimId) {
    this.claimId = claimId;
    return this;
  }

  /**
   * Get claimId
   * @return claimId
  */
  @ApiModelProperty(value = "")


  public Long getClaimId() {
    return claimId;
  }

  public void setClaimId(Long claimId) {
    this.claimId = claimId;
  }

  public SpecialIssueOAPI contentionId(Long contentionId) {
    this.contentionId = contentionId;
    return this;
  }

  /**
   * Get contentionId
   * @return contentionId
  */
  @ApiModelProperty(value = "")


  public Long getContentionId() {
    return contentionId;
  }

  public void setContentionId(Long contentionId) {
    this.contentionId = contentionId;
  }

  public SpecialIssueOAPI specialIssueCode(String specialIssueCode) {
    this.specialIssueCode = specialIssueCode;
    return this;
  }

  /**
   * Get specialIssueCode
   * @return specialIssueCode
  */
  @ApiModelProperty(value = "")


  public String getSpecialIssueCode() {
    return specialIssueCode;
  }

  public void setSpecialIssueCode(String specialIssueCode) {
    this.specialIssueCode = specialIssueCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialIssueOAPI specialIssueOAPI = (SpecialIssueOAPI) o;
    return Objects.equals(this.claimId, specialIssueOAPI.claimId) &&
        Objects.equals(this.contentionId, specialIssueOAPI.contentionId) &&
        Objects.equals(this.specialIssueCode, specialIssueOAPI.specialIssueCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId, contentionId, specialIssueCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialIssueOAPI {\n");

    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    contentionId: ").append(toIndentedString(contentionId)).append("\n");
    sb.append("    specialIssueCode: ").append(toIndentedString(specialIssueCode)).append("\n");
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

