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
import com.smartrecruiters.api.candidates.model.CandidatePropertyActions;
import com.smartrecruiters.api.candidates.model.CandidatePropertyType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CandidateProperty
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-23T14:57:09.146594+01:00[Europe/London]")
public class CandidateProperty {
  @SerializedName("id")
  private String id = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("type")
  private CandidatePropertyType type = null;

  @SerializedName("value")
  private OneOfCandidatePropertyValue value = null;

  @SerializedName("actions")
  private CandidatePropertyActions actions = null;

  public CandidateProperty id(String id) {
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

  public CandidateProperty label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @Schema(required = true, description = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CandidateProperty type(CandidatePropertyType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public CandidatePropertyType getType() {
    return type;
  }

  public void setType(CandidatePropertyType type) {
    this.type = type;
  }

  public CandidateProperty value(OneOfCandidatePropertyValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(required = true, description = "")
  public OneOfCandidatePropertyValue getValue() {
    return value;
  }

  public void setValue(OneOfCandidatePropertyValue value) {
    this.value = value;
  }

  public CandidateProperty actions(CandidatePropertyActions actions) {
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @Schema(required = true, description = "")
  public CandidatePropertyActions getActions() {
    return actions;
  }

  public void setActions(CandidatePropertyActions actions) {
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
    CandidateProperty candidateProperty = (CandidateProperty) o;
    return Objects.equals(this.id, candidateProperty.id) &&
        Objects.equals(this.label, candidateProperty.label) &&
        Objects.equals(this.type, candidateProperty.type) &&
        Objects.equals(this.value, candidateProperty.value) &&
        Objects.equals(this.actions, candidateProperty.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, type, value, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateProperty {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
