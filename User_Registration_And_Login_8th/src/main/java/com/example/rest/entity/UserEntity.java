package com.example.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="User_Details")
public class UserEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer id;
	
	@Column(name="user_emailId")
    //@Email(message = "Email should be valid")
	private String emailId;
	
	@Column(name="user_mob")
    //@Pattern(regexp = "[6-9]\\d{9}", message = "Mobile number should start with 6, 7, 8, or 9 and should be 10 digits long")
	private Long mobNumber;
	
	//@NotBlank(message = "Username is required")
	@Column(name="user_name")
	private String userName;

	public UserEntity(Integer id, String emailId, Long mobNumber, String userName) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.mobNumber = mobNumber;
		this.userName = userName;
	}
	
	
}
