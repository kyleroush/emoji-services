package com.aws.codestar.projecttemplates.group;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class GroupDto {

  public abstract String name();


  public static Builder builder() {
    return new AutoValue_GroupDto.Builder().name("kyle");
  }

  @AutoValue.Builder
  @JsonPOJOBuilder(withPrefix = "set")
  public abstract static class Builder {
    public abstract Builder name(String name);
    public abstract GroupDto build();
  }
}
