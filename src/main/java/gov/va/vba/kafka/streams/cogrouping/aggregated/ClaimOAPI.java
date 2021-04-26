package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ClaimOAPI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class ClaimOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("claimDate")
  private OffsetDateTime claimDate;

  @JsonProperty("claimId")
  private Long claimId;

  @JsonProperty("claimLevelStatusCode")
  private String claimLevelStatusCode;

  @JsonProperty("claimLifeCycleStatusChangeDate")
  private OffsetDateTime claimLifeCycleStatusChangeDate;

  @JsonProperty("claimLifecycleStatusName")
  private String claimLifecycleStatusName;

  @JsonProperty("claimPoaAccess")
  private String claimPoaAccess;

  @JsonProperty("claimPoaCode")
  private String claimPoaCode;

  @JsonProperty("claimSoj")
  private String claimSoj;

  @JsonProperty("claimTypeCode")
  private String claimTypeCode;

  @JsonProperty("claimantPersonId")
  private Long claimantPersonId;

  @JsonProperty("contentionsCount")
  private Long contentionsCount;

  @JsonProperty("epCode")
  private String epCode;

  @JsonProperty("establishmentDate")
  private OffsetDateTime establishmentDate;

  @JsonProperty("intakeSite")
  private String intakeSite;

  @JsonProperty("organizationName")
  private String organizationName;

  @JsonProperty("organizationSoj")
  private String organizationSoj;

  @JsonProperty("payeeCode")
  private String payeeCode;

  @JsonProperty("preDischargeInd")
  private String preDischargeInd;

  @JsonProperty("preDischargeTypeCode")
  private String preDischargeTypeCode;

  @JsonProperty("priority")
  private String priority;

  @JsonProperty("programTypeCode")
  private String programTypeCode;

  @JsonProperty("serviceTypeCode")
  private String serviceTypeCode;

  @JsonProperty("submitterApplicationCode")
  private String submitterApplicationCode;

  @JsonProperty("submitterRoleCode")
  private String submitterRoleCode;

  @JsonProperty("suspenseDate")
  private OffsetDateTime suspenseDate;

  @JsonProperty("suspenseReasonCode")
  private String suspenseReasonCode;

  @JsonProperty("suspenseReasonComments")
  private String suspenseReasonComments;

  @JsonProperty("syncId")
  private Long syncId;

  @JsonProperty("temporaryClaimSoj")
  private String temporaryClaimSoj;

  @JsonProperty("veteranPersonId")
  private Long veteranPersonId;

  public ClaimOAPI claimDate(OffsetDateTime claimDate) {
    this.claimDate = claimDate;
    return this;
  }

  public OffsetDateTime getClaimDate() {
    return claimDate;
  }

  public void setClaimDate(OffsetDateTime claimDate) {
    this.claimDate = claimDate;
  }

  public ClaimOAPI claimId(Long claimId) {
    this.claimId = claimId;
    return this;
  }

  public Long getClaimId() {
    return claimId;
  }

  public void setClaimId(Long claimId) {
    this.claimId = claimId;
  }

  public ClaimOAPI claimLevelStatusCode(String claimLevelStatusCode) {
    this.claimLevelStatusCode = claimLevelStatusCode;
    return this;
  }

  public String getClaimLevelStatusCode() {
    return claimLevelStatusCode;
  }

  public void setClaimLevelStatusCode(String claimLevelStatusCode) {
    this.claimLevelStatusCode = claimLevelStatusCode;
  }

  public ClaimOAPI claimLifeCycleStatusChangeDate(OffsetDateTime claimLifeCycleStatusChangeDate) {
    this.claimLifeCycleStatusChangeDate = claimLifeCycleStatusChangeDate;
    return this;
  }

  public OffsetDateTime getClaimLifeCycleStatusChangeDate() {
    return claimLifeCycleStatusChangeDate;
  }

  public void setClaimLifeCycleStatusChangeDate(OffsetDateTime claimLifeCycleStatusChangeDate) {
    this.claimLifeCycleStatusChangeDate = claimLifeCycleStatusChangeDate;
  }

  public ClaimOAPI claimLifecycleStatusName(String claimLifecycleStatusName) {
    this.claimLifecycleStatusName = claimLifecycleStatusName;
    return this;
  }

  public String getClaimLifecycleStatusName() {
    return claimLifecycleStatusName;
  }

  public void setClaimLifecycleStatusName(String claimLifecycleStatusName) {
    this.claimLifecycleStatusName = claimLifecycleStatusName;
  }

  public ClaimOAPI claimPoaAccess(String claimPoaAccess) {
    this.claimPoaAccess = claimPoaAccess;
    return this;
  }

  public String getClaimPoaAccess() {
    return claimPoaAccess;
  }

  public void setClaimPoaAccess(String claimPoaAccess) {
    this.claimPoaAccess = claimPoaAccess;
  }

  public ClaimOAPI claimPoaCode(String claimPoaCode) {
    this.claimPoaCode = claimPoaCode;
    return this;
  }

  public String getClaimPoaCode() {
    return claimPoaCode;
  }

  public void setClaimPoaCode(String claimPoaCode) {
    this.claimPoaCode = claimPoaCode;
  }

  public ClaimOAPI claimSoj(String claimSoj) {
    this.claimSoj = claimSoj;
    return this;
  }

  public String getClaimSoj() {
    return claimSoj;
  }

  public void setClaimSoj(String claimSoj) {
    this.claimSoj = claimSoj;
  }

  public ClaimOAPI claimTypeCode(String claimTypeCode) {
    this.claimTypeCode = claimTypeCode;
    return this;
  }

  public String getClaimTypeCode() {
    return claimTypeCode;
  }

  public void setClaimTypeCode(String claimTypeCode) {
    this.claimTypeCode = claimTypeCode;
  }

  public ClaimOAPI claimantPersonId(Long claimantPersonId) {
    this.claimantPersonId = claimantPersonId;
    return this;
  }

  public Long getClaimantPersonId() {
    return claimantPersonId;
  }

  public void setClaimantPersonId(Long claimantPersonId) {
    this.claimantPersonId = claimantPersonId;
  }

  public ClaimOAPI contentionsCount(Long contentionsCount) {
    this.contentionsCount = contentionsCount;
    return this;
  }

  public Long getContentionsCount() {
    return contentionsCount;
  }

  public void setContentionsCount(Long contentionsCount) {
    this.contentionsCount = contentionsCount;
  }

  public ClaimOAPI epCode(String epCode) {
    this.epCode = epCode;
    return this;
  }

  public String getEpCode() {
    return epCode;
  }

  public void setEpCode(String epCode) {
    this.epCode = epCode;
  }

  public ClaimOAPI establishmentDate(OffsetDateTime establishmentDate) {
    this.establishmentDate = establishmentDate;
    return this;
  }

  public OffsetDateTime getEstablishmentDate() {
    return establishmentDate;
  }

  public void setEstablishmentDate(OffsetDateTime establishmentDate) {
    this.establishmentDate = establishmentDate;
  }

  public ClaimOAPI intakeSite(String intakeSite) {
    this.intakeSite = intakeSite;
    return this;
  }

  public String getIntakeSite() {
    return intakeSite;
  }

  public void setIntakeSite(String intakeSite) {
    this.intakeSite = intakeSite;
  }

  public ClaimOAPI organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public ClaimOAPI organizationSoj(String organizationSoj) {
    this.organizationSoj = organizationSoj;
    return this;
  }

  public String getOrganizationSoj() {
    return organizationSoj;
  }

  public void setOrganizationSoj(String organizationSoj) {
    this.organizationSoj = organizationSoj;
  }

  public ClaimOAPI payeeCode(String payeeCode) {
    this.payeeCode = payeeCode;
    return this;
  }

  public String getPayeeCode() {
    return payeeCode;
  }

  public void setPayeeCode(String payeeCode) {
    this.payeeCode = payeeCode;
  }

  public ClaimOAPI preDischargeInd(String preDischargeInd) {
    this.preDischargeInd = preDischargeInd;
    return this;
  }

  public String getPreDischargeInd() {
    return preDischargeInd;
  }

  public void setPreDischargeInd(String preDischargeInd) {
    this.preDischargeInd = preDischargeInd;
  }

  public ClaimOAPI preDischargeTypeCode(String preDischargeTypeCode) {
    this.preDischargeTypeCode = preDischargeTypeCode;
    return this;
  }

  public String getPreDischargeTypeCode() {
    return preDischargeTypeCode;
  }

  public void setPreDischargeTypeCode(String preDischargeTypeCode) {
    this.preDischargeTypeCode = preDischargeTypeCode;
  }

  public ClaimOAPI priority(String priority) {
    this.priority = priority;
    return this;
  }

  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public ClaimOAPI programTypeCode(String programTypeCode) {
    this.programTypeCode = programTypeCode;
    return this;
  }

  public String getProgramTypeCode() {
    return programTypeCode;
  }

  public void setProgramTypeCode(String programTypeCode) {
    this.programTypeCode = programTypeCode;
  }

  public ClaimOAPI serviceTypeCode(String serviceTypeCode) {
    this.serviceTypeCode = serviceTypeCode;
    return this;
  }

  public String getServiceTypeCode() {
    return serviceTypeCode;
  }

  public void setServiceTypeCode(String serviceTypeCode) {
    this.serviceTypeCode = serviceTypeCode;
  }

  public ClaimOAPI submitterApplicationCode(String submitterApplicationCode) {
    this.submitterApplicationCode = submitterApplicationCode;
    return this;
  }

  public String getSubmitterApplicationCode() {
    return submitterApplicationCode;
  }

  public void setSubmitterApplicationCode(String submitterApplicationCode) {
    this.submitterApplicationCode = submitterApplicationCode;
  }

  public ClaimOAPI submitterRoleCode(String submitterRoleCode) {
    this.submitterRoleCode = submitterRoleCode;
    return this;
  }

  public String getSubmitterRoleCode() {
    return submitterRoleCode;
  }

  public void setSubmitterRoleCode(String submitterRoleCode) {
    this.submitterRoleCode = submitterRoleCode;
  }

  public ClaimOAPI suspenseDate(OffsetDateTime suspenseDate) {
    this.suspenseDate = suspenseDate;
    return this;
  }

  public OffsetDateTime getSuspenseDate() {
    return suspenseDate;
  }

  public void setSuspenseDate(OffsetDateTime suspenseDate) {
    this.suspenseDate = suspenseDate;
  }

  public ClaimOAPI suspenseReasonCode(String suspenseReasonCode) {
    this.suspenseReasonCode = suspenseReasonCode;
    return this;
  }

  public String getSuspenseReasonCode() {
    return suspenseReasonCode;
  }

  public void setSuspenseReasonCode(String suspenseReasonCode) {
    this.suspenseReasonCode = suspenseReasonCode;
  }

  public ClaimOAPI suspenseReasonComments(String suspenseReasonComments) {
    this.suspenseReasonComments = suspenseReasonComments;
    return this;
  }

  public String getSuspenseReasonComments() {
    return suspenseReasonComments;
  }

  public void setSuspenseReasonComments(String suspenseReasonComments) {
    this.suspenseReasonComments = suspenseReasonComments;
  }

  public ClaimOAPI syncId(Long syncId) {
    this.syncId = syncId;
    return this;
  }

  public Long getSyncId() {
    return syncId;
  }

  public void setSyncId(Long syncId) {
    this.syncId = syncId;
  }

  public ClaimOAPI temporaryClaimSoj(String temporaryClaimSoj) {
    this.temporaryClaimSoj = temporaryClaimSoj;
    return this;
  }

  public String getTemporaryClaimSoj() {
    return temporaryClaimSoj;
  }

  public void setTemporaryClaimSoj(String temporaryClaimSoj) {
    this.temporaryClaimSoj = temporaryClaimSoj;
  }

  public ClaimOAPI veteranPersonId(Long veteranPersonId) {
    this.veteranPersonId = veteranPersonId;
    return this;
  }

  public Long getVeteranPersonId() {
    return veteranPersonId;
  }

  public void setVeteranPersonId(Long veteranPersonId) {
    this.veteranPersonId = veteranPersonId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimOAPI claimOAPI = (ClaimOAPI) o;
    return Objects.equals(this.claimDate, claimOAPI.claimDate) &&
        Objects.equals(this.claimId, claimOAPI.claimId) &&
        Objects.equals(this.claimLevelStatusCode, claimOAPI.claimLevelStatusCode) &&
        Objects.equals(this.claimLifeCycleStatusChangeDate, claimOAPI.claimLifeCycleStatusChangeDate) &&
        Objects.equals(this.claimLifecycleStatusName, claimOAPI.claimLifecycleStatusName) &&
        Objects.equals(this.claimPoaAccess, claimOAPI.claimPoaAccess) &&
        Objects.equals(this.claimPoaCode, claimOAPI.claimPoaCode) &&
        Objects.equals(this.claimSoj, claimOAPI.claimSoj) &&
        Objects.equals(this.claimTypeCode, claimOAPI.claimTypeCode) &&
        Objects.equals(this.claimantPersonId, claimOAPI.claimantPersonId) &&
        Objects.equals(this.contentionsCount, claimOAPI.contentionsCount) &&
        Objects.equals(this.epCode, claimOAPI.epCode) &&
        Objects.equals(this.establishmentDate, claimOAPI.establishmentDate) &&
        Objects.equals(this.intakeSite, claimOAPI.intakeSite) &&
        Objects.equals(this.organizationName, claimOAPI.organizationName) &&
        Objects.equals(this.organizationSoj, claimOAPI.organizationSoj) &&
        Objects.equals(this.payeeCode, claimOAPI.payeeCode) &&
        Objects.equals(this.preDischargeInd, claimOAPI.preDischargeInd) &&
        Objects.equals(this.preDischargeTypeCode, claimOAPI.preDischargeTypeCode) &&
        Objects.equals(this.priority, claimOAPI.priority) &&
        Objects.equals(this.programTypeCode, claimOAPI.programTypeCode) &&
        Objects.equals(this.serviceTypeCode, claimOAPI.serviceTypeCode) &&
        Objects.equals(this.submitterApplicationCode, claimOAPI.submitterApplicationCode) &&
        Objects.equals(this.submitterRoleCode, claimOAPI.submitterRoleCode) &&
        Objects.equals(this.suspenseDate, claimOAPI.suspenseDate) &&
        Objects.equals(this.suspenseReasonCode, claimOAPI.suspenseReasonCode) &&
        Objects.equals(this.suspenseReasonComments, claimOAPI.suspenseReasonComments) &&
        Objects.equals(this.syncId, claimOAPI.syncId) &&
        Objects.equals(this.temporaryClaimSoj, claimOAPI.temporaryClaimSoj) &&
        Objects.equals(this.veteranPersonId, claimOAPI.veteranPersonId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimDate, claimId, claimLevelStatusCode, claimLifeCycleStatusChangeDate, claimLifecycleStatusName, claimPoaAccess, claimPoaCode, claimSoj, claimTypeCode, claimantPersonId, contentionsCount, epCode, establishmentDate, intakeSite, organizationName, organizationSoj, payeeCode, preDischargeInd, preDischargeTypeCode, priority, programTypeCode, serviceTypeCode, submitterApplicationCode, submitterRoleCode, suspenseDate, suspenseReasonCode, suspenseReasonComments, syncId, temporaryClaimSoj, veteranPersonId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimOAPI {\n");

    sb.append("    claimDate: ").append(toIndentedString(claimDate)).append("\n");
    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    claimLevelStatusCode: ").append(toIndentedString(claimLevelStatusCode)).append("\n");
    sb.append("    claimLifeCycleStatusChangeDate: ").append(toIndentedString(claimLifeCycleStatusChangeDate)).append("\n");
    sb.append("    claimLifecycleStatusName: ").append(toIndentedString(claimLifecycleStatusName)).append("\n");
    sb.append("    claimPoaAccess: ").append(toIndentedString(claimPoaAccess)).append("\n");
    sb.append("    claimPoaCode: ").append(toIndentedString(claimPoaCode)).append("\n");
    sb.append("    claimSoj: ").append(toIndentedString(claimSoj)).append("\n");
    sb.append("    claimTypeCode: ").append(toIndentedString(claimTypeCode)).append("\n");
    sb.append("    claimantPersonId: ").append(toIndentedString(claimantPersonId)).append("\n");
    sb.append("    contentionsCount: ").append(toIndentedString(contentionsCount)).append("\n");
    sb.append("    epCode: ").append(toIndentedString(epCode)).append("\n");
    sb.append("    establishmentDate: ").append(toIndentedString(establishmentDate)).append("\n");
    sb.append("    intakeSite: ").append(toIndentedString(intakeSite)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    organizationSoj: ").append(toIndentedString(organizationSoj)).append("\n");
    sb.append("    payeeCode: ").append(toIndentedString(payeeCode)).append("\n");
    sb.append("    preDischargeInd: ").append(toIndentedString(preDischargeInd)).append("\n");
    sb.append("    preDischargeTypeCode: ").append(toIndentedString(preDischargeTypeCode)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    programTypeCode: ").append(toIndentedString(programTypeCode)).append("\n");
    sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
    sb.append("    submitterApplicationCode: ").append(toIndentedString(submitterApplicationCode)).append("\n");
    sb.append("    submitterRoleCode: ").append(toIndentedString(submitterRoleCode)).append("\n");
    sb.append("    suspenseDate: ").append(toIndentedString(suspenseDate)).append("\n");
    sb.append("    suspenseReasonCode: ").append(toIndentedString(suspenseReasonCode)).append("\n");
    sb.append("    suspenseReasonComments: ").append(toIndentedString(suspenseReasonComments)).append("\n");
    sb.append("    syncId: ").append(toIndentedString(syncId)).append("\n");
    sb.append("    temporaryClaimSoj: ").append(toIndentedString(temporaryClaimSoj)).append("\n");
    sb.append("    veteranPersonId: ").append(toIndentedString(veteranPersonId)).append("\n");
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

