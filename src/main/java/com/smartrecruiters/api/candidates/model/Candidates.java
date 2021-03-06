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
import com.smartrecruiters.api.candidates.model.Candidate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Candidates
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-29T00:16:14.530797+01:00[Europe/London]")
public class Candidates {
  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("totalFound")
  private Integer totalFound = null;

  @SerializedName("content")
  private List<Candidate> content = new ArrayList<Candidate>();

  public Candidates limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(required = true, description = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Candidates offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @Schema(required = true, description = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public Candidates totalFound(Integer totalFound) {
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

  public Candidates content(List<Candidate> content) {
    this.content = content;
    return this;
  }

  public Candidates addContentItem(Candidate contentItem) {
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(required = true, description = "")
  public List<Candidate> getContent() {
    return content;
  }

  public void setContent(List<Candidate> content) {
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
    Candidates candidates = (Candidates) o;
    return Objects.equals(this.limit, candidates.limit) &&
        Objects.equals(this.offset, candidates.offset) &&
        Objects.equals(this.totalFound, candidates.totalFound) &&
        Objects.equals(this.content, candidates.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, totalFound, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Candidates {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
