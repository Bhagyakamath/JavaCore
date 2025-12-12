package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentEntity;

@Repository
public interface StudentInterface extends JpaRepository<StudentEntity, String>{
	public List<StudentEntity> findByName(String name);
}
