package com.project.GuestApplication.guest.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.GuestApplication.guest.vo.GuestVO;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="GUESTDETAILS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Guest implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guestdetails_seq")
    @SequenceGenerator(name = "guestdetails_seq", sequenceName = "guestdetails_seq", allocationSize = 1)
    @Column(name="SERNO", nullable = false)
    private Integer serialNo;

    @Column(name="FIRSTNAME")
    private String firstName;

    @Column(name="LASTNAME")
    private String lastName;

    @Column(name="AGENO")
    private Integer age;

    @Column(name="GENDER")
    private String gender;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "PWDDET")
    private String password;

    @Column(name = "USRTYP")
    private String userType;

    @Column(name = "USRSTA")
    private String userStatus;

    public Guest updateDetails(GuestVO guestVO){
        setAge(guestVO.getAge());
        setGender(guestVO.getGender());
        setFirstName(guestVO.getFirstName());
        setLastName(guestVO.getLastName());
        setUserName(guestVO.getUserName());
        setPassword(guestVO.getPassword());
        setUserStatus(guestVO.getUserType());
        return this;
    }

}
