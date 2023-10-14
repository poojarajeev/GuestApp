package com.project.GuestApplication.guest.mapper;

import com.project.GuestApplication.guest.modal.GuestDetails;
import com.project.GuestApplication.guest.modal.InputDetails;
import com.project.GuestApplication.guest.vo.GuestVO;
import com.project.GuestApplication.guest.vo.InputVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-13T02:58:00+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class GuestMapperImpl implements GuestMapper {

    @Override
    public GuestVO constructUserDetails(GuestDetails guestDetails) {
        if ( guestDetails == null ) {
            return null;
        }

        GuestVO guestVO = new GuestVO();

        guestVO.setFirstName( guestDetails.getFirstName() );
        guestVO.setLastName( guestDetails.getLastName() );
        guestVO.setAge( guestDetails.getAge() );
        guestVO.setGender( guestDetails.getGender() );
        guestVO.setUserName( guestDetails.getUserName() );
        guestVO.setPassword( guestDetails.getPassword() );
        guestVO.setUserType( guestDetails.getUserType() );
        guestVO.setUserStatus( guestDetails.getUserStatus() );

        return guestVO;
    }

    @Override
    public InputVO constructInputDetails(InputDetails inputDetails) {
        if ( inputDetails == null ) {
            return null;
        }

        InputVO inputVO = new InputVO();

        inputVO.setFileName( inputDetails.getFileName() );
        inputVO.setFileType( inputDetails.getFileType() );
        inputVO.setCacheKey( inputDetails.getCacheKey() );
        if ( inputDetails.getUserId() != null ) {
            inputVO.setUserId( Integer.parseInt( inputDetails.getUserId() ) );
        }

        return inputVO;
    }
}
