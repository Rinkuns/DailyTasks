package com.example.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.rest.dto.UserDto;
import com.example.rest.entity.UserEntity;
import com.example.rest.repository.UserRepo;
@Service
public class UserServiceImpl implements UserSeervice {

	@Autowired
	private UserRepo userRepo;
	@Autowired
    private PasswordEncoder passwordEncoder;
	@Override
	public String addUser(UserDto userDto) {
		 UserEntity userEntity = new UserEntity(
	                userDto.getId(),
	                userDto.getUserName(),
	                userDto.getMobNumber(),
	               this.passwordEncoder.encode(userDto.getEmailId()));
		 userRepo.save(userEntity);
	        return userEntity.getUserName();
	}

	
}
