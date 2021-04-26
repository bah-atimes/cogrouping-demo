package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * PersonOAPI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class PersonOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("allowPoaAccess")
  private String allowPoaAccess;

  @JsonProperty("awardSoj")
  private String awardSoj;

  @JsonProperty("city")
  private String city;

  @JsonProperty("country")
  private String country;

  @JsonProperty("dateOfBirth")
  private OffsetDateTime dateOfBirth;

  @JsonProperty("dateOfDeath")
  private OffsetDateTime dateOfDeath;

  @JsonProperty("fileNumber")
  private String fileNumber;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("middleName")
  private String middleName;

  @JsonProperty("personId")
  private Long personId;

  @JsonProperty("poaCode")
  private String poaCode;

  @JsonProperty("securityLevel")
  private String securityLevel;

  @JsonProperty("sensitivityReasonTypeName")
  private String sensitivityReasonTypeName;

  @JsonProperty("soj")
  private String soj;

  @JsonProperty("ssn")
  private String ssn;

  @JsonProperty("state")
  private String state;

  @JsonProperty("syncId")
  private Long syncId;

  @JsonProperty("terminalDigit")
  private String terminalDigit;

  @JsonProperty("veteranIndicator")
  private String veteranIndicator;

  @JsonProperty("zipCode")
  private String zipCode;

  public PersonOAPI allowPoaAccess(String allowPoaAccess) {
    this.allowPoaAccess = allowPoaAccess;
    return this;
  }

  /**
   * Get allowPoaAccess
   * @return allowPoaAccess
  */
  @ApiModelProperty(value = "")


  public String getAllowPoaAccess() {
    return allowPoaAccess;
  }

  public void setAllowPoaAccess(String allowPoaAccess) {
    this.allowPoaAccess = allowPoaAccess;
  }

  public PersonOAPI awardSoj(String awardSoj) {
    this.awardSoj = awardSoj;
    return this;
  }

  /**
   * Get awardSoj
   * @return awardSoj
  */
  @ApiModelProperty(value = "")


  public String getAwardSoj() {
    return awardSoj;
  }

  public void setAwardSoj(String awardSoj) {
    this.awardSoj = awardSoj;
  }

  public PersonOAPI city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PersonOAPI country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @ApiModelProperty(value = "")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PersonOAPI dateOfBirth(OffsetDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @ApiModelProperty(value = "")

  

  public OffsetDateTime getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(OffsetDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public PersonOAPI dateOfDeath(OffsetDateTime dateOfDeath) {
    this.dateOfDeath = dateOfDeath;
    return this;
  }

  /**
   * Get dateOfDeath
   * @return dateOfDeath
  */
  @ApiModelProperty(value = "")

  

  public OffsetDateTime getDateOfDeath() {
    return dateOfDeath;
  }

  public void setDateOfDeath(OffsetDateTime dateOfDeath) {
    this.dateOfDeath = dateOfDeath;
  }

  public PersonOAPI fileNumber(String fileNumber) {
    this.fileNumber = fileNumber;
    return this;
  }

  /**
   * Get fileNumber
   * @return fileNumber
  */
  @ApiModelProperty(value = "")


  public String getFileNumber() {
    return fileNumber;
  }

  public void setFileNumber(String fileNumber) {
    this.fileNumber = fileNumber;
  }

  public PersonOAPI firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PersonOAPI lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PersonOAPI middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
  */
  @ApiModelProperty(value = "")


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public PersonOAPI personId(Long personId) {
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

  public PersonOAPI poaCode(String poaCode) {
    this.poaCode = poaCode;
    return this;
  }

  /**
   * Get poaCode
   * @return poaCode
  */
  @ApiModelProperty(value = "")


  public String getPoaCode() {
    return poaCode;
  }

  public void setPoaCode(String poaCode) {
    this.poaCode = poaCode;
  }

  public PersonOAPI securityLevel(String securityLevel) {
    this.securityLevel = securityLevel;
    return this;
  }

  /**
   * Get securityLevel
   * @return securityLevel
  */
  @ApiModelProperty(value = "")


  public String getSecurityLevel() {
    return securityLevel;
  }

  public void setSecurityLevel(String securityLevel) {
    this.securityLevel = securityLevel;
  }

  public PersonOAPI sensitivityReasonTypeName(String sensitivityReasonTypeName) {
    this.sensitivityReasonTypeName = sensitivityReasonTypeName;
    return this;
  }

  /**
   * Get sensitivityReasonTypeName
   * @return sensitivityReasonTypeName
  */
  @ApiModelProperty(value = "")


  public String getSensitivityReasonTypeName() {
    return sensitivityReasonTypeName;
  }

  public void setSensitivityReasonTypeName(String sensitivityReasonTypeName) {
    this.sensitivityReasonTypeName = sensitivityReasonTypeName;
  }

  public PersonOAPI soj(String soj) {
    this.soj = soj;
    return this;
  }

  /**
   * Get soj
   * @return soj
  */
  @ApiModelProperty(value = "")


  public String getSoj() {
    return soj;
  }

  public void setSoj(String soj) {
    this.soj = soj;
  }

  public PersonOAPI ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * Get ssn
   * @return ssn
  */
  @ApiModelProperty(value = "")


  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public PersonOAPI state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PersonOAPI syncId(Long syncId) {
    this.syncId = syncId;
    return this;
  }

  /**
   * Get syncId
   * @return syncId
  */
  @ApiModelProperty(value = "")


  public Long getSyncId() {
    return syncId;
  }

  public void setSyncId(Long syncId) {
    this.syncId = syncId;
  }

  public PersonOAPI terminalDigit(String terminalDigit) {
    this.terminalDigit = terminalDigit;
    return this;
  }

  /**
   * Get terminalDigit
   * @return terminalDigit
  */
  @ApiModelProperty(value = "")


  public String getTerminalDigit() {
    return terminalDigit;
  }

  public void setTerminalDigit(String terminalDigit) {
    this.terminalDigit = terminalDigit;
  }

  public PersonOAPI veteranIndicator(String veteranIndicator) {
    this.veteranIndicator = veteranIndicator;
    return this;
  }

  /**
   * Get veteranIndicator
   * @return veteranIndicator
  */
  @ApiModelProperty(value = "")


  public String getVeteranIndicator() {
    return veteranIndicator;
  }

  public void setVeteranIndicator(String veteranIndicator) {
    this.veteranIndicator = veteranIndicator;
  }

  public PersonOAPI zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
  */
  @ApiModelProperty(value = "")


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonOAPI personOAPI = (PersonOAPI) o;
    return Objects.equals(this.allowPoaAccess, personOAPI.allowPoaAccess) &&
        Objects.equals(this.awardSoj, personOAPI.awardSoj) &&
        Objects.equals(this.city, personOAPI.city) &&
        Objects.equals(this.country, personOAPI.country) &&
        Objects.equals(this.dateOfBirth, personOAPI.dateOfBirth) &&
        Objects.equals(this.dateOfDeath, personOAPI.dateOfDeath) &&
        Objects.equals(this.fileNumber, personOAPI.fileNumber) &&
        Objects.equals(this.firstName, personOAPI.firstName) &&
        Objects.equals(this.lastName, personOAPI.lastName) &&
        Objects.equals(this.middleName, personOAPI.middleName) &&
        Objects.equals(this.personId, personOAPI.personId) &&
        Objects.equals(this.poaCode, personOAPI.poaCode) &&
        Objects.equals(this.securityLevel, personOAPI.securityLevel) &&
        Objects.equals(this.sensitivityReasonTypeName, personOAPI.sensitivityReasonTypeName) &&
        Objects.equals(this.soj, personOAPI.soj) &&
        Objects.equals(this.ssn, personOAPI.ssn) &&
        Objects.equals(this.state, personOAPI.state) &&
        Objects.equals(this.syncId, personOAPI.syncId) &&
        Objects.equals(this.terminalDigit, personOAPI.terminalDigit) &&
        Objects.equals(this.veteranIndicator, personOAPI.veteranIndicator) &&
        Objects.equals(this.zipCode, personOAPI.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowPoaAccess, awardSoj, city, country, dateOfBirth, dateOfDeath, fileNumber, firstName, lastName, middleName, personId, poaCode, securityLevel, sensitivityReasonTypeName, soj, ssn, state, syncId, terminalDigit, veteranIndicator, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonOAPI {\n");

    sb.append("    allowPoaAccess: ").append(toIndentedString(allowPoaAccess)).append("\n");
    sb.append("    awardSoj: ").append(toIndentedString(awardSoj)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    dateOfDeath: ").append(toIndentedString(dateOfDeath)).append("\n");
    sb.append("    fileNumber: ").append(toIndentedString(fileNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    poaCode: ").append(toIndentedString(poaCode)).append("\n");
    sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
    sb.append("    sensitivityReasonTypeName: ").append(toIndentedString(sensitivityReasonTypeName)).append("\n");
    sb.append("    soj: ").append(toIndentedString(soj)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    syncId: ").append(toIndentedString(syncId)).append("\n");
    sb.append("    terminalDigit: ").append(toIndentedString(terminalDigit)).append("\n");
    sb.append("    veteranIndicator: ").append(toIndentedString(veteranIndicator)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

