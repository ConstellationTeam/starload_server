package com.example.starload.Controller;

import com.example.starload.Domain.User;
import com.example.starload.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.security.crypto.password.PasswordEncoder;

@RestController
@RequestMapping("/api/user")
public class MainAccountRestController {
    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/signup.do")
    @ModelAttribute()
    public Object addUser(@RequestBody User user) {

        //LoggerFactory.getLogger(getClass()).info("이이이 : 성?공");
        System.out.println(user.toString());
        userService.register(user);
        return user;
    }
    @PostMapping("/signin.do")
    public Object getUser(@RequestBody User user) {
        System.out.println(user + ";");

        User origin = userService.get(user.getUserIdentity());
        if(origin == null) {
            return "cannot find User["+ user.getUserIdentity() +"]!!";
        } else if(passwordEncoder.matches(user.getUserPassword(), origin.getUserPassword())) {
            return origin;
        } else {
            return "not match password!!";
        }
    }
}