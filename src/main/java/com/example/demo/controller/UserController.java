package com.example.demo.controller;

import com.example.demo.entity.UserData;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

  @Autowired private UserService loginService;

  @GetMapping("/service")
  public boolean displayLogin(UserData userData) {
    Boolean isUser = loginService.getUser(userData);
    return isUser;
  }

  @PostMapping("/addUser")
  public UserData addUser(@RequestBody @Valid UserModel userModel) {
    UserData isUserCreated = loginService.addUser(userModel);
    return isUserCreated;
  }

  @GetMapping("/greetings")
  public String displayLogin() {
    return "hello";
  }
}
