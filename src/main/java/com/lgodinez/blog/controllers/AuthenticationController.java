package com.lgodinez.blog.controllers;
import com.lgodinez.blog.Repositories.UserRepository;
import com.lgodinez.blog.models.AuthenticateRequest;
import com.lgodinez.blog.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/authenticate")
    public ResponseEntity<User> authenticate( @RequestBody AuthenticateRequest request){

        User user = userRepository.findByEmail(request.getEmail());
        if (user!=null){
            int equal=user.getPassword().compareTo(request.getPassword());
            if (equal==0){
                return ResponseEntity.ok(user);
            }
            else{
                return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);

            }
        }else{
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }
}
