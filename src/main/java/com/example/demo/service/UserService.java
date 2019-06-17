package com.example.demo.service;

import com.example.demo.entity.UserData;
import com.example.demo.model.UserModel;
import com.example.demo.repository.Userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired private Userdao logindao;

  public Boolean getUser(UserData userData) {
    Boolean isUser = logindao.existsById(userData.getUserID());
    return isUser;
  }

  public UserData addUser(UserModel userModel) {

    UserData userData =
        UserData.builder()
            .userID(userModel.getUserID())
            .userEmail(userModel.getUserEmail())
            .userName(userModel.getUserName())
            .password(userModel.getPassword())
            .build();


    UserData isUserCreated = logindao.save(userData);
    return isUserCreated;
  }
}
