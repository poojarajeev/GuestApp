package com.project.GuestApplication.guest.dao.impl;

import com.project.GuestApplication.guest.dao.GuestDao;
import com.project.GuestApplication.guest.dao.entity.FileDet;
import com.project.GuestApplication.guest.dao.entity.Guest;
import com.project.GuestApplication.guest.dao.impl.repositories.FileJPARepository;
import com.project.GuestApplication.guest.dao.impl.repositories.GuestJPARepository;
import com.project.GuestApplication.guest.dao.mybatis.ListGuestDetQueryMapper;
import com.project.GuestApplication.guest.modal.GuestDetails;
import com.project.GuestApplication.guest.vo.GuestVO;
import com.project.GuestApplication.guest.vo.InputVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("guestDao")
public class GuestDaoImpl implements GuestDao {

    @Autowired
    protected GuestJPARepository guestJPARepository;

    @Autowired
    protected ListGuestDetQueryMapper listGuestDetQueryMapper;

    @Autowired
    protected FileJPARepository fileJPARepository;

    @Override
    public void persist(Guest guest){
        guestJPARepository.save(guest);
    }

    @Override
    public Guest listGuestDet(GuestVO guestVO){
        return listGuestDetQueryMapper.listGuestDet(guestVO);
    }

    @Override
    public FileDet listImageDet(InputVO inputVO){
        return listGuestDetQueryMapper.listImagedet(inputVO);
    }

    @Override
    public void merge(FileDet fileDet){
        fileJPARepository.save(fileDet);
    }
}
