package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Object that describes the operation&#39;s status
 */
@ApiModel(description = "Object that describes the operation's status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class OperationStatusOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("operationStatusCodeOAPI")
  private OperationStatusCodeOAPI operationStatusCodeOAPI = null;

  @JsonProperty("operationStatusMessage")
  private String operationStatusMessage;

  @JsonProperty("failedItems")
  
  private List<ItemStatusOAPI> failedItems = null;

  public OperationStatusOAPI operationStatusCodeOAPI(OperationStatusCodeOAPI operationStatusCodeOAPI) {
    this.operationStatusCodeOAPI = operationStatusCodeOAPI;
    return this;
  }

  /**
   * Get operationStatusCodeOAPI
   * @return operationStatusCodeOAPI
  */
  @ApiModelProperty(value = "")

  

  public OperationStatusCodeOAPI getOperationStatusCodeOAPI() {
    return operationStatusCodeOAPI;
  }

  public void setOperationStatusCodeOAPI(OperationStatusCodeOAPI operationStatusCodeOAPI) {
    this.operationStatusCodeOAPI = operationStatusCodeOAPI;
  }

  public OperationStatusOAPI operationStatusMessage(String operationStatusMessage) {
    this.operationStatusMessage = operationStatusMessage;
    return this;
  }

  /**
   * Get operationStatusMessage
   * @return operationStatusMessage
  */
  @ApiModelProperty(value = "")


  public String getOperationStatusMessage() {
    return operationStatusMessage;
  }

  public void setOperationStatusMessage(String operationStatusMessage) {
    this.operationStatusMessage = operationStatusMessage;
  }

  public OperationStatusOAPI failedItems(List<ItemStatusOAPI> failedItems) {
    this.failedItems = failedItems;
    return this;
  }

  public OperationStatusOAPI addFailedItemsItem(ItemStatusOAPI failedItemsItem) {
    if (this.failedItems == null) {
      this.failedItems = new ArrayList<>();
    }
    this.failedItems.add(failedItemsItem);
    return this;
  }

  /**
   * Get failedItems
   * @return failedItems
  */
  @ApiModelProperty(value = "")

  

  public List<ItemStatusOAPI> getFailedItems() {
    return failedItems;
  }

  public void setFailedItems(List<ItemStatusOAPI> failedItems) {
    this.failedItems = failedItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationStatusOAPI operationStatusOAPI = (OperationStatusOAPI) o;
    return Objects.equals(this.operationStatusCodeOAPI, operationStatusOAPI.operationStatusCodeOAPI) &&
        Objects.equals(this.operationStatusMessage, operationStatusOAPI.operationStatusMessage) &&
        Objects.equals(this.failedItems, operationStatusOAPI.failedItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationStatusCodeOAPI, operationStatusMessage, failedItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationStatusOAPI {\n");

    sb.append("    operationStatusCodeOAPI: ").append(toIndentedString(operationStatusCodeOAPI)).append("\n");
    sb.append("    operationStatusMessage: ").append(toIndentedString(operationStatusMessage)).append("\n");
    sb.append("    failedItems: ").append(toIndentedString(failedItems)).append("\n");
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

