package com.example.starload.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class MainAccountRestController {
    @PostMapping("/signup/{UserID}/{UserPW}/{UserName}/{UserEmail}/{UserPhoneNumber}")
    public String ReqSignup(@PathVariable("UserID") String UserID,
                       @PathVariable("UserPW") String UserPW,
                       @PathVariable("UserName") String UserName,
                       @PathVariable("UserEmail") String UserEmail,
                       @PathVariable("UserPhoneNumber") String UserPhoneNumber
    ) {
        System.out.println(UserID + "\n" + UserPW);

        return "post!";
    }
}
