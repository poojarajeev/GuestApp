package com.project.GuestApplication.guest.controller;

import com.project.GuestApplication.guest.modal.GuestDetails;
import com.project.GuestApplication.guest.service.GuestService;
import com.project.GuestApplication.guest.vo.GuestVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.doReturn;

@RunWith(JunitPlatform.class)
public class ControllerTest {

    @InjectMocks
    private Controller guestController;

    @Mock
    private GuestService guestService;

    @Mock
    private GuestDetails guestDetails;

    @Mock
    private GuestMapper guestMapper;

    @BeforeEach
    public void setup() throws Exception{
        MockitoAnnotations.initMocks(this);
        GuestDetails guestDetails = new GuestDetails();
        guestDetails.setSerialNo(123);
        guestDetails.setFirstName("abc");
        guestDetails.setAge(12);
    }

    @Test
    public void shouldCreateAcc() {
        GuestVO guestVO=new GuestVO();
        doReturn(guestVO).when(guestMapper).constructUserDetails(guestDetails);
        doReturn(guestDetails).when(guestService).createAcc(guestVO);
        assertDoesNotThrow(() -> guestController.createAcc(guestDetails));
    }

    @Test
    public void shouldLogin() {
        GuestVO guestVO=new GuestVO();
        doReturn(guestVO).when(guestMapper).constructUserDetails(guestDetails);
        doReturn(guestDetails).when(guestService).login(guestVO);
        assertDoesNotThrow(() -> guestController.login(guestDetails));
    }


}
