package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Profile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T20:12:35.132Z")

public class Profile   {
  @JsonProperty("userCode")
  private String userCode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("active")
  private Boolean active = true;

  @JsonProperty("birthDate")
  private LocalDate birthDate = null;

  public Profile userCode(String userCode) {
    this.userCode = userCode;
    return this;
  }

   /**
   * Get userCode
   * @return userCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  public Profile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Profile active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")


  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Profile birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Get birthDate
   * @return birthDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.userCode, profile.userCode) &&
        Objects.equals(this.name, profile.name) &&
        Objects.equals(this.active, profile.active) &&
        Objects.equals(this.birthDate, profile.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userCode, name, active, birthDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    userCode: ").append(toIndentedString(userCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
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

