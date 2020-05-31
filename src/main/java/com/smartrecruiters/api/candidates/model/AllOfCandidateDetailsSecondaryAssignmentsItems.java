/*
 * Candidates API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.smartrecruiters.api.candidates.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartrecruiters.api.candidates.model.Assignment;
import com.smartrecruiters.api.candidates.model.AssignmentActions;
import com.smartrecruiters.api.candidates.model.CandidateStatusEnum;
import com.smartrecruiters.api.candidates.model.Job;
import com.smartrecruiters.api.candidates.model.JobJob;
import com.smartrecruiters.api.candidates.model.Property;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * AllOfCandidateDetailsSecondaryAssignmentsItems
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-29T00:16:14.530797+01:00[Europe/London]")
public class AllOfCandidateDetailsSecondaryAssignmentsItems extends Job {
  @SerializedName("status")
  private CandidateStatusEnum status = null;

  @SerializedName("subStatus")
  private String subStatus = null;

  @SerializedName("startsOn")
  private OffsetDateTime startsOn = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("reasonOfRejection")
  private Property reasonOfRejection = null;

  @SerializedName("reasonOfWithdrawal")
  private Property reasonOfWithdrawal = null;

  @SerializedName("actions")
  private AssignmentActions actions = null;

  public AllOfCandidateDetailsSecondaryAssignmentsItems status(CandidateStatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public CandidateStatusEnum getStatus() {
    return status;
  }

  public void setStatus(CandidateStatusEnum status) {
    this.status = status;
  }

  public AllOfCandidateDetailsSecondaryAssignmentsItems subStatus(String subStatus) {
    this.subStatus = subStatus;
    return this;
  }

   /**
   * Get subStatus
   * @return subStatus
  **/
  @Schema(description = "")
  public String getSubStatus() {
    return subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  public AllOfCandidateDetailsSecondaryAssignmentsItems startsOn(OffsetDateTime startsOn) {
    this.startsOn = startsOn;
    return this;
  }

   /**
   * Get startsOn
   * @return startsOn
  **/
  @Schema(description = "")
  public OffsetDateTime getStartsOn() {
    return startsOn;
  }

  public void setStartsOn(OffsetDateTime startsOn) {
    this.startsOn = startsOn;
  }

  public AllOfCandidateDetailsSecondaryAssignmentsItems source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public AllOfCandidateDetailsSecondaryAssignmentsItems reasonOfRejection(Property reasonOfRejection) {
    this.reasonOfRejection = reasonOfRejection;
    return this;
  }

   /**
   * Get reasonOfRejection
   * @return reasonOfRejection
  **/
  @Schema(description = "")
  public Property getReasonOfRejection() {
    return reasonOfRejection;
  }

  public void setReasonOfRejection(Property reasonOfRejection) {
    this.reasonOfRejection = reasonOfRejection;
  }

  public AllOfCandidateDetailsSecondaryAssignmentsItems reasonOfWithdrawal(Property reasonOfWithdrawal) {
    this.reasonOfWithdrawal = reasonOfWithdrawal;
    return this;
  }

   /**
   * Get reasonOfWithdrawal
   * @return reasonOfWithdrawal
  **/
  @Schema(description = "")
  public Property getReasonOfWithdrawal() {
    return reasonOfWithdrawal;
  }

  public void setReasonOfWithdrawal(Property reasonOfWithdrawal) {
    this.reasonOfWithdrawal = reasonOfWithdrawal;
  }

  public AllOfCandidateDetailsSecondaryAssignmentsItems actions(AssignmentActions actions) {
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @Schema(description = "")
  public AssignmentActions getActions() {
    return actions;
  }

  public void setActions(AssignmentActions actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfCandidateDetailsSecondaryAssignmentsItems allOfCandidateDetailsSecondaryAssignmentsItems = (AllOfCandidateDetailsSecondaryAssignmentsItems) o;
    return Objects.equals(this.status, allOfCandidateDetailsSecondaryAssignmentsItems.status) &&
        Objects.equals(this.subStatus, allOfCandidateDetailsSecondaryAssignmentsItems.subStatus) &&
        Objects.equals(this.startsOn, allOfCandidateDetailsSecondaryAssignmentsItems.startsOn) &&
        Objects.equals(this.source, allOfCandidateDetailsSecondaryAssignmentsItems.source) &&
        Objects.equals(this.reasonOfRejection, allOfCandidateDetailsSecondaryAssignmentsItems.reasonOfRejection) &&
        Objects.equals(this.reasonOfWithdrawal, allOfCandidateDetailsSecondaryAssignmentsItems.reasonOfWithdrawal) &&
        Objects.equals(this.actions, allOfCandidateDetailsSecondaryAssignmentsItems.actions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, subStatus, startsOn, source, reasonOfRejection, reasonOfWithdrawal, actions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfCandidateDetailsSecondaryAssignmentsItems {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
    sb.append("    startsOn: ").append(toIndentedString(startsOn)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    reasonOfRejection: ").append(toIndentedString(reasonOfRejection)).append("\n");
    sb.append("    reasonOfWithdrawal: ").append(toIndentedString(reasonOfWithdrawal)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
