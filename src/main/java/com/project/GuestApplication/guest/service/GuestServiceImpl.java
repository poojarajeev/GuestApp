package com.project.GuestApplication.guest.service;

import com.project.GuestApplication.guest.component.GuestComponent;
import com.project.GuestApplication.guest.dao.entity.FileDet;
import com.project.GuestApplication.guest.modal.GuestDetails;
import com.project.GuestApplication.guest.modal.InputDetails;
import com.project.GuestApplication.guest.vo.GuestVO;
import com.project.GuestApplication.guest.vo.InputVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Component;

@Component("guestService")
public class GuestServiceImpl implements GuestService{

    @Autowired
    GuestComponent guestComponent;

    @Override
    public String createAcc(GuestVO guestVO){
        return guestComponent.createAcc(guestVO);
    }

    @Override
    public GuestDetails login(GuestVO guestVO){
        return guestComponent.login(guestVO);
    }

    @Override
    public FileDet upload(InputVO inputVO){
        return guestComponent.upload(inputVO);
    }

    @Override
    public GuestDetails listUsers(GuestVO guestVO){
        return guestComponent.listUsers(guestVO);
    }

    @Override
    public GuestDetails apprLogin(GuestVO guestVO) throws Exception {
        return guestComponent.apprLogin(guestVO);
    }

    @Override
    public InputDetails apprImage(InputVO inputVO) throws Exception{
        return guestComponent.apprImage(inputVO);
    }
}
