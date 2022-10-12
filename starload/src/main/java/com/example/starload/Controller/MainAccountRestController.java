package com.example.starload.Controller;

import batang.common.Controller.RestControllerStrategy;
import com.example.starload.Domain.User;
import com.example.starload.Service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import batang.common.Controller.CommonRestControllerPrototype;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/user")
public class MainAccountRestController extends CommonRestControllerPrototype {
    @Autowired
    private UserService userService;

    @PostMapping("/user-add")
    @ModelAttribute()
    public ResponseEntity<?> addUser(HttpServletRequest request, User user) {
        return controllerContext.execute(new RestControllerStrategy() {
            @Override
            public Object execute() {
                LoggerFactory.getLogger(getClass()).info("woogong : ");

                return userService.register(user);
            }
        });
    }
    @PostMapping("/login")
    public String Reqlogin(@RequestBody String data) {
        //UserData find = UserImpoRepository.findByUserID("cksgur0612");

        return "success";
    }
}
