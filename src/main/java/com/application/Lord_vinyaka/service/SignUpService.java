package com.application.Lord_vinyaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.application.Lord_vinyaka.dto.UserRegisterDTO;
import com.application.Lord_vinyaka.entity.UserCredentialsAccoount;
import com.application.Lord_vinyaka.entity.UserProfile;
import com.application.Lord_vinyaka.service.repo.SignRepo;
import com.application.Lord_vinyaka.service.repo.UserCredentials;
@Controller
public class SignUpService {
	
	@Autowired
	private SignRepo signupRepo;
	@Autowired
	private UserCredentials uc;
	public UserProfile insert(UserRegisterDTO user) {
		
		UserProfile profile= new UserProfile();
		profile.setName(user.getName());
		profile.setLastName(user.getLastName());
		profile.setMotherName(user.getMotherName());
		profile.setFatherName(user.getFatherName());
		profile.setEmail(user.getEmail());
		profile.setVillage(user.getVillage());
		profile.setPhoneNumber(user.getPhoneNumber());
		UserProfile profileResult=signupRepo.save(profile);// to save  into userprofile table
		
		UserCredentialsAccoount uca=new UserCredentialsAccoount(); // to store User credentials id  with email and pwd
		uca.setUserID(profileResult.getUserId());
		uca.setUserName(user.getUserName());
		uca.setUserPassword(user.getPassword());
		uc.save(uca);
		return profileResult;
		
		
		
		
		
		
		
	}

}
