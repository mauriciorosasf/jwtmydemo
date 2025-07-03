package com.test.jwt.jwtdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.jwt.jwtdemo.dto.MessageDto;

@RestController
public class SecretController {

    @PreAuthorize("hasRole('STAFF')")
    @GetMapping("/staff")
    public MessageDto staff(){
        return new MessageDto("this is staff");
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public MessageDto user(){
    	 return new MessageDto("this is user");
       
    }
}

