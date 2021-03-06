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
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * * **REQUIRED** - no request for consent yet, * **PENDING** - consent requested, * **ACQUIRED** - provided provided by a candidate 
 */
@JsonAdapter(ConsentStatus.Adapter.class)
public enum ConsentStatus {
  REQUIRED("REQUIRED"),
  PENDING("PENDING"),
  ACQUIRED("ACQUIRED");

  private String value;

  ConsentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConsentStatus fromValue(String text) {
    for (ConsentStatus b : ConsentStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConsentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConsentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConsentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConsentStatus.fromValue(String.valueOf(value));
    }
  }
}
