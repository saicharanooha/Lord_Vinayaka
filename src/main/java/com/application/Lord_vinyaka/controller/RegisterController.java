package com.application.Lord_vinyaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.Lord_vinyaka.dto.UserRegisterDTO;
import com.application.Lord_vinyaka.service.SignUpService;
@Controller
public class RegisterController {
	@Autowired
	private SignUpService signupService;
	
	// Method  developed to do to take input from  user signup
	@GetMapping("/signup")
	public ModelAndView newUserRegistartion() {
		ModelAndView view = new ModelAndView();
		view.addObject("key", new UserRegisterDTO());
		view.setViewName("NEW_USER_SIGN_UP");
		return view;
	}
	
	@PostMapping("/signup")// to handle sign up request after input
	public ModelAndView newUserRegistartion(@ModelAttribute("key") UserRegisterDTO user) {
		ModelAndView view = new ModelAndView();
		view.addObject("result", signupService.insert(user));
		view.setViewName("signupresult");
		return view;
	
	}

}
