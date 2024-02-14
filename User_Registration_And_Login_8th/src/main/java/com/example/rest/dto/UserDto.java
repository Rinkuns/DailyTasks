package com.example.rest.dto;

import lombok.Data;

@Data
public class UserDto {

	private Integer id;

	private String emailId;

	private Long mobNumber;

	private String userName;

	public  UserDto() {
		
	}
	public UserDto(Integer id, String emailId, Long mobNumber, String userName) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.mobNumber = mobNumber;
		this.userName = userName;
	}

	
}
