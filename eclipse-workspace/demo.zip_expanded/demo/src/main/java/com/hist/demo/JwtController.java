package com.hist.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hist.demo.mapper.JwtMapper;
import com.hist.demo.vo.JwtUser;

@RestController
public class JwtController {
	
	@Autowired
	JwtMapper jwtMapper;
	
	@RequestMapping("/jwt-users")
	public List<JwtUser> jwtUsers(){
		return jwtMapper.selectUsers();
	}
	
	@RequestMapping("/jwt-user")
	public List<JwtUser> jwtUser(@RequestParam(value = "name", defaultValue = "") String name){
		return jwtMapper.selectUser(name);
	}
}
