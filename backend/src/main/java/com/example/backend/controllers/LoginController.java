package com.example.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entities.LoginObject;
import com.example.backend.services.LoginService;


@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginService service;

    @PostMapping()
    public @ResponseBody String Login(@RequestBody LoginObject loginObject) {
        return service.checkUsernameAndPassword(loginObject.username, loginObject.password);
    }

}
