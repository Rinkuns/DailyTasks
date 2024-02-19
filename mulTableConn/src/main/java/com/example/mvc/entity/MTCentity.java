package com.example.mvc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Car_Details")
public class MTCentity {

	@Id
	@Column(name="Car_No")
	private String carNo;
	
	@Column(name="Car_Name")
	private String carName;
	
	@Column(name="Car_Id")
	private Integer carId;
}
