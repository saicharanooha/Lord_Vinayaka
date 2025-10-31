package com.application.Lord_vinyaka.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserCredentialsAccoount { // Class is designed to store user credentials  and each user is identified based on id 
	                                 
  
	@Id
	 public int userID;// id comes from user profile table
	 public String userName;
	 public String userPassword;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int i) {
		this.userID = i;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public UserCredentialsAccoount(short userID, String userName, String userPassword) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	public UserCredentialsAccoount() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}
