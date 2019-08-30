package com.hist.demo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JwtUser {

	public JwtUser() {}
	
	public JwtUser(String username, String password, String roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
	}

	private String username;

	@JsonProperty(value = "password", access = JsonProperty.Access.WRITE_ONLY)
	private String password;

	private String roles;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
	
}