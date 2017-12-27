package com.soda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("/login")
	public String login(ModelMap model){
		model.addAttribute("hello", "13212");
		System.out.println("=========ssssssss=====");
		return "index";
	}
	@RequestMapping("/index")
	public String index(ModelMap model){
		model.addAttribute("hello", "13212");
		return "index";
	}
}
