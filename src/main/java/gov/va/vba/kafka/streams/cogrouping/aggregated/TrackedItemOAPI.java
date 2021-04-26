package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * TrackedItemOAPI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class TrackedItemOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("claimId")
  private Long claimId;

  @JsonProperty("developmentActionCategoryCode")
  private String developmentActionCategoryCode;

  @JsonProperty("lastestStatusCode")
  private String lastestStatusCode;

  @JsonProperty("latestStatusDate")
  private OffsetDateTime latestStatusDate;

  @JsonProperty("requestDate")
  private OffsetDateTime requestDate;

  @JsonProperty("stdDvlpmtActionId")
  private Long stdDvlpmtActionId;

  @JsonProperty("suspenseDate")
  private OffsetDateTime suspenseDate;

  @JsonProperty("trackedItemName")
  private String trackedItemName;

  public TrackedItemOAPI claimId(Long claimId) {
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

  public TrackedItemOAPI developmentActionCategoryCode(String developmentActionCategoryCode) {
    this.developmentActionCategoryCode = developmentActionCategoryCode;
    return this;
  }

  /**
   * Get developmentActionCategoryCode
   * @return developmentActionCategoryCode
  */
  @ApiModelProperty(value = "")


  public String getDevelopmentActionCategoryCode() {
    return developmentActionCategoryCode;
  }

  public void setDevelopmentActionCategoryCode(String developmentActionCategoryCode) {
    this.developmentActionCategoryCode = developmentActionCategoryCode;
  }

  public TrackedItemOAPI lastestStatusCode(String lastestStatusCode) {
    this.lastestStatusCode = lastestStatusCode;
    return this;
  }

  /**
   * Get lastestStatusCode
   * @return lastestStatusCode
  */
  @ApiModelProperty(value = "")


  public String getLastestStatusCode() {
    return lastestStatusCode;
  }

  public void setLastestStatusCode(String lastestStatusCode) {
    this.lastestStatusCode = lastestStatusCode;
  }

  public TrackedItemOAPI latestStatusDate(OffsetDateTime latestStatusDate) {
    this.latestStatusDate = latestStatusDate;
    return this;
  }

  /**
   * Get latestStatusDate
   * @return latestStatusDate
  */
  @ApiModelProperty(value = "")

  

  public OffsetDateTime getLatestStatusDate() {
    return latestStatusDate;
  }

  public void setLatestStatusDate(OffsetDateTime latestStatusDate) {
    this.latestStatusDate = latestStatusDate;
  }

  public TrackedItemOAPI requestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
    return this;
  }

  /**
   * Get requestDate
   * @return requestDate
  */
  @ApiModelProperty(value = "")

  

  public OffsetDateTime getRequestDate() {
    return requestDate;
  }

  public void setRequestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
  }

  public TrackedItemOAPI stdDvlpmtActionId(Long stdDvlpmtActionId) {
    this.stdDvlpmtActionId = stdDvlpmtActionId;
    return this;
  }

  /**
   * Get stdDvlpmtActionId
   * @return stdDvlpmtActionId
  */
  @ApiModelProperty(value = "")


  public Long getStdDvlpmtActionId() {
    return stdDvlpmtActionId;
  }

  public void setStdDvlpmtActionId(Long stdDvlpmtActionId) {
    this.stdDvlpmtActionId = stdDvlpmtActionId;
  }

  public TrackedItemOAPI suspenseDate(OffsetDateTime suspenseDate) {
    this.suspenseDate = suspenseDate;
    return this;
  }

  /**
   * Get suspenseDate
   * @return suspenseDate
  */
  @ApiModelProperty(value = "")

  

  public OffsetDateTime getSuspenseDate() {
    return suspenseDate;
  }

  public void setSuspenseDate(OffsetDateTime suspenseDate) {
    this.suspenseDate = suspenseDate;
  }

  public TrackedItemOAPI trackedItemName(String trackedItemName) {
    this.trackedItemName = trackedItemName;
    return this;
  }

  /**
   * Get trackedItemName
   * @return trackedItemName
  */
  @ApiModelProperty(value = "")


  public String getTrackedItemName() {
    return trackedItemName;
  }

  public void setTrackedItemName(String trackedItemName) {
    this.trackedItemName = trackedItemName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackedItemOAPI trackedItemOAPI = (TrackedItemOAPI) o;
    return Objects.equals(this.claimId, trackedItemOAPI.claimId) &&
        Objects.equals(this.developmentActionCategoryCode, trackedItemOAPI.developmentActionCategoryCode) &&
        Objects.equals(this.lastestStatusCode, trackedItemOAPI.lastestStatusCode) &&
        Objects.equals(this.latestStatusDate, trackedItemOAPI.latestStatusDate) &&
        Objects.equals(this.requestDate, trackedItemOAPI.requestDate) &&
        Objects.equals(this.stdDvlpmtActionId, trackedItemOAPI.stdDvlpmtActionId) &&
        Objects.equals(this.suspenseDate, trackedItemOAPI.suspenseDate) &&
        Objects.equals(this.trackedItemName, trackedItemOAPI.trackedItemName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId, developmentActionCategoryCode, lastestStatusCode, latestStatusDate, requestDate, stdDvlpmtActionId, suspenseDate, trackedItemName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedItemOAPI {\n");

    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    developmentActionCategoryCode: ").append(toIndentedString(developmentActionCategoryCode)).append("\n");
    sb.append("    lastestStatusCode: ").append(toIndentedString(lastestStatusCode)).append("\n");
    sb.append("    latestStatusDate: ").append(toIndentedString(latestStatusDate)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("    stdDvlpmtActionId: ").append(toIndentedString(stdDvlpmtActionId)).append("\n");
    sb.append("    suspenseDate: ").append(toIndentedString(suspenseDate)).append("\n");
    sb.append("    trackedItemName: ").append(toIndentedString(trackedItemName)).append("\n");
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

