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
import com.smartrecruiters.api.candidates.model.CandidatePrimaryAssignmentJob;
import com.smartrecruiters.api.candidates.model.CandidateStatusEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CandidatePrimaryAssignment
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-29T00:16:14.530797+01:00[Europe/London]")
public class CandidatePrimaryAssignment {
  @SerializedName("job")
  private CandidatePrimaryAssignmentJob job = null;

  @SerializedName("status")
  private CandidateStatusEnum status = null;

  @SerializedName("subStatus")
  private String subStatus = null;

  public CandidatePrimaryAssignment job(CandidatePrimaryAssignmentJob job) {
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @Schema(required = true, description = "")
  public CandidatePrimaryAssignmentJob getJob() {
    return job;
  }

  public void setJob(CandidatePrimaryAssignmentJob job) {
    this.job = job;
  }

  public CandidatePrimaryAssignment status(CandidateStatusEnum status) {
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

  public CandidatePrimaryAssignment subStatus(String subStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidatePrimaryAssignment candidatePrimaryAssignment = (CandidatePrimaryAssignment) o;
    return Objects.equals(this.job, candidatePrimaryAssignment.job) &&
        Objects.equals(this.status, candidatePrimaryAssignment.status) &&
        Objects.equals(this.subStatus, candidatePrimaryAssignment.subStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, status, subStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidatePrimaryAssignment {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
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
