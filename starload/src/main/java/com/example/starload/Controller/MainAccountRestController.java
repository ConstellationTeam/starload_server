package com.example.starload.Controller;

import com.example.starload.DTO.UserImpoForm;
import com.example.starload.Entity.UserData;
import com.example.starload.Repository.UserImpoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        if(!UserEmail.contains("@")) return "NoEmail";
        if(UserPhoneNumber.length() != 11) return "NoPhoneNumber";
        if(UserID.length() <= 4) return "short_ID";
        if(UserID.length() >= 20) return "long_ID";
        //if(UserName) return "SameID";
        if(UserPW.length() <= 4) return "short_PW";
        if(UserPW.length() >= 20) return "long_PW";

        System.out.println("Reqest login : " + UserName);
        com.example.starload.Entity.UserData reqsignup = UserData.toEntity();
        com.example.starload.Entity.UserData saved = UserImpoRepository.save(reqsignup);

        return "success";
    }
    @PostMapping("/login")
    public String Reqlogin(@RequestBody String data) {
        //UserData find = UserImpoRepository.findByUserID("cksgur0612");

        return "success";
    }

    /*@PostMapping("/signup{UserID}")
    public String ReqSignup(@PathVariable("UserID") String UserID) {
        System.out.println(UserID + "\n" + UserPW);

        return "post!";
    }*/
}
