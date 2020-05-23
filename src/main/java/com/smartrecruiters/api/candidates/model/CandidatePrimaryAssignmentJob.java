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
import com.smartrecruiters.api.candidates.model.CandidatePrimaryAssignmentJobActions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CandidatePrimaryAssignmentJob
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-23T14:57:09.146594+01:00[Europe/London]")
public class CandidatePrimaryAssignmentJob {
  @SerializedName("id")
  private String id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("actions")
  private CandidatePrimaryAssignmentJobActions actions = null;

  public CandidatePrimaryAssignmentJob id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CandidatePrimaryAssignmentJob title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(required = true, description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CandidatePrimaryAssignmentJob actions(CandidatePrimaryAssignmentJobActions actions) {
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @Schema(required = true, description = "")
  public CandidatePrimaryAssignmentJobActions getActions() {
    return actions;
  }

  public void setActions(CandidatePrimaryAssignmentJobActions actions) {
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
    CandidatePrimaryAssignmentJob candidatePrimaryAssignmentJob = (CandidatePrimaryAssignmentJob) o;
    return Objects.equals(this.id, candidatePrimaryAssignmentJob.id) &&
        Objects.equals(this.title, candidatePrimaryAssignmentJob.title) &&
        Objects.equals(this.actions, candidatePrimaryAssignmentJob.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidatePrimaryAssignmentJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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