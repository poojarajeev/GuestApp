package com.project.GuestApplication.guest.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GuestVO {

    String firstName;

    String lastName;

    Integer age;

    String gender;

    String userName;

    String password;

    String userType;

    String userStatus;

    Integer userId;
}
