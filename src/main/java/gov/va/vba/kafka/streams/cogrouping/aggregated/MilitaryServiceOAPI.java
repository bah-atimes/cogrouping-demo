package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * MilitaryServiceOAPI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class MilitaryServiceOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("branchName")
  private String branchName;

  @JsonProperty("enteredOnActiveDutyDate")
  private OffsetDateTime enteredOnActiveDutyDate;

  @JsonProperty("otherBranchName")
  private String otherBranchName;

  @JsonProperty("personId")
  private Long personId;

  @JsonProperty("releasedFromActiveDutyDate")
  private OffsetDateTime releasedFromActiveDutyDate;

  @JsonProperty("tourNumber")
  private Integer tourNumber;

  public MilitaryServiceOAPI branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * Get branchName
   * @return branchName
  */
  @ApiModelProperty(value = "")


  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public MilitaryServiceOAPI enteredOnActiveDutyDate(OffsetDateTime enteredOnActiveDutyDate) {
    this.enteredOnActiveDutyDate = enteredOnActiveDutyDate;
    return this;
  }

  /**
   * Get enteredOnActiveDutyDate
   * @return enteredOnActiveDutyDate
  */
  @ApiModelProperty(value = "")

  

  public OffsetDateTime getEnteredOnActiveDutyDate() {
    return enteredOnActiveDutyDate;
  }

  public void setEnteredOnActiveDutyDate(OffsetDateTime enteredOnActiveDutyDate) {
    this.enteredOnActiveDutyDate = enteredOnActiveDutyDate;
  }

  public MilitaryServiceOAPI otherBranchName(String otherBranchName) {
    this.otherBranchName = otherBranchName;
    return this;
  }

  /**
   * Get otherBranchName
   * @return otherBranchName
  */
  @ApiModelProperty(value = "")


  public String getOtherBranchName() {
    return otherBranchName;
  }

  public void setOtherBranchName(String otherBranchName) {
    this.otherBranchName = otherBranchName;
  }

  public MilitaryServiceOAPI personId(Long personId) {
    this.personId = personId;
    return this;
  }

  /**
   * Get personId
   * @return personId
  */
  @ApiModelProperty(value = "")


  public Long getPersonId() {
    return personId;
  }

  public void setPersonId(Long personId) {
    this.personId = personId;
  }

  public MilitaryServiceOAPI releasedFromActiveDutyDate(OffsetDateTime releasedFromActiveDutyDate) {
    this.releasedFromActiveDutyDate = releasedFromActiveDutyDate;
    return this;
  }

  /**
   * Get releasedFromActiveDutyDate
   * @return releasedFromActiveDutyDate
  */
  @ApiModelProperty(value = "")

  

  public OffsetDateTime getReleasedFromActiveDutyDate() {
    return releasedFromActiveDutyDate;
  }

  public void setReleasedFromActiveDutyDate(OffsetDateTime releasedFromActiveDutyDate) {
    this.releasedFromActiveDutyDate = releasedFromActiveDutyDate;
  }

  public MilitaryServiceOAPI tourNumber(Integer tourNumber) {
    this.tourNumber = tourNumber;
    return this;
  }

  /**
   * Get tourNumber
   * @return tourNumber
  */
  @ApiModelProperty(value = "")


  public Integer getTourNumber() {
    return tourNumber;
  }

  public void setTourNumber(Integer tourNumber) {
    this.tourNumber = tourNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MilitaryServiceOAPI militaryServiceOAPI = (MilitaryServiceOAPI) o;
    return Objects.equals(this.branchName, militaryServiceOAPI.branchName) &&
        Objects.equals(this.enteredOnActiveDutyDate, militaryServiceOAPI.enteredOnActiveDutyDate) &&
        Objects.equals(this.otherBranchName, militaryServiceOAPI.otherBranchName) &&
        Objects.equals(this.personId, militaryServiceOAPI.personId) &&
        Objects.equals(this.releasedFromActiveDutyDate, militaryServiceOAPI.releasedFromActiveDutyDate) &&
        Objects.equals(this.tourNumber, militaryServiceOAPI.tourNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchName, enteredOnActiveDutyDate, otherBranchName, personId, releasedFromActiveDutyDate, tourNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MilitaryServiceOAPI {\n");

    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    enteredOnActiveDutyDate: ").append(toIndentedString(enteredOnActiveDutyDate)).append("\n");
    sb.append("    otherBranchName: ").append(toIndentedString(otherBranchName)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    releasedFromActiveDutyDate: ").append(toIndentedString(releasedFromActiveDutyDate)).append("\n");
    sb.append("    tourNumber: ").append(toIndentedString(tourNumber)).append("\n");
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

