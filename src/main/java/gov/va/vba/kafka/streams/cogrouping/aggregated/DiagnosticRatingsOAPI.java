package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Model for list of c returned from BGS
 */
@ApiModel(description = "Model for list of c returned from BGS")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class DiagnosticRatingsOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("diagnosticRatingsList")
  private List<DiagnosticRatingOAPI> diagnosticRatingsList = null;

  @JsonProperty("operationStatus")
  private OperationStatusOAPI operationStatus = null;

  public DiagnosticRatingsOAPI diagnosticRatingsList(List<DiagnosticRatingOAPI> diagnosticRatingsList) {
    this.diagnosticRatingsList = diagnosticRatingsList;
    return this;
  }

  public DiagnosticRatingsOAPI addDiagnosticRatingsListItem(DiagnosticRatingOAPI diagnosticRatingsListItem) {
    if (this.diagnosticRatingsList == null) {
      this.diagnosticRatingsList = new ArrayList<>();
    }
    this.diagnosticRatingsList.add(diagnosticRatingsListItem);
    return this;
  }

  /**
   * Get diagnosticRatingsList
   * @return diagnosticRatingsList
  */
  @ApiModelProperty(value = "")

  public List<DiagnosticRatingOAPI> getDiagnosticRatingsList() {
    return diagnosticRatingsList;
  }

  public void setDiagnosticRatingsList(List<DiagnosticRatingOAPI> diagnosticRatingsList) {
    this.diagnosticRatingsList = diagnosticRatingsList;
  }

  public DiagnosticRatingsOAPI operationStatus(OperationStatusOAPI operationStatus) {
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
    DiagnosticRatingsOAPI diagnosticRatingsOAPI = (DiagnosticRatingsOAPI) o;
    return Objects.equals(this.diagnosticRatingsList, diagnosticRatingsOAPI.diagnosticRatingsList) &&
        Objects.equals(this.operationStatus, diagnosticRatingsOAPI.operationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagnosticRatingsList, operationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticRatingsOAPI {\n");

    sb.append("    diagnosticRatingsList: ").append(toIndentedString(diagnosticRatingsList)).append("\n");
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

