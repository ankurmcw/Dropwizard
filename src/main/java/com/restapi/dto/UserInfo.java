package com.restapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by renuka on 29/3/17.
 */


public class UserInfo {

    private String userId;

    private String userName;

    public UserInfo() {
    }

    public UserInfo(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    @JsonProperty
    public String getUserId() {
        return userId;
    }

    @JsonProperty
    public String getUserName() {
        return userName;
    }
}

