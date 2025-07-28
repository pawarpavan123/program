package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class contro {
	@RequestMapping(value = "/home")
	public String home() {

		return "home";

	}

	@RequestMapping(value = "/staticdata")
	public String view() {
		return "redirect:static/staticdata.html";

	}

	@RequestMapping(value = "/reg")
	public String Reg() {
		return "redirect:view/reg.jsp";

	}
	@RequestMapping(path = "/register")
	public String ad(@RequestParam("username") String uname, @RequestParam("email") String email, @RequestParam("pass") String pass,Model m) {
	System.out.println(uname);	
	System.out.println(email);	
	System.out.println(pass);
	return "reg";
	}

//@RequestMapping(value="/welcome")
//public String welcome (@RequestParam("first_name")String first_name,
//		@RequestParam("last_name")String last_name,
//		@RequestParam("username")String username,
//		@RequestParam("password")String password,
//		@RequestParam("address")String address,
//		@RequestParam("contact")String contact) {
//	System.out.println("loaded");
//	return "redirect:page/welcome";

}
