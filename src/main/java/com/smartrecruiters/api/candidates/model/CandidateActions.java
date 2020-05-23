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
import com.smartrecruiters.api.candidates.model.Action;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CandidateActions
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-23T23:03:51.387015+01:00[Europe/London]")
public class CandidateActions {
  @SerializedName("details")
  private Action details = null;

  @SerializedName("properties")
  private Action properties = null;

  public CandidateActions details(Action details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @Schema(required = true, description = "")
  public Action getDetails() {
    return details;
  }

  public void setDetails(Action details) {
    this.details = details;
  }

  public CandidateActions properties(Action properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Schema(required = true, description = "")
  public Action getProperties() {
    return properties;
  }

  public void setProperties(Action properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateActions candidateActions = (CandidateActions) o;
    return Objects.equals(this.details, candidateActions.details) &&
        Objects.equals(this.properties, candidateActions.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateActions {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
