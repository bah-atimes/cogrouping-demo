package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Model for list of military services returned from BGS
 */
@ApiModel(description = "Model for list of military services returned from BGS")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class MilitaryServicesOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("militaryServicesList")
  
  private List<MilitaryServiceOAPI> militaryServicesList = null;

  @JsonProperty("operationStatus")
  private OperationStatusOAPI operationStatus = null;

  public MilitaryServicesOAPI militaryServicesList(List<MilitaryServiceOAPI> militaryServicesList) {
    this.militaryServicesList = militaryServicesList;
    return this;
  }

  public MilitaryServicesOAPI addMilitaryServicesListItem(MilitaryServiceOAPI militaryServicesListItem) {
    if (this.militaryServicesList == null) {
      this.militaryServicesList = new ArrayList<>();
    }
    this.militaryServicesList.add(militaryServicesListItem);
    return this;
  }

  /**
   * Get militaryServicesList
   * @return militaryServicesList
  */
  @ApiModelProperty(value = "")

  

  public List<MilitaryServiceOAPI> getMilitaryServicesList() {
    return militaryServicesList;
  }

  public void setMilitaryServicesList(List<MilitaryServiceOAPI> militaryServicesList) {
    this.militaryServicesList = militaryServicesList;
  }

  public MilitaryServicesOAPI operationStatus(OperationStatusOAPI operationStatus) {
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
    MilitaryServicesOAPI militaryServicesOAPI = (MilitaryServicesOAPI) o;
    return Objects.equals(this.militaryServicesList, militaryServicesOAPI.militaryServicesList) &&
        Objects.equals(this.operationStatus, militaryServicesOAPI.operationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(militaryServicesList, operationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MilitaryServicesOAPI {\n");

    sb.append("    militaryServicesList: ").append(toIndentedString(militaryServicesList)).append("\n");
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

