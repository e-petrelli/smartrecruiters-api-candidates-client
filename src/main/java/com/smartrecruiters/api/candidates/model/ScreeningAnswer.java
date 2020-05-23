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
import com.smartrecruiters.api.candidates.model.AnswerRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ScreeningAnswer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-23T23:03:51.387015+01:00[Europe/London]")
public class ScreeningAnswer {
  @SerializedName("id")
  private String id = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TEXT("text"),
    CHECKBOX("checkbox"),
    LANGUAGES("languages"),
    ACKNOWLEDGEMENT("acknowledgement"),
    TEXTAREA("textarea"),
    SELECT("select"),
    FILES("files"),
    INFO("info"),
    EEO("eeo"),
    RADIO("radio"),
    SALARYEXPECTATION("salaryExpectation"),
    CURRENCY("currency"),
    WORK_SHIFTS("work_shifts");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("records")
  private List<AnswerRecord> records = new ArrayList<AnswerRecord>();

  public ScreeningAnswer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of Question to which answer was responded
   * @return id
  **/
  @Schema(required = true, description = "Id of Question to which answer was responded")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScreeningAnswer type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ScreeningAnswer category(String category) {
    this.category = category;
    return this;
  }

   /**
   * UUID for custom questions or fixed value for predefined questions:  - eeoInformation  - ofccpDisability  - ofccpVeteransForm  - veteranStatus  - disabilityStatus  - ofccpReasonableAccommodation  - ethnicity  - ethnicGroupsDescriptions  - todaysDate  - yourName  - preferredWorkShifts  - languages  - previousEmployment  - drivingRevoked  - drivingCurrent  - criminalRecord  - workPermit 
   * @return category
  **/
  @Schema(required = true, description = "UUID for custom questions or fixed value for predefined questions:  - eeoInformation  - ofccpDisability  - ofccpVeteransForm  - veteranStatus  - disabilityStatus  - ofccpReasonableAccommodation  - ethnicity  - ethnicGroupsDescriptions  - todaysDate  - yourName  - preferredWorkShifts  - languages  - previousEmployment  - drivingRevoked  - drivingCurrent  - criminalRecord  - workPermit ")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ScreeningAnswer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Question name visible to administrator on questions library list
   * @return name
  **/
  @Schema(required = true, description = "Question name visible to administrator on questions library list")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScreeningAnswer label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Question text shown to candidate
   * @return label
  **/
  @Schema(required = true, description = "Question text shown to candidate")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ScreeningAnswer records(List<AnswerRecord> records) {
    this.records = records;
    return this;
  }

  public ScreeningAnswer addRecordsItem(AnswerRecord recordsItem) {
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Multiple records may be used for example for questions (Preferred Work Shifts, Languages)
   * @return records
  **/
  @Schema(required = true, description = "Multiple records may be used for example for questions (Preferred Work Shifts, Languages)")
  public List<AnswerRecord> getRecords() {
    return records;
  }

  public void setRecords(List<AnswerRecord> records) {
    this.records = records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningAnswer screeningAnswer = (ScreeningAnswer) o;
    return Objects.equals(this.id, screeningAnswer.id) &&
        Objects.equals(this.type, screeningAnswer.type) &&
        Objects.equals(this.category, screeningAnswer.category) &&
        Objects.equals(this.name, screeningAnswer.name) &&
        Objects.equals(this.label, screeningAnswer.label) &&
        Objects.equals(this.records, screeningAnswer.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, category, name, label, records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningAnswer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
