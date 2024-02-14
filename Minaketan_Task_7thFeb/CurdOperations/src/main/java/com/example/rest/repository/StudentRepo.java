package com.example.rest.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.rest.entity.StudentEntity;
public interface StudentRepo extends JpaRepository<StudentEntity, Serializable> {

}
