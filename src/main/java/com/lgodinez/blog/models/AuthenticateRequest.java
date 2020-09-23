package com.lgodinez.blog.models;

import com.lgodinez.blog.controllers.AuthenticationController;


public class AuthenticateRequest {

    public AuthenticateRequest(){
    }

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthenticateRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
