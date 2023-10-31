package com.example.jwtPractice.Models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Builder
public class JwtRequest {
    private  String username;
    private String password;
 //   private String roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
