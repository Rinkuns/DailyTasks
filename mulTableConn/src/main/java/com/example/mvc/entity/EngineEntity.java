package com.example.mvc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Engine_Details")
public class EngineEntity {

	@Id
	@Column(name="Engine_No")
	private String engineNo;
	
	@Column(name="Engine_Name")
	private String engineName;
	
	@Column(name="Engine_Id")
	private Integer engineId;
	
}
