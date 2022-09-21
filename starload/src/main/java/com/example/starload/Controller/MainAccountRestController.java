package com.example.starload.Controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/account")
public class MainAccountRestController {
    @PostMapping("/signup")
    public String ReqSignup(@RequestBody HashMap<String, Object> UserData) {
        String UserName = UserData.get("UserName").toString();
        String UserEmail = UserData.get("UserEmail").toString();
        String UserPhoneNumber = UserData.get("UserPhoneNumber").toString();
        String UserID = UserData.get("UserID").toString();
        String UserPW = UserData.get("UserPW").toString();

        if(UserName.length() <= 2) return "short_Name";
        if(UserName.length() >= 20) return "long_Name";
        if(UserEmail.indexOf("@") == -1) return "NoEmail";
        if(UserPhoneNumber.length() != 11) return "NoPhoneNumber";
        if(UserID.length() <= 4) return "short_ID";
        if(UserID.length() >= 20) return "long_ID";
        //if(UserName) return "SameID";
        if(UserPW.length() <= 4) return "short_PW";
        if(UserPW.length() >= 20) return "long_PW";
        return "success";
    }

    /*@PostMapping("/signup{UserID}")
    public String ReqSignup(@PathVariable("UserID") String UserID) {
        System.out.println(UserID + "\n" + UserPW);

        return "post!";
    }*/
}
