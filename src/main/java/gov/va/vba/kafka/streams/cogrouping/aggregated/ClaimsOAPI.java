package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Model for list of claims returned from BGS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class ClaimsOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("claimList")
  private List<ClaimOAPI> claimList = null;

  @JsonProperty("operationStatus")
  private OperationStatusOAPI operationStatus = null;

  public ClaimsOAPI claimList(List<ClaimOAPI> claimList) {
    this.claimList = claimList;
    return this;
  }

  public ClaimsOAPI addClaimListItem(ClaimOAPI claimListItem) {
    if (this.claimList == null) {
      this.claimList = new ArrayList<>();
    }
    this.claimList.add(claimListItem);
    return this;
  }

  public List<ClaimOAPI> getClaimList() {
    return claimList;
  }

  public void setClaimList(List<ClaimOAPI> claimList) {
    this.claimList = claimList;
  }

  public ClaimsOAPI operationStatus(OperationStatusOAPI operationStatus) {
    this.operationStatus = operationStatus;
    return this;
  }

  public OperationStatusOAPI getOperationStatus() {
    return operationStatus;
  }

  public void setOperationStatus(OperationStatusOAPI operationStatus) {
    this.operationStatus = operationStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimsOAPI claimsOAPI = (ClaimsOAPI) o;
    return Objects.equals(this.claimList, claimsOAPI.claimList) &&
        Objects.equals(this.operationStatus, claimsOAPI.operationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimList, operationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimsOAPI {\n");

    sb.append("    claimList: ").append(toIndentedString(claimList)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
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

