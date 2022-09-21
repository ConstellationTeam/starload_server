package com.example.starload.Model.DTO;

import lombok.Data;

@Data
public class ReqSignupDto {
    int UserCode;

    String UserID;
    String UserPW;

    String UserName;
    String UserEmail;
    String UserPhoneNumber;
}
