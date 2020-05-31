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
import com.smartrecruiters.api.candidates.model.AnswerField;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AnswerRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-29T00:16:14.530797+01:00[Europe/London]")
public class AnswerRecord {
  @SerializedName("fields")
  private List<AnswerField> fields = new ArrayList<AnswerField>();

  public AnswerRecord fields(List<AnswerField> fields) {
    this.fields = fields;
    return this;
  }

  public AnswerRecord addFieldsItem(AnswerField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Multiple fields may be used for example for questions (Preferred Work Shifts, Languages, EEO, Currency)
   * @return fields
  **/
  @Schema(required = true, description = "Multiple fields may be used for example for questions (Preferred Work Shifts, Languages, EEO, Currency)")
  public List<AnswerField> getFields() {
    return fields;
  }

  public void setFields(List<AnswerField> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerRecord answerRecord = (AnswerRecord) o;
    return Objects.equals(this.fields, answerRecord.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerRecord {\n");
    
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
