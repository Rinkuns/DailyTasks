package com.example.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.dto.UserDto;
import com.example.rest.service.UserSeervice;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {
	
	@Autowired
    private UserSeervice userSeervice;
	 @PostMapping(path = "/save")
	    public String saveEmployee(@RequestBody UserDto userDto)
	    {
	        String id = userSeervice.addUser(userDto);
	        return id;
	    }
}
