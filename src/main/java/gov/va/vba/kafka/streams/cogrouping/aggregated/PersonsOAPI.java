package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Model for list of persons returned from BGS
 */
@ApiModel(description = "Model for list of persons returned from BGS")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class PersonsOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("personList")
  
  private List<PersonOAPI> personList = null;

  @JsonProperty("operationStatus")
  private OperationStatusOAPI operationStatus = null;

  public PersonsOAPI personList(List<PersonOAPI> personList) {
    this.personList = personList;
    return this;
  }

  public PersonsOAPI addPersonListItem(PersonOAPI personListItem) {
    if (this.personList == null) {
      this.personList = new ArrayList<>();
    }
    this.personList.add(personListItem);
    return this;
  }

  /**
   * Get personList
   * @return personList
  */
  @ApiModelProperty(value = "")

  

  public List<PersonOAPI> getPersonList() {
    return personList;
  }

  public void setPersonList(List<PersonOAPI> personList) {
    this.personList = personList;
  }

  public PersonsOAPI operationStatus(OperationStatusOAPI operationStatus) {
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
    PersonsOAPI personsOAPI = (PersonsOAPI) o;
    return Objects.equals(this.personList, personsOAPI.personList) &&
        Objects.equals(this.operationStatus, personsOAPI.operationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personList, operationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonsOAPI {\n");

    sb.append("    personList: ").append(toIndentedString(personList)).append("\n");
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

