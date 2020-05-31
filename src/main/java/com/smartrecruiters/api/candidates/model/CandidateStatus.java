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
import com.smartrecruiters.api.candidates.model.CandidateStatusEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * CandidateStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-29T00:16:14.530797+01:00[Europe/London]")
public class CandidateStatus {
  @SerializedName("status")
  private CandidateStatusEnum status = null;

  @SerializedName("subStatus")
  private String subStatus = null;

  @SerializedName("startsOn")
  private OffsetDateTime startsOn = null;

  @SerializedName("reason")
  private String reason = null;

  public CandidateStatus status(CandidateStatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public CandidateStatusEnum getStatus() {
    return status;
  }

  public void setStatus(CandidateStatusEnum status) {
    this.status = status;
  }

  public CandidateStatus subStatus(String subStatus) {
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

  public CandidateStatus startsOn(OffsetDateTime startsOn) {
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

  public CandidateStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * id of rejection (GET /configuration/rejection-reasons) or withdrawal (GET /configuration/withdrawal-reasons) reason.
   * @return reason
  **/
  @Schema(description = "id of rejection (GET /configuration/rejection-reasons) or withdrawal (GET /configuration/withdrawal-reasons) reason.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateStatus candidateStatus = (CandidateStatus) o;
    return Objects.equals(this.status, candidateStatus.status) &&
        Objects.equals(this.subStatus, candidateStatus.subStatus) &&
        Objects.equals(this.startsOn, candidateStatus.startsOn) &&
        Objects.equals(this.reason, candidateStatus.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, subStatus, startsOn, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
    sb.append("    startsOn: ").append(toIndentedString(startsOn)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
