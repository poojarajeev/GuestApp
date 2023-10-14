package com.project.GuestApplication.guest.dao.mybatis;

import com.project.GuestApplication.guest.dao.entity.Guest;
import com.project.GuestApplication.guest.vo.GuestVO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-13T02:58:00+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
public class ListGuestDetQueryMapperImpl implements ListGuestDetQueryMapper {

    @Override
    public Guest listGuestDet(GuestVO guestVO) {
        if ( guestVO == null ) {
            return null;
        }

        Guest guest = new Guest();

        guest.setFirstName( guestVO.getFirstName() );
        guest.setLastName( guestVO.getLastName() );
        guest.setAge( guestVO.getAge() );
        guest.setGender( guestVO.getGender() );
        guest.setUserName( guestVO.getUserName() );
        guest.setPassword( guestVO.getPassword() );
        guest.setUserType( guestVO.getUserType() );
        guest.setUserStatus( guestVO.getUserStatus() );

        return guest;
    }
}
