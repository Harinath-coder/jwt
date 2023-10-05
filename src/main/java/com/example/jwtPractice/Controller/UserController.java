package com.example.jwtPractice.Controller;

import com.example.jwtPractice.Models.User;
import com.example.jwtPractice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String getUser(){
        return userService.getUser();
    }

    @GetMapping("/getusers")
    public String getUsers(){
        return userService.getUsers();
    }
}
