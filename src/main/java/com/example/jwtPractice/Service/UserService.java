package com.example.jwtPractice.Service;

import com.example.jwtPractice.Models.User;
import com.example.jwtPractice.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
 @Autowired
 private UserRepo userRepo;

 @Autowired
 private PasswordEncoder passwordEncoder;

    public User getUser(String username) {
        User user = userRepo.findByUsername(username);

        return user;
      //  return "getting user from service";
    }

    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public String save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        userRepo.save(user);
        return "user added";
    }
}
