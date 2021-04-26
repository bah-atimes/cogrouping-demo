package gov.va.vba.kafka.streams.cogrouping.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * AggregatedPerson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class AggregatedPerson extends AggregatedComponent implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("personId")
  private Long personId;

  @JsonProperty("diagnosticRatings")
  private DiagnosticRatingsOAPI diagnosticRatings = null;

  @JsonProperty("flashes")
  private FlashesOAPI flashes = null;

  @JsonProperty("militaryService")
  private MilitaryServicesOAPI militaryService = null;

  @JsonProperty("forbiddenSojs")
  private ForbiddenSojsOAPI forbiddenSojs = null;

  @JsonProperty("person")
  private PersonOAPI person = null;

  public AggregatedPerson personId(Long personId) {
    this.personId = personId;
    return this;
  }



  public Long getPersonId() {
    return personId;
  }

  public void setPersonId(Long personId) {
    this.personId = personId;
  }

  public AggregatedPerson diagnosticRatings(DiagnosticRatingsOAPI diagnosticRatings) {
    this.diagnosticRatings = diagnosticRatings;
    return this;
  }

  public DiagnosticRatingsOAPI getDiagnosticRatings() {
    return diagnosticRatings;
  }

  public void setDiagnosticRatings(DiagnosticRatingsOAPI diagnosticRatings) {
    this.diagnosticRatings = diagnosticRatings;
  }

  public AggregatedPerson flashes(FlashesOAPI flashes) {
    this.flashes = flashes;
    return this;
  }

  public FlashesOAPI getFlashes() {
    return flashes;
  }

  public void setFlashes(FlashesOAPI flashes) {
    this.flashes = flashes;
  }

  public AggregatedPerson militaryService(MilitaryServicesOAPI militaryService) {
    this.militaryService = militaryService;
    return this;
  }

  public MilitaryServicesOAPI getMilitaryService() {
    return militaryService;
  }

  public void setMilitaryService(MilitaryServicesOAPI militaryService) {
    this.militaryService = militaryService;
  }

  public AggregatedPerson forbiddenSojs(ForbiddenSojsOAPI forbiddenSojs) {
    this.forbiddenSojs = forbiddenSojs;
    return this;
  }

  public ForbiddenSojsOAPI getForbiddenSojs() {
    return forbiddenSojs;
  }

  public void setForbiddenSojs(ForbiddenSojsOAPI forbiddenSojs) {
    this.forbiddenSojs = forbiddenSojs;
  }

  public AggregatedPerson person(PersonOAPI person) {
    this.person = person;
    return this;
  }

  public PersonOAPI getPerson() {
    return person;
  }

  public void setPerson(PersonOAPI person) {
    this.person = person;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedPerson aggregatedPerson = (AggregatedPerson) o;
    return Objects.equals(this.personId, aggregatedPerson.personId) &&
        Objects.equals(this.diagnosticRatings, aggregatedPerson.diagnosticRatings) &&
        Objects.equals(this.flashes, aggregatedPerson.flashes) &&
        Objects.equals(this.militaryService, aggregatedPerson.militaryService) &&
        Objects.equals(this.forbiddenSojs, aggregatedPerson.forbiddenSojs) &&
        Objects.equals(this.person, aggregatedPerson.person) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, diagnosticRatings, flashes, militaryService, forbiddenSojs, person, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedPerson {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    diagnosticRatings: ").append(toIndentedString(diagnosticRatings)).append("\n");
    sb.append("    flashes: ").append(toIndentedString(flashes)).append("\n");
    sb.append("    militaryService: ").append(toIndentedString(militaryService)).append("\n");
    sb.append("    forbiddenSojs: ").append(toIndentedString(forbiddenSojs)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
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

