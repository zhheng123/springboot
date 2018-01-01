package com.soda.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soda.beans.News;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
@Api(value="首页controller",description="首页操作",tags={"首页操作接口"})
@RestController
public class IndexController {

	
	
	@ApiOperation("首页信息")
	/*@ApiImplicitParams({
		  @ApiImplicitParam(name="username",value="用户名",dataType="string", paramType = "query",example="xingguo"),
		  @ApiImplicitParam(name="id",value="用户id",dataType="long", paramType = "query")
		 })*/
	@GetMapping("/hello/index")
	public Map index(@ApiParam(name="id",value="用户id",required=true) Long id,@ApiParam(name="username",value="用户名") String username){
		Map<String,Object>rs=new HashMap<String,Object>();
		rs.put("flag","1");
		return rs;
	}
	@ApiOperation("首页信息1111")
	@PostMapping("/hello/index1")
	public Map index1(@RequestBody @ApiParam(name="用户对象",value="传入json格式",required=true) News user){
		Map<String,Object>rs=new HashMap<String,Object>();
		rs.put("flag","1");
		return rs;
	}
	@ApiOperation("首页信息2222")
	@PostMapping("/hello/index2")
	public Map index2( @Validated   News news){
		Map<String,Object>rs=new HashMap<String,Object>();
		rs.put("flag","1");
		return rs;
	}

}
