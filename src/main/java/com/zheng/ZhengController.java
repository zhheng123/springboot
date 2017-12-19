package com.zheng;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration 
public class ZhengController {

	@RequestMapping("/zheng")
	@ResponseBody
	public Map index(){
		Map<String,Object>rs=new HashMap<String,Object>();
		rs.put("flag","1");
		return rs;
	}

}
