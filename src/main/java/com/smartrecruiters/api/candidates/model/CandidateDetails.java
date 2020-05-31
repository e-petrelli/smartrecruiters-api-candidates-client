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
import com.smartrecruiters.api.candidates.model.CandidateDetailsActions;
import com.smartrecruiters.api.candidates.model.CandidateLocation;
import com.smartrecruiters.api.candidates.model.Education;
import com.smartrecruiters.api.candidates.model.Experience;
import com.smartrecruiters.api.candidates.model.WebProfile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * CandidateDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-29T00:16:14.530797+01:00[Europe/London]")
public class CandidateDetails {
  @SerializedName("id")
  private String id = null;

  @SerializedName("internal")
  private Boolean internal = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("location")
  private CandidateLocation location = null;

  @SerializedName("web")
  private WebProfile web = null;

  @SerializedName("createdOn")
  private OffsetDateTime createdOn = null;

  @SerializedName("updatedOn")
  private OffsetDateTime updatedOn = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("averageRating")
  private BigDecimal averageRating = null;

  @SerializedName("education")
  private List<Education> education = null;

  @SerializedName("experience")
  private List<Experience> experience = null;

  @SerializedName("primaryAssignment")
  private AllOfCandidateDetailsPrimaryAssignment primaryAssignment = null;

  @SerializedName("secondaryAssignments")
  private List<AllOfCandidateDetailsSecondaryAssignmentsItems> secondaryAssignments = null;

  @SerializedName("actions")
  private CandidateDetailsActions actions = null;

  public CandidateDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CandidateDetails internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @Schema(description = "")
  public Boolean isInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public CandidateDetails firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CandidateDetails lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CandidateDetails email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CandidateDetails phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @Schema(description = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CandidateDetails location(CandidateLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @Schema(description = "")
  public CandidateLocation getLocation() {
    return location;
  }

  public void setLocation(CandidateLocation location) {
    this.location = location;
  }

  public CandidateDetails web(WebProfile web) {
    this.web = web;
    return this;
  }

   /**
   * Get web
   * @return web
  **/
  @Schema(description = "")
  public WebProfile getWeb() {
    return web;
  }

  public void setWeb(WebProfile web) {
    this.web = web;
  }

  public CandidateDetails createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public CandidateDetails updatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  public CandidateDetails tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CandidateDetails addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CandidateDetails averageRating(BigDecimal averageRating) {
    this.averageRating = averageRating;
    return this;
  }

   /**
   * Get averageRating
   * @return averageRating
  **/
  @Schema(description = "")
  public BigDecimal getAverageRating() {
    return averageRating;
  }

  public void setAverageRating(BigDecimal averageRating) {
    this.averageRating = averageRating;
  }

  public CandidateDetails education(List<Education> education) {
    this.education = education;
    return this;
  }

  public CandidateDetails addEducationItem(Education educationItem) {
    if (this.education == null) {
      this.education = new ArrayList<Education>();
    }
    this.education.add(educationItem);
    return this;
  }

   /**
   * Get education
   * @return education
  **/
  @Schema(description = "")
  public List<Education> getEducation() {
    return education;
  }

  public void setEducation(List<Education> education) {
    this.education = education;
  }

  public CandidateDetails experience(List<Experience> experience) {
    this.experience = experience;
    return this;
  }

  public CandidateDetails addExperienceItem(Experience experienceItem) {
    if (this.experience == null) {
      this.experience = new ArrayList<Experience>();
    }
    this.experience.add(experienceItem);
    return this;
  }

   /**
   * Get experience
   * @return experience
  **/
  @Schema(description = "")
  public List<Experience> getExperience() {
    return experience;
  }

  public void setExperience(List<Experience> experience) {
    this.experience = experience;
  }

  public CandidateDetails primaryAssignment(AllOfCandidateDetailsPrimaryAssignment primaryAssignment) {
    this.primaryAssignment = primaryAssignment;
    return this;
  }

   /**
   * Get primaryAssignment
   * @return primaryAssignment
  **/
  @Schema(description = "")
  public AllOfCandidateDetailsPrimaryAssignment getPrimaryAssignment() {
    return primaryAssignment;
  }

  public void setPrimaryAssignment(AllOfCandidateDetailsPrimaryAssignment primaryAssignment) {
    this.primaryAssignment = primaryAssignment;
  }

  public CandidateDetails secondaryAssignments(List<AllOfCandidateDetailsSecondaryAssignmentsItems> secondaryAssignments) {
    this.secondaryAssignments = secondaryAssignments;
    return this;
  }

  public CandidateDetails addSecondaryAssignmentsItem(AllOfCandidateDetailsSecondaryAssignmentsItems secondaryAssignmentsItem) {
    if (this.secondaryAssignments == null) {
      this.secondaryAssignments = new ArrayList<AllOfCandidateDetailsSecondaryAssignmentsItems>();
    }
    this.secondaryAssignments.add(secondaryAssignmentsItem);
    return this;
  }

   /**
   * Get secondaryAssignments
   * @return secondaryAssignments
  **/
  @Schema(description = "")
  public List<AllOfCandidateDetailsSecondaryAssignmentsItems> getSecondaryAssignments() {
    return secondaryAssignments;
  }

  public void setSecondaryAssignments(List<AllOfCandidateDetailsSecondaryAssignmentsItems> secondaryAssignments) {
    this.secondaryAssignments = secondaryAssignments;
  }

  public CandidateDetails actions(CandidateDetailsActions actions) {
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @Schema(description = "")
  public CandidateDetailsActions getActions() {
    return actions;
  }

  public void setActions(CandidateDetailsActions actions) {
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
    CandidateDetails candidateDetails = (CandidateDetails) o;
    return Objects.equals(this.id, candidateDetails.id) &&
        Objects.equals(this.internal, candidateDetails.internal) &&
        Objects.equals(this.firstName, candidateDetails.firstName) &&
        Objects.equals(this.lastName, candidateDetails.lastName) &&
        Objects.equals(this.email, candidateDetails.email) &&
        Objects.equals(this.phoneNumber, candidateDetails.phoneNumber) &&
        Objects.equals(this.location, candidateDetails.location) &&
        Objects.equals(this.web, candidateDetails.web) &&
        Objects.equals(this.createdOn, candidateDetails.createdOn) &&
        Objects.equals(this.updatedOn, candidateDetails.updatedOn) &&
        Objects.equals(this.tags, candidateDetails.tags) &&
        Objects.equals(this.averageRating, candidateDetails.averageRating) &&
        Objects.equals(this.education, candidateDetails.education) &&
        Objects.equals(this.experience, candidateDetails.experience) &&
        Objects.equals(this.primaryAssignment, candidateDetails.primaryAssignment) &&
        Objects.equals(this.secondaryAssignments, candidateDetails.secondaryAssignments) &&
        Objects.equals(this.actions, candidateDetails.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, internal, firstName, lastName, email, phoneNumber, location, web, createdOn, updatedOn, tags, averageRating, education, experience, primaryAssignment, secondaryAssignments, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    averageRating: ").append(toIndentedString(averageRating)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    primaryAssignment: ").append(toIndentedString(primaryAssignment)).append("\n");
    sb.append("    secondaryAssignments: ").append(toIndentedString(secondaryAssignments)).append("\n");
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
