package com.soda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soda.beans.News;
import com.soda.service.NewsService;

@Controller
@RequestMapping
public class LoginController {
	 @Autowired
	 private NewsService newsService;
	 @Value("${com.name}")
	 private String name;
	 @RequestMapping("/")
	public String indexSwagger(){
		
		return "redirect:swagger-ui.html";
	}
	@RequestMapping("/login")
	public String login(ModelMap model){
//		News news=newsService.findById(215);
		System.out.println("======ss===ssss赛事ssssss==ss==tt="+name);
		return "login";
	}
	@RequestMapping("/index")
	public String index(ModelMap model){
		model.addAttribute("hello", "13212");
		return "index";
	}
}
