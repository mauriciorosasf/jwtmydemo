package com.test.jwt.jwtdemo.dto;

public class ResponseToken {
    private String token;

	public ResponseToken(String token) {
		this.token = token;

	}
	public ResponseToken() {
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

    
    
}
