package com.test.jwt.jwtdemo.service;

import com.test.jwt.jwtdemo.dto.LoginDto;

public interface LoginService {
    String login(LoginDto loginDto);
}
