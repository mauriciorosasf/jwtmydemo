package com.test.jwt.jwtdemo.dto;

public class MessageDto {
 private String msg;

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public MessageDto(String msg) {
	super();
	this.msg = msg;
}
 
}
