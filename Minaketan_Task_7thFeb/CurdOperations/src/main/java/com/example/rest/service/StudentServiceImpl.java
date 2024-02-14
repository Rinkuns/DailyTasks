package com.example.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.entity.StudentEntity;
import com.example.rest.repository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo stdentRepo;

	@Override
	public String upsert(StudentEntity studentEntity) {//(Insert & Update)
		stdentRepo.save(studentEntity);
		return "Success";
	}

	@Override
	public StudentEntity getById(Integer id) {
		Optional<StudentEntity> findById = stdentRepo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		
		return null;
	}

	@Override
	public List<StudentEntity> getAllStudents() {
		return stdentRepo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if(stdentRepo.existsById(id)) {
			stdentRepo.deleteById(id);
			return "Successfully Deleted";
		}else
			return "No record found";
		
	}

}
