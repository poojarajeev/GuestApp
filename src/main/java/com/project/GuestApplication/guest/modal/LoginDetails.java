package com.project.GuestApplication.guest.modal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginDetails {

    @JsonProperty("registration_id")
    private Integer userName;

    @JsonProperty("password")
    private String password;
}
