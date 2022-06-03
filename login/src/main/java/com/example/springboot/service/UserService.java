package com.example.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.springboot.model.User;
import com.example.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
