package com.example.backend.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
  public String checkUsernameAndPassword(String username, String password) {
    if(username.equals("Blaine") && password.equals("kbh122998")){
      return "Success";
    }else{
      return "Fail";
    }
  }
}
