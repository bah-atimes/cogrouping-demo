package gov.va.vba.kafka.streams.cogrouping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Model for list of tracked items returned from BGS
 */
@ApiModel(description = "Model for list of tracked items returned from BGS")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class TrackedItemsOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("trackedItemList")
  
  private List<TrackedItemOAPI> trackedItemList = null;

  @JsonProperty("operationStatus")
  private OperationStatusOAPI operationStatus = null;

  public TrackedItemsOAPI trackedItemList(List<TrackedItemOAPI> trackedItemList) {
    this.trackedItemList = trackedItemList;
    return this;
  }

  public TrackedItemsOAPI addTrackedItemListItem(TrackedItemOAPI trackedItemListItem) {
    if (this.trackedItemList == null) {
      this.trackedItemList = new ArrayList<>();
    }
    this.trackedItemList.add(trackedItemListItem);
    return this;
  }

  /**
   * Get trackedItemList
   * @return trackedItemList
  */
  @ApiModelProperty(value = "")

  

  public List<TrackedItemOAPI> getTrackedItemList() {
    return trackedItemList;
  }

  public void setTrackedItemList(List<TrackedItemOAPI> trackedItemList) {
    this.trackedItemList = trackedItemList;
  }

  public TrackedItemsOAPI operationStatus(OperationStatusOAPI operationStatus) {
    this.operationStatus = operationStatus;
    return this;
  }

  /**
   * Get operationStatus
   * @return operationStatus
  */
  @ApiModelProperty(value = "")

  

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
    TrackedItemsOAPI trackedItemsOAPI = (TrackedItemsOAPI) o;
    return Objects.equals(this.trackedItemList, trackedItemsOAPI.trackedItemList) &&
        Objects.equals(this.operationStatus, trackedItemsOAPI.operationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackedItemList, operationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedItemsOAPI {\n");

    sb.append("    trackedItemList: ").append(toIndentedString(trackedItemList)).append("\n");
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

