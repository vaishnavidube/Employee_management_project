package com.example.empmanagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;


import com.example.empmanagement.dto.UserRegistrationDto;
import com.example.empmanagement.model.User;
public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
