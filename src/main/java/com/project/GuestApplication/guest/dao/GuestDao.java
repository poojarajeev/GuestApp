package com.project.GuestApplication.guest.dao;

import com.project.GuestApplication.guest.dao.entity.FileDet;
import com.project.GuestApplication.guest.dao.entity.Guest;
import com.project.GuestApplication.guest.modal.GuestDetails;
import com.project.GuestApplication.guest.vo.GuestVO;
import com.project.GuestApplication.guest.vo.InputVO;
import jakarta.transaction.Transactional;
import org.springframework.data.relational.core.sql.In;

@Transactional
public interface GuestDao {

    public void persist(Guest guest);

    public void merge(FileDet fileDet);

    public Guest listGuestDet(GuestVO guestVO);

    public FileDet listImageDet(InputVO inputVO);
}
