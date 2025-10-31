package com.application.Lord_vinyaka.entity;

import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity 
public class UserProfile {   
	// Class is designed to store User details
	
	// when user wants to sign up , details are collected including username and password then profile details are stored in profile table and username and pwd is stored in separete table with same id

	@Id
    public int userId; //id is genarated from our end , through random object same is used for user_credential to store data
	public String name;
	public String lastName;
	public String motherName;
	public String fatherName;
	public String village;
	public long phoneNumber;
	public String email;
	public int getUserId() {
		return userId;
	}
	public void setUserId(short userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserProfile(short userId, String name, String lastName, String motherName, String fatherName, String village,
			long phoneNumber, String email) {
		super();
		this.userId = userId;
		this.name = name;
		this.lastName = lastName;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.village = village;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public UserProfile() {
	 Random random= new Random();
	 this.userId=random.nextInt(700000, 900000);
		// TODO Auto-generated constructor stub
	}
	
	
	}
