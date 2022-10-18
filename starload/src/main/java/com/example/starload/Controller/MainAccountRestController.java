package com.example.starload.Controller;

import batang.common.Controller.RestControllerStrategy;
import com.example.starload.Domain.User;
import com.example.starload.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import batang.common.Controller.CommonRestControllerPrototype;

import java.io.IOException;

@RestController
@RequestMapping("/api/user")
public class MainAccountRestController extends CommonRestControllerPrototype {
    @Autowired
    private UserService userService;

    @PostMapping("/signup.do")
    @ModelAttribute()
    public ResponseEntity<?> addUser(@RequestBody User user) {
        return controllerContext.execute(new RestControllerStrategy() {
            @Override
            public Object execute() {
                //LoggerFactory.getLogger(getClass()).info("이이이 : 성?공");
                System.out.println(user.getUserName());
                return userService.register(user);
            }
        });
    }
    @PostMapping("/login.do")
    public ResponseEntity<?> getUser(@RequestParam(value = "id") String data) {
        System.out.println(data + ";");

        return controllerContext.execute(new RestControllerStrategy() {
            @Override
            public Object execute() {
                return userService.get(data);
            }
        });
    }
}
