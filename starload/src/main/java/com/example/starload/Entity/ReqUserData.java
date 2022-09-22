package com.example.starload.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ReqUserData {
    public ReqUserData() {
    }

    @Id
    @GeneratedValue
    private Long UserCode;
    @Column
    private String UserID;
    @Column
    private String UserPW;
    @Column
    private String UserName;
    @Column
    private String UserEmail;
    @Column
    private String UserPhoneNumber;

    public ReqUserData(Long UserCode, String UserID, String UserPW, String UserName, String UserEmail, String UserPhoneNumber) {
        this.UserCode = UserCode;
        this.UserID = UserID;
        this.UserPW = UserPW;
        this.UserName = UserName;
        this.UserEmail = UserEmail;
        this.UserPhoneNumber = UserPhoneNumber;
    }

    @Override
    public String toString() {
        return "ReqUserData{" +
                "UserCode=" + UserCode +
                ",UserPW=" + UserID +
                ",UserName=" + UserName +
                ",UserEmail=" + UserEmail +
                ",UserPhoneNumber=" + UserPhoneNumber +
                '}';
    }
}
