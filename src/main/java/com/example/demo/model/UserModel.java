package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class UserModel {
  @NotNull private int userID;
  @NotNull private String userName;
  @NotNull private String userEmail;
  @NotNull private String password;
}
