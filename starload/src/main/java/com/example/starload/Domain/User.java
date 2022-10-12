package com.example.starload.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * idx
     */
    private int userCode;

    /**
     * 이메일
     */
    private String userEmail;

    /**
     * 아이디
     */
    private String userid;

    /**
     * 이름
     */
    private String userName;

    /**
     * 비밀번호
     */
    private String userpw;

    /**
     * 전화번호
     */
    private String phoneNumber;
}
