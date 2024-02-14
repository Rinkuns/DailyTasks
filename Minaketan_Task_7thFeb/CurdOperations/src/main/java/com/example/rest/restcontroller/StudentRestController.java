package com.example.rest.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.entity.StudentEntity;
import com.example.rest.service.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create")
	public ResponseEntity<String> createStudent(@RequestBody StudentEntity studentEntity){
		String status = studentService.upsert(studentEntity);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<StudentEntity>getStudents(@PathVariable Integer id){
		StudentEntity studentEntity = studentService.getById(id);
		return new ResponseEntity<>(studentEntity, HttpStatus.OK);
	}
	
	@GetMapping("/allStudents")
	public ResponseEntity<List<StudentEntity>>getAllStudents(){
		List<StudentEntity> allStudents = studentService.getAllStudents();
		return new ResponseEntity<>(allStudents, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody StudentEntity studentEntity){
		String status = studentService.upsert(studentEntity);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>deleteStudents(@PathVariable Integer id){
		String status = studentService.deleteById(id);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
}
