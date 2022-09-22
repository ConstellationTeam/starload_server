package com.example.starload.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class MainModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserCode;
    private String UserID;
    private String UserPW;
    private String UserName;
    private String UserEmail;
    private String UserPhoneNumber;
}