package com.example.jwtPractice.Service;

import com.example.jwtPractice.Models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
   private List<User> userList = new ArrayList<>();
    public UserService(){
        User user1 = new User("ishan", "11111111");
        userList.add(user1);
    }
    public String getUser() {
        return "getting user from service";
    }

    public String getUsers() {
        System.out.println("getting users from list");
        String ans = "";
        for(int i=0; i<userList.size(); i++){
            ans+= userList.get(i).getUsername();
            return ans;
        }
     //   return this.userList;
        return "";
    }
}
