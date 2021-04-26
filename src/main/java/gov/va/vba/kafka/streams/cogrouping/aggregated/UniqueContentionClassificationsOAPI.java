package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Model for list of unique contention classifications returned from BGS
 */
@ApiModel(description = "Model for list of unique contention classifications returned from BGS")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class UniqueContentionClassificationsOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("uniqueContentionClassificationList")
  
  private List<UniqueContentionClassificationOAPI> uniqueContentionClassificationList = null;

  @JsonProperty("operationStatus")
  private OperationStatusOAPI operationStatus = null;

  public UniqueContentionClassificationsOAPI uniqueContentionClassificationList(List<UniqueContentionClassificationOAPI> uniqueContentionClassificationList) {
    this.uniqueContentionClassificationList = uniqueContentionClassificationList;
    return this;
  }

  public UniqueContentionClassificationsOAPI addUniqueContentionClassificationListItem(UniqueContentionClassificationOAPI uniqueContentionClassificationListItem) {
    if (this.uniqueContentionClassificationList == null) {
      this.uniqueContentionClassificationList = new ArrayList<>();
    }
    this.uniqueContentionClassificationList.add(uniqueContentionClassificationListItem);
    return this;
  }

  /**
   * Get uniqueContentionClassificationList
   * @return uniqueContentionClassificationList
  */
  @ApiModelProperty(value = "")

  

  public List<UniqueContentionClassificationOAPI> getUniqueContentionClassificationList() {
    return uniqueContentionClassificationList;
  }

  public void setUniqueContentionClassificationList(List<UniqueContentionClassificationOAPI> uniqueContentionClassificationList) {
    this.uniqueContentionClassificationList = uniqueContentionClassificationList;
  }

  public UniqueContentionClassificationsOAPI operationStatus(OperationStatusOAPI operationStatus) {
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
    UniqueContentionClassificationsOAPI uniqueContentionClassificationsOAPI = (UniqueContentionClassificationsOAPI) o;
    return Objects.equals(this.uniqueContentionClassificationList, uniqueContentionClassificationsOAPI.uniqueContentionClassificationList) &&
        Objects.equals(this.operationStatus, uniqueContentionClassificationsOAPI.operationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueContentionClassificationList, operationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniqueContentionClassificationsOAPI {\n");

    sb.append("    uniqueContentionClassificationList: ").append(toIndentedString(uniqueContentionClassificationList)).append("\n");
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

