package com.example.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
  @RequestMapping(value = "/test")
  public String test()
  {
    return "It's working";
  }
}
