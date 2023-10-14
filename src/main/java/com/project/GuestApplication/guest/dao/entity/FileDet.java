package com.project.GuestApplication.guest.dao.entity;

import com.project.GuestApplication.guest.vo.InputVO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name="GUESTDETAILS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FileDet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guestdetails_seq")
    @SequenceGenerator(name = "guestdetails_seq", sequenceName = "guestdetails_seq", allocationSize = 1)
    @Column(name="FILEID", nullable = false)
    private Integer fileId;

    @Column(name="FILNAM")
    private String fileName;

    @Column(name="FILTYP")
    private String fileType;

    @Column(name="CACHEKEY")
    private String cacheKey;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SERNUM", nullable = false)
    private Guest guest;

    @Column(name = "APPRVLSTA")
    private String approvalSta;

    public FileDet uploadDetails(InputVO inputVO){
        setFileName(inputVO.getFileName());
        setFileType(inputVO.getFileType());
        setCacheKey(inputVO.getCacheKey());
        return this;
    }
}
