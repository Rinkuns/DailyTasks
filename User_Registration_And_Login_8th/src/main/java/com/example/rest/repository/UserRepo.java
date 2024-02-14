package com.example.rest.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.rest.entity.UserEntity;

@EnableJpaRepositories
public interface UserRepo extends JpaRepository<UserEntity, Serializable> {

}
