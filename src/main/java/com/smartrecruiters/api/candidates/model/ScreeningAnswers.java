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
import com.smartrecruiters.api.candidates.model.ScreeningAnswer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ScreeningAnswers
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-23T14:57:09.146594+01:00[Europe/London]")
public class ScreeningAnswers {
  @SerializedName("totalFound")
  private Integer totalFound = null;

  @SerializedName("content")
  private List<ScreeningAnswer> content = new ArrayList<ScreeningAnswer>();

  public ScreeningAnswers totalFound(Integer totalFound) {
    this.totalFound = totalFound;
    return this;
  }

   /**
   * Get totalFound
   * @return totalFound
  **/
  @Schema(required = true, description = "")
  public Integer getTotalFound() {
    return totalFound;
  }

  public void setTotalFound(Integer totalFound) {
    this.totalFound = totalFound;
  }

  public ScreeningAnswers content(List<ScreeningAnswer> content) {
    this.content = content;
    return this;
  }

  public ScreeningAnswers addContentItem(ScreeningAnswer contentItem) {
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(required = true, description = "")
  public List<ScreeningAnswer> getContent() {
    return content;
  }

  public void setContent(List<ScreeningAnswer> content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningAnswers screeningAnswers = (ScreeningAnswers) o;
    return Objects.equals(this.totalFound, screeningAnswers.totalFound) &&
        Objects.equals(this.content, screeningAnswers.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalFound, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningAnswers {\n");
    
    sb.append("    totalFound: ").append(toIndentedString(totalFound)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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