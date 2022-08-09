package com.example.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.backend.entities.NewUser;
import com.example.backend.entities.User;
import com.example.backend.repositories.UserRepository;

@Controller
@RequestMapping(path = "/users")
public class UserController {
  @Autowired
  private UserRepository userRepository;

  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewUser(@RequestBody NewUser newUser) {

    User n = new User();
    n.setFirstName(newUser.firstName);
    n.setLastName(newUser.lastName);
    n.setEmail(newUser.email);
    n.setIsTeacher(newUser.isTeacher);
    userRepository.save(n);
    return "Saved";

  }

  @GetMapping(path="/getAll")
  public @ResponseBody Iterable<User> getAllUsers() {
    return userRepository.findAll();
  }

  @PostMapping(value="/deleteById")
  public @ResponseBody String deleteUser(@RequestBody Integer id) {
      userRepository.deleteById(id);
      return "Deleted";
  }

}