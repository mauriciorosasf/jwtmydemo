package com.test.jwt.jwtdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.test.jwt.jwtdemo.dto.ResponseToken;
import com.test.jwt.jwtdemo.dto.LoginDto;
import com.test.jwt.jwtdemo.service.LoginService;

@RestController
@RequestMapping("/auth")
public class LoginController {

    private LoginService authService;

    public LoginController(LoginService authService) {
		this.authService = authService;
	}

    @PostMapping("/login")
    public ResponseEntity<ResponseToken> login(@RequestBody LoginDto loginDto){
        String token = authService.login(loginDto);

        ResponseToken jwtAuthResponse = new ResponseToken();
        jwtAuthResponse.setToken(token);

        return new ResponseEntity<>(jwtAuthResponse, HttpStatus.OK);
    }

}
