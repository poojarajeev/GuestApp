package com.project.GuestApplication.guest.modal;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserFilterData {

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("email_id")
    private String emailId;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("userStatus")
    private String userStatus;
}
