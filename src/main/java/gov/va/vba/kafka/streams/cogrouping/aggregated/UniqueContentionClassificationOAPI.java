package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * UniqueContentionClassificationOAPI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class UniqueContentionClassificationOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("claimId")
  private Long claimId;

  @JsonProperty("contentionClassificationId")
  private Long contentionClassificationId;

  public UniqueContentionClassificationOAPI claimId(Long claimId) {
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

  public UniqueContentionClassificationOAPI contentionClassificationId(Long contentionClassificationId) {
    this.contentionClassificationId = contentionClassificationId;
    return this;
  }

  /**
   * Get contentionClassificationId
   * @return contentionClassificationId
  */
  @ApiModelProperty(value = "")


  public Long getContentionClassificationId() {
    return contentionClassificationId;
  }

  public void setContentionClassificationId(Long contentionClassificationId) {
    this.contentionClassificationId = contentionClassificationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniqueContentionClassificationOAPI uniqueContentionClassificationOAPI = (UniqueContentionClassificationOAPI) o;
    return Objects.equals(this.claimId, uniqueContentionClassificationOAPI.claimId) &&
        Objects.equals(this.contentionClassificationId, uniqueContentionClassificationOAPI.contentionClassificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId, contentionClassificationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniqueContentionClassificationOAPI {\n");

    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    contentionClassificationId: ").append(toIndentedString(contentionClassificationId)).append("\n");
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

