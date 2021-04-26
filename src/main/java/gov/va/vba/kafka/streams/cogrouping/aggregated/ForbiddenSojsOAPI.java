package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Model for list of forbidden sojs returned from BGS
 */
@ApiModel(description = "Model for list of forbidden sojs returned from BGS")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class ForbiddenSojsOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("forbiddenSojsList")
  
  private List<ForbiddenSojOAPI> forbiddenSojsList = null;

  @JsonProperty("operationStatus")
  private OperationStatusOAPI operationStatus = null;

  public ForbiddenSojsOAPI forbiddenSojsList(List<ForbiddenSojOAPI> forbiddenSojsList) {
    this.forbiddenSojsList = forbiddenSojsList;
    return this;
  }

  public ForbiddenSojsOAPI addForbiddenSojsListItem(ForbiddenSojOAPI forbiddenSojsListItem) {
    if (this.forbiddenSojsList == null) {
      this.forbiddenSojsList = new ArrayList<>();
    }
    this.forbiddenSojsList.add(forbiddenSojsListItem);
    return this;
  }

  /**
   * Get forbiddenSojsList
   * @return forbiddenSojsList
  */
  @ApiModelProperty(value = "")

  

  public List<ForbiddenSojOAPI> getForbiddenSojsList() {
    return forbiddenSojsList;
  }

  public void setForbiddenSojsList(List<ForbiddenSojOAPI> forbiddenSojsList) {
    this.forbiddenSojsList = forbiddenSojsList;
  }

  public ForbiddenSojsOAPI operationStatus(OperationStatusOAPI operationStatus) {
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
    ForbiddenSojsOAPI forbiddenSojsOAPI = (ForbiddenSojsOAPI) o;
    return Objects.equals(this.forbiddenSojsList, forbiddenSojsOAPI.forbiddenSojsList) &&
        Objects.equals(this.operationStatus, forbiddenSojsOAPI.operationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forbiddenSojsList, operationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForbiddenSojsOAPI {\n");

    sb.append("    forbiddenSojsList: ").append(toIndentedString(forbiddenSojsList)).append("\n");
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

