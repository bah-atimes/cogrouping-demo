package gov.va.vba.kafka.streams.cogrouping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Model for list of special issues returned from BGS
 */
@ApiModel(description = "Model for list of special issues returned from BGS")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class SpecialIssuesOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("specialIssuesList")
  
  private List<SpecialIssueOAPI> specialIssuesList = null;

  @JsonProperty("operationStatus")
  private OperationStatusOAPI operationStatus = null;

  public SpecialIssuesOAPI specialIssuesList(List<SpecialIssueOAPI> specialIssuesList) {
    this.specialIssuesList = specialIssuesList;
    return this;
  }

  public SpecialIssuesOAPI addSpecialIssuesListItem(SpecialIssueOAPI specialIssuesListItem) {
    if (this.specialIssuesList == null) {
      this.specialIssuesList = new ArrayList<>();
    }
    this.specialIssuesList.add(specialIssuesListItem);
    return this;
  }

  /**
   * Get specialIssuesList
   * @return specialIssuesList
  */
  @ApiModelProperty(value = "")

  

  public List<SpecialIssueOAPI> getSpecialIssuesList() {
    return specialIssuesList;
  }

  public void setSpecialIssuesList(List<SpecialIssueOAPI> specialIssuesList) {
    this.specialIssuesList = specialIssuesList;
  }

  public SpecialIssuesOAPI operationStatus(OperationStatusOAPI operationStatus) {
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
    SpecialIssuesOAPI specialIssuesOAPI = (SpecialIssuesOAPI) o;
    return Objects.equals(this.specialIssuesList, specialIssuesOAPI.specialIssuesList) &&
        Objects.equals(this.operationStatus, specialIssuesOAPI.operationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialIssuesList, operationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialIssuesOAPI {\n");

    sb.append("    specialIssuesList: ").append(toIndentedString(specialIssuesList)).append("\n");
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

