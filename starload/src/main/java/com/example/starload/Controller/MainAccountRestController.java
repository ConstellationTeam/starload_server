package com.example.starload.Controller;

import batang.common.Controller.RestControllerStrategy;
import com.example.starload.Domain.User;
import com.example.starload.Service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import batang.common.Controller.CommonRestControllerPrototype;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/user")
public class MainAccountRestController extends CommonRestControllerPrototype {
    @Autowired
    private UserService userService;
    @PostMapping("/user-add")
    public ResponseEntity<?> addUser(HttpServletRequest request, User user) {
        return controllerContext.execute(new RestControllerStrategy() {
            @Override
            public Object execute() {
                return userService.register(user);
            }
        });
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
