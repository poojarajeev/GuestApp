package com.project.GuestApplication.guest.modal;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GuestDetails {

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("age")
    private Integer age;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("password")
    private String password;

    @JsonProperty("user_type")
    private String userType;

    @JsonProperty("user_status")
    private String userStatus;

    @JsonProperty("userID")
    private Integer serialNo;
}
