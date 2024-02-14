package com.example.rest.service;

import java.util.List;

import com.example.rest.entity.StudentEntity;

public interface StudentService {

	public String upsert(StudentEntity studentEntity);
	
	public StudentEntity getById(Integer id);
	
	public List<StudentEntity>getAllStudents();
	
	public String deleteById(Integer id);
}
