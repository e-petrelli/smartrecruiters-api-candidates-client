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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OnboardingStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-29T00:16:14.530797+01:00[Europe/London]")
public class OnboardingStatus {
  /**
   * Gets or Sets onboardingStatus
   */
  @JsonAdapter(OnboardingStatusEnum.Adapter.class)
  public enum OnboardingStatusEnum {
    READY_TO_ONBOARD("READY_TO_ONBOARD"),
    ONBOARDING_SUCCESSFUL("ONBOARDING_SUCCESSFUL"),
    ONBOARDING_FAILED("ONBOARDING_FAILED");

    private String value;

    OnboardingStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OnboardingStatusEnum fromValue(String text) {
      for (OnboardingStatusEnum b : OnboardingStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OnboardingStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OnboardingStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OnboardingStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OnboardingStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("onboardingStatus")
  private OnboardingStatusEnum onboardingStatus = null;

  public OnboardingStatus onboardingStatus(OnboardingStatusEnum onboardingStatus) {
    this.onboardingStatus = onboardingStatus;
    return this;
  }

   /**
   * Get onboardingStatus
   * @return onboardingStatus
  **/
  @Schema(required = true, description = "")
  public OnboardingStatusEnum getOnboardingStatus() {
    return onboardingStatus;
  }

  public void setOnboardingStatus(OnboardingStatusEnum onboardingStatus) {
    this.onboardingStatus = onboardingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingStatus onboardingStatus = (OnboardingStatus) o;
    return Objects.equals(this.onboardingStatus, onboardingStatus.onboardingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onboardingStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingStatus {\n");
    
    sb.append("    onboardingStatus: ").append(toIndentedString(onboardingStatus)).append("\n");
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
