package com.test.jwt.jwtdemo.dto;

public class LoginDto {
    private String user;
    private String password;
    
	public LoginDto() {
	}
	public LoginDto(String user, String password) {
		this.user = user;
		this.password = password;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
