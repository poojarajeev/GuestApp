package com.project.GuestApplication.guest.controller;

import com.project.GuestApplication.guest.GuestApplicationWebAPI;
import com.project.GuestApplication.guest.component.GuestComponent;
import com.project.GuestApplication.guest.dao.entity.FileDet;
import com.project.GuestApplication.guest.dao.entity.Guest;
import com.project.GuestApplication.guest.mapper.GuestMapper;
import com.project.GuestApplication.guest.modal.GuestDetails;
import com.project.GuestApplication.guest.modal.InputDetails;
import com.project.GuestApplication.guest.modal.LoginDetails;
import com.project.GuestApplication.guest.modal.UserFilterData;
import com.project.GuestApplication.guest.service.GuestService;
import com.project.GuestApplication.guest.vo.GuestVO;
import com.project.GuestApplication.guest.vo.InputVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Controller implements GuestApplicationWebAPI {

    @Autowired
    private GuestService guestService;

    @Autowired
    private GuestMapper guestMapper;

    @Override
    public String createAcc(GuestDetails guestDetails){
        GuestVO guestVO = guestMapper.constructUserDetails(guestDetails);
        return guestService.createAcc(guestVO);
    }

    @Override
    public GuestDetails login(GuestDetails guestDetails){
        GuestVO guestVO = guestMapper.constructUserDetails(guestDetails);
        return guestService.login(guestVO);
    }

    @Override
    public FileDet upload(InputDetails inputDetails){
        InputVO inputVO= guestMapper.constructInputDetails(inputDetails);
        return guestService.upload(inputVO);
    }

    @Override
    public GuestDetails listUsers(UserFilterData userFilterData){
        GuestVO guestVO = guestMapper.constructFilterUserDetails(userFilterData);
        return guestService.listUsers(guestVO);
    }

    @Override
    public GuestDetails apprLogin(GuestDetails guestDetails) throws Exception {
        GuestVO guestVO= guestMapper.constructUserDetails(guestDetails);
        return guestService.apprLogin(guestVO);
    }

    @Override
    public InputDetails apprImage(InputDetails inputDetails) throws Exception {
        InputVO inputVO= guestMapper.constructInputDetails(inputDetails);
        return guestService.apprImage(inputVO);
    }
    
}

