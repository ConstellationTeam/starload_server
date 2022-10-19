package com.example.starload.Controller;

import batang.common.Controller.RestControllerStrategy;
import com.example.starload.Domain.User;
import com.example.starload.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.security.crypto.password.PasswordEncoder;
import batang.common.Controller.CommonRestControllerPrototype;

import java.io.IOException;

@RestController
@RequestMapping("/api/user")
public class MainAccountRestController extends CommonRestControllerPrototype {
    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/signup.do")
    @ModelAttribute()
    public ResponseEntity<?> addUser(@RequestBody User user) {
        return controllerContext.execute(new RestControllerStrategy() {
            @Override
            public Object execute() {
                //LoggerFactory.getLogger(getClass()).info("이이이 : 성?공");
                System.out.println(user.toString());
                userService.register(user);
                return user;
            }
        });
    }
    @PostMapping("/signin.do")
    public ResponseEntity<?> getUser(@RequestBody User user) {
        System.out.println(user + ";");

        return controllerContext.execute(new RestControllerStrategy() {
            User origin = userService.get(user.getUserIdentity());
            @Override
            public Object execute() {
                if(origin == null) {
                    return "cannot find User["+ user.getUserIdentity() +"]!!";
                } else if(passwordEncoder.matches(user.getUserPassword(), origin.getUserPassword())) {
                    return origin;
                } else {
                    return "not match password!!";
                }
            }
        });
    }
}