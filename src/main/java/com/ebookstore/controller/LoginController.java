package com.ebookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class LoginController {
	
	@RequestMapping("/login")
	String login(@RequestParam(value="error" , required= false) String error , 
			@RequestParam (value="logout" , required= false) String logout, 
			Model model){

		if (error != null)		{
		model.addAttribute("error", "Invalid Credentials");
		System.out.println("error");
		}
		if(logout !=null){
		model.addAttribute("logout", "You have been logout Successfully,Thanks");
		}
		
		return "login";
	}

}
