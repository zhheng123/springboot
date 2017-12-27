package com.soda.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration 
public class IndexController {

	@Value("${com.name}")
	private String name;
	@Value("${com.pwd}")
	private String pwd;
	@RequestMapping("/")  
    String home() {  
        return "Hello World!"+name;  
    }  
	@RequestMapping("/index")
	@ResponseBody
	public Map index(){
		Map<String,Object>rs=new HashMap<String,Object>();
		rs.put("flag","1");
		return rs;
	}

}
