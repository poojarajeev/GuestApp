package com.project.GuestApplication.guest.service;

import com.project.GuestApplication.GuestApplication;
import com.project.GuestApplication.guest.dao.entity.FileDet;
import com.project.GuestApplication.guest.modal.GuestDetails;
import com.project.GuestApplication.guest.modal.InputDetails;
import com.project.GuestApplication.guest.modal.UserFilterData;
import com.project.GuestApplication.guest.vo.GuestVO;
import com.project.GuestApplication.guest.vo.InputVO;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public interface GuestService {

    String createAcc(GuestVO guestVO);

    GuestDetails login(GuestVO guestVO);

    FileDet upload(InputVO inputVO);

    GuestDetails listUsers(GuestVO guestVO);

    GuestDetails apprLogin(GuestVO guestVO) throws Exception;

    InputDetails apprImage(InputVO inputVO) throws Exception;
}
