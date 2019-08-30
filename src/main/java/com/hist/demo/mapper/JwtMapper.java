package com.hist.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hist.demo.vo.JwtUser;

@Mapper
public interface JwtMapper {
	public List<JwtUser> selectUsers();
	public List<JwtUser> selectUser(String name);
}
