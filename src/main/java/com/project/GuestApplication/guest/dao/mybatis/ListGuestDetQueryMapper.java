package com.project.GuestApplication.guest.dao.mybatis;

import com.project.GuestApplication.guest.dao.entity.Guest;
import com.project.GuestApplication.guest.dao.entity.FileDet;
import com.project.GuestApplication.guest.modal.GuestDetails;
import com.project.GuestApplication.guest.vo.GuestVO;
import com.project.GuestApplication.guest.vo.InputVO;
import org.mapstruct.Mapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Mapper
public interface ListGuestDetQueryMapper {

    Guest listGuestDet(GuestVO guestVO);

    FileDet listImagedet(InputVO inputVO);
}
