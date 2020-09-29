package com.lgodinez.blog.controllers;

import com.lgodinez.blog.Repositories.UserRepository;
import com.lgodinez.blog.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class RegistrationController {

    @Autowired
    UserRepository userRepository;


    @PostMapping("/register")
    public User register(@RequestBody User user) throws Exception{

        if( this.userRepository.findByEmail(user.getEmail()) != null ){
            throw new Exception("Email is already registered");
        }
        else {
            String x="user";
            user.setRole(x);
            return this.userRepository.save(user);
        }
    }
}
