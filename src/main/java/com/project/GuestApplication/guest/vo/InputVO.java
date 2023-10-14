package com.project.GuestApplication.guest.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.sql.In;

@Getter
@Setter
public class InputVO {

    private String fileName;

    private String fileType;

    private String cacheKey;

    private Integer userId;

    private Integer fileId;

    private String apprvlSta;
}
