package com.example.starload.Controller;

import com.example.starload.DTO.UserImpoForm;
import com.example.starload.Entity.ReqUserData;
import com.example.starload.Repository.UserImpoRepository;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class MainAccountRestController {

    private final UserImpoRepository UserImpoRepository;
    public MainAccountRestController(UserImpoRepository UserImpoRepository) {
        this.UserImpoRepository = UserImpoRepository;
    }

    @PostMapping("/signup")
    public String ReqSignup(@RequestBody UserImpoForm UserData) {
        String UserName = UserData.Get("UserName");
        String UserEmail = UserData.Get("UserEmail");
        String UserPhoneNumber = UserData.Get("UserPhoneNumber");
        String UserID = UserData.Get("UserID");
        String UserPW = UserData.Get("UserPW");

        if(UserName.length() <= 2) return "short_Name";
        if(UserName.length() >= 20) return "long_Name";
        if(UserEmail.indexOf("@") == -1) return "NoEmail";
        if(UserPhoneNumber.length() != 11) return "NoPhoneNumber";
        if(UserID.length() <= 4) return "short_ID";
        if(UserID.length() >= 20) return "long_ID";
        //if(UserName) return "SameID";
        if(UserPW.length() <= 4) return "short_PW";
        if(UserPW.length() >= 20) return "long_PW";

        System.out.println("Reqest login : " + UserName);

        ReqUserData reqsignup = UserData.toEntity();
        ReqUserData saved = UserImpoRepository.save(reqsignup);

        return "success";
    }

    /*@PostMapping("/signup{UserID}")
    public String ReqSignup(@PathVariable("UserID") String UserID) {
        System.out.println(UserID + "\n" + UserPW);

        return "post!";
    }*/
}
