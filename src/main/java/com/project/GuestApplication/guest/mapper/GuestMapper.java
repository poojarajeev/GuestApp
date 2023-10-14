package com.project.GuestApplication.guest.mapper;

import com.project.GuestApplication.guest.modal.GuestDetails;
import com.project.GuestApplication.guest.modal.InputDetails;
import com.project.GuestApplication.guest.modal.UserFilterData;
import com.project.GuestApplication.guest.vo.GuestVO;
import com.project.GuestApplication.guest.vo.InputVO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE, componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface GuestMapper {

    GuestVO constructUserDetails(GuestDetails guestDetails);

    InputVO constructInputDetails(InputDetails inputDetails);

    GuestVO constructFilterUserDetails(UserFilterData userFilterData);


}
