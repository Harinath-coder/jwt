package com.example.jwtPractice.Controller;

import com.example.jwtPractice.Models.User;
import com.example.jwtPractice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder encoder;

    @GetMapping("/user")
    public User getUser(@RequestParam("username") String username){

        User user = userService.getUser(username);
        return user;
    }

    @GetMapping("/getusers")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/getAdmin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String adminPage(){
        return "getting admin services";
    }
}
