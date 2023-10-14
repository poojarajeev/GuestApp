package com.project.GuestApplication.guest.modal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InputDetails {

    @JsonProperty("file_name")
    private String fileName;

    @JsonProperty("file_type")
    private String fileType;

    @JsonProperty("cache_key")
    private String cacheKey;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("file_id")
    private Integer fileId;
}
