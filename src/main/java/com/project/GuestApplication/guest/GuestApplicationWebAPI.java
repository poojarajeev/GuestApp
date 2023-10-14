package com.project.GuestApplication.guest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.project.GuestApplication.guest.dao.entity.FileDet;
import com.project.GuestApplication.guest.modal.GuestDetails;
import com.project.GuestApplication.guest.modal.InputDetails;
import com.project.GuestApplication.guest.modal.LoginDetails;
import com.project.GuestApplication.guest.modal.UserFilterData;
import org.apache.coyote.Response;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public interface GuestApplicationWebAPI {

    @PostMapping(value = "/create")
    public String createAcc(@RequestBody GuestDetails guestDetails);

    @PostMapping(value = "/login")
    public GuestDetails login(@RequestBody GuestDetails guestDetails);

    @PostMapping(value = "/upload")
    public FileDet upload(@RequestBody InputDetails inputDetails);

    @PostMapping(value = "/approve/login")
    public GuestDetails apprLogin(@RequestBody GuestDetails guestDetails) throws Exception;

    @PostMapping(value="/listUsers")
    public GuestDetails listUsers(@RequestBody UserFilterData userFilterData);

    @PostMapping(value = "approve/image")
    public InputDetails apprImage(@RequestBody InputDetails inputDetails) throws Exception;
}
