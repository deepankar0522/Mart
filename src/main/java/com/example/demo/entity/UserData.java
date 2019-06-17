package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Data
@Entity
@Table(name = "user_data")
@NoArgsConstructor
@AllArgsConstructor
public class UserData {
	@Id
	private int userID;
	private String userName;
	private String userEmail;
	private String password;
	

}
