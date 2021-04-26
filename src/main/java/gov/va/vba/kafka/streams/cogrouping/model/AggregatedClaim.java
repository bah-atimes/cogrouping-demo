package gov.va.vba.kafka.streams.cogrouping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Objects;

/**
 * AggregatedClaim
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class AggregatedClaim extends AggregatedComponent implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("claimId")
  private Long claimId;

  @JsonProperty("uniqueContentionClassifications")
  private UniqueContentionClassificationsOAPI uniqueContentionClassifications = null;

  @JsonProperty("trackedItems")
  private TrackedItemsOAPI trackedItems = null;

  @JsonProperty("specialIssues")
  private SpecialIssuesOAPI specialIssues = null;

  @JsonProperty("claim")
  private ClaimOAPI claim = null;

  public AggregatedClaim claimId(Long claimId) {
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

  public AggregatedClaim uniqueContentionClassifications(UniqueContentionClassificationsOAPI uniqueContentionClassifications) {
    this.uniqueContentionClassifications = uniqueContentionClassifications;
    return this;
  }

  /**
   * Get uniqueContentionClassifications
   * @return uniqueContentionClassifications
  */
  @ApiModelProperty(value = "")

  public UniqueContentionClassificationsOAPI getUniqueContentionClassifications() {
    return uniqueContentionClassifications;
  }

  public void setUniqueContentionClassifications(UniqueContentionClassificationsOAPI uniqueContentionClassifications) {
    this.uniqueContentionClassifications = uniqueContentionClassifications;
  }

  public AggregatedClaim trackedItems(TrackedItemsOAPI trackedItems) {
    this.trackedItems = trackedItems;
    return this;
  }

  /**
   * Get trackedItems
   * @return trackedItems
  */
  @ApiModelProperty(value = "")

  public TrackedItemsOAPI getTrackedItems() {
    return trackedItems;
  }

  public void setTrackedItems(TrackedItemsOAPI trackedItems) {
    this.trackedItems = trackedItems;
  }

  public AggregatedClaim specialIssues(SpecialIssuesOAPI specialIssues) {
    this.specialIssues = specialIssues;
    return this;
  }

  /**
   * Get specialIssues
   * @return specialIssues
  */
  @ApiModelProperty(value = "")

  public SpecialIssuesOAPI getSpecialIssues() {
    return specialIssues;
  }

  public void setSpecialIssues(SpecialIssuesOAPI specialIssues) {
    this.specialIssues = specialIssues;
  }

  public AggregatedClaim claim(ClaimOAPI claim) {
    this.claim = claim;
    return this;
  }

  /**
   * Get claim
   * @return claim
  */
  @ApiModelProperty(value = "")

  public ClaimOAPI getClaim() {
    return claim;
  }

  public void setClaim(ClaimOAPI claim) {
    this.claim = claim;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedClaim aggregatedClaim = (AggregatedClaim) o;
    return Objects.equals(this.claimId, aggregatedClaim.claimId) &&
        Objects.equals(this.uniqueContentionClassifications, aggregatedClaim.uniqueContentionClassifications) &&
        Objects.equals(this.trackedItems, aggregatedClaim.trackedItems) &&
        Objects.equals(this.specialIssues, aggregatedClaim.specialIssues) &&
        Objects.equals(this.claim, aggregatedClaim.claim) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId, uniqueContentionClassifications, trackedItems, specialIssues, claim, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedClaim {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    uniqueContentionClassifications: ").append(toIndentedString(uniqueContentionClassifications)).append("\n");
    sb.append("    trackedItems: ").append(toIndentedString(trackedItems)).append("\n");
    sb.append("    specialIssues: ").append(toIndentedString(specialIssues)).append("\n");
    sb.append("    claim: ").append(toIndentedString(claim)).append("\n");
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

