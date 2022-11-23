package com.example.starload.Controller;

import com.example.starload.Domain.User;
import com.example.starload.Service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.security.crypto.password.PasswordEncoder;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class MainAccountRestController {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/signup.do")
    @ApiOperation("유저 컬럼 생성")
    public Object addUser(@RequestBody User user) {

        //LoggerFactory.getLogger(getClass()).info("이이이 : 성?공");
        System.out.println(user.toString());
        userService.register(user);
        return user;
    }
    @PostMapping("/signin.do")
    @ApiOperation("로그인 요청")
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