package com.example.starload.Domain;

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
    private Integer userCode;

    /**
     * 이메일
     */
    private String userEmail;

    /**
     * 아이디
     */
    private String userIdentity;

    /**
     * 이름
     */
    private String userName;

    /**
     * 비밀번호
     */
    private String userPassword;

    /**
     * 전화번호
     */
    private String userPhoneNumber;
}
