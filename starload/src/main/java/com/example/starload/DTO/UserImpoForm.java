package com.example.starload.DTO;

import com.example.starload.Entity.ReqUserData;

public class UserImpoForm {
    private String UserID;
    private String UserPW;

    private String UserName;
    private String UserEmail;
    private String UserPhoneNumber;

    public UserImpoForm(String UserID, String UserPW, String UserName, String UserEmail, String UserPhoneNumber) {
        this.UserID = UserID;
        this.UserPW = UserPW;
        this.UserName = UserName;
        this.UserEmail = UserEmail;
        this.UserPhoneNumber = UserPhoneNumber;
    }

    public String Get(String target) {
        switch (target)
        {
            case "UserID":
                return this.UserID;
            case "UserPW":
                return this.UserPW;
            case "UserName":
                return this.UserName;
            case "UserEmail":
                return this.UserEmail;
            case "UserPhoneNumber":
                return this.UserPhoneNumber;
        }
        return "NULL";
    }

    @Override
    public String toString() {
        return "UserImpo {" +
                "UserID=" + UserID +
                ", UserPW=" + UserPW +
                ", UserName=" + UserName +
                ", UserEmail=" + UserEmail +
                ", UserPhoneNumber=" + UserPhoneNumber +
                "}";
    }

    public ReqUserData toEntity() {
        return new ReqUserData(null, UserID, UserPW, UserName, UserEmail, UserPhoneNumber);
    }
}
