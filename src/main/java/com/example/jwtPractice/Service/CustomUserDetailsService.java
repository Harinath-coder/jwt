package com.example.jwtPractice.Service;

import com.example.jwtPractice.Models.User;
import com.example.jwtPractice.Models.UserInfoUserDetails;
import com.example.jwtPractice.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user = userRepo.findByUsername(username);
//       System.out.println(user.getUsername());
//       System.out.println(user.getPassword());

        return new UserInfoUserDetails(user);

    }
}
