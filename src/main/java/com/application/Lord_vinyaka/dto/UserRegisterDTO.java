package com.application.Lord_vinyaka.dto;

public class UserRegisterDTO {

	
	String name;
	String lastName;
	String motherName;
	String fatherName;
	String village;
	long phoneNumber;
	String email;
	String userName;
	String password;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRegisterDTO(String name, String lastName, String motherName, String fatherName, String village,
			long phoneNumber, String email, String userName, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.village = village;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}
	public UserRegisterDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
