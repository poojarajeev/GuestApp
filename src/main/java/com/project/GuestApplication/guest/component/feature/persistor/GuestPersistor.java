package com.project.GuestApplication.guest.component.feature.persistor;

import com.project.GuestApplication.guest.dao.GuestDao;
import com.project.GuestApplication.guest.dao.entity.FileDet;
import com.project.GuestApplication.guest.dao.entity.Guest;
import com.project.GuestApplication.guest.modal.GuestDetails;
import com.project.GuestApplication.guest.modal.InputDetails;
import com.project.GuestApplication.guest.vo.GuestVO;
import com.project.GuestApplication.guest.vo.InputVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component("guestPersistor")
public class GuestPersistor {

    @Autowired
    private GuestDao guestDao;

    public String persist(GuestVO guestVO){
        Guest guest = new Guest();
        String returnStatus="";
        guest.updateDetails(guestVO);
        if(guestVO.getUserType().equals("G")){
            guest.setUserStatus("A");//guest status is approved
            returnStatus="Approved";
        } else{
            guest.setUserStatus("NA");
            returnStatus="Not Aprroved";
        }
        guestDao.persist(guest);
        return returnStatus;
    }

    public GuestDetails getGuestDet(GuestVO guestVO){
        Guest guest=guestDao.listGuestDet(guestVO);
        GuestDetails guestDetails =new GuestDetails();
        guestDetails.setAge(guest.getAge());
        guestDetails.setGender(guest.getGender());
        guestDetails.setUserStatus(guest.getUserStatus());
        guestDetails.setLastName(guest.getLastName());
        guestDetails.setFirstName(guest.getFirstName());
        guestDetails.setSerialNo(guest.getSerialNo());
        return guestDetails;
    }

    public GuestDetails apprLogin(GuestVO guestVO) throws Exception{
        Guest guest=guestDao.listGuestDet(guestVO);
        if(Objects.nonNull(guest) && !guest.getUserStatus().equals("NA")){
            guest.setUserStatus("A");
            guestDao.persist(guest);
        }else{
            throw new Exception("invalid Usr");
        }
        GuestDetails guestDetails =new GuestDetails();
        guestDetails.setAge(guest.getAge());
        guestDetails.setGender(guest.getGender());
        guestDetails.setUserStatus(guest.getUserStatus());
        guestDetails.setLastName(guest.getLastName());
        guestDetails.setFirstName(guest.getFirstName());
        guestDetails.setSerialNo(guest.getSerialNo());
        return guestDetails;
    }

    public InputDetails apprImage(InputVO inputVO) throws Exception{
        FileDet fileDet=guestDao.listImageDet(inputVO);
        if(Objects.nonNull(fileDet) && fileDet.getApprovalSta().equals("NA")){
            fileDet.setApprovalSta("A");
        }else{
            throw new Exception("File not found");
        }
        guestDao.merge(fileDet);
        InputDetails inputDetails = new InputDetails();
        inputDetails.setFileId(fileDet.getFileId());
        inputDetails.setFileName(fileDet.getFileName());
        inputDetails.setFileType(fileDet.getFileType());
        return inputDetails;
    }

    public FileDet upload(InputVO inputVO){
        GuestVO guestVO = new GuestVO();
        guestVO.setUserId(inputVO.getUserId());
        Guest guest=guestDao.listGuestDet(guestVO);
        FileDet fileDet = new FileDet();
        fileDet.uploadDetails(inputVO);
        fileDet.getGuest().setSerialNo(guest.getSerialNo());
        String returnStatus="";
        if(guest.getUserStatus().equals("A")){
            fileDet.setApprovalSta("A");
            returnStatus="Approvedd";
        }else{
            fileDet.setApprovalSta("NA");
            returnStatus="Waiting for approval";
        }
        guestDao.merge(fileDet);
        return fileDet;
    }

}
