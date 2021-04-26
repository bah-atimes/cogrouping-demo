package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Model for list of flashes returned from BGS
 */
@ApiModel(description = "Model for list of flashes returned from BGS")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class FlashesOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("flashesList")
  private List<FlashOAPI> flashesList = null;

  @JsonProperty("operationStatus")
  private OperationStatusOAPI operationStatus = null;

  public FlashesOAPI flashesList(List<FlashOAPI> flashesList) {
    this.flashesList = flashesList;
    return this;
  }

  public FlashesOAPI addFlashesListItem(FlashOAPI flashesListItem) {
    if (this.flashesList == null) {
      this.flashesList = new ArrayList<>();
    }
    this.flashesList.add(flashesListItem);
    return this;
  }

  /**
   * Get flashesList
   * @return flashesList
  */
  @ApiModelProperty(value = "")

  public List<FlashOAPI> getFlashesList() {
    return flashesList;
  }

  public void setFlashesList(List<FlashOAPI> flashesList) {
    this.flashesList = flashesList;
  }

  public FlashesOAPI operationStatus(OperationStatusOAPI operationStatus) {
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
    FlashesOAPI flashesOAPI = (FlashesOAPI) o;
    return Objects.equals(this.flashesList, flashesOAPI.flashesList) &&
        Objects.equals(this.operationStatus, flashesOAPI.operationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flashesList, operationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlashesOAPI {\n");

    sb.append("    flashesList: ").append(toIndentedString(flashesList)).append("\n");
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

