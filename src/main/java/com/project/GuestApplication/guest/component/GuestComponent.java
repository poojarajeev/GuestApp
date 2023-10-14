package com.project.GuestApplication.guest.component;

import com.project.GuestApplication.guest.component.feature.persistor.GuestPersistor;
import com.project.GuestApplication.guest.dao.GuestDao;
import com.project.GuestApplication.guest.dao.entity.FileDet;
import com.project.GuestApplication.guest.dao.entity.Guest;
import com.project.GuestApplication.guest.dao.impl.GuestDaoImpl;
import com.project.GuestApplication.guest.modal.GuestDetails;
import com.project.GuestApplication.guest.modal.InputDetails;
import com.project.GuestApplication.guest.vo.GuestVO;
import com.project.GuestApplication.guest.vo.InputVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Component;

@Component("guestComponent")
public class GuestComponent {

    @Autowired
    private GuestPersistor guestPersistor;

    public String createAcc(GuestVO guestVO) {
        return guestPersistor.persist(guestVO);
    }

    public GuestDetails login(GuestVO guestVO){
        return guestPersistor.getGuestDet(guestVO);
    }

    public FileDet upload(InputVO inputVO){
        return guestPersistor.upload(inputVO);
    }

    public GuestDetails listUsers(GuestVO guestVO){
        return guestPersistor.getGuestDet(guestVO);
    }

    public GuestDetails apprLogin(GuestVO guestVO) throws Exception {
        return guestPersistor.apprLogin(guestVO);
    }

    public InputDetails apprImage(InputVO inputVO) throws Exception{
        return guestPersistor.apprImage(inputVO);
    }
}
