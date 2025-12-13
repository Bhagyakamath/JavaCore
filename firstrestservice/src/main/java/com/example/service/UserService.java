package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.dao.StudentInterface;
import com.example.entity.StudentEntity;

@Service
public class UserService {
	@Autowired
	StudentInterface dao;
	@Value("${err1}")
	String s1;
	public String addUser(StudentEntity ob) throws Exception {
		if(dao.findById(ob.getSid()).isPresent()) {
			throw new Exception("User already exists");
		}
		dao.save(ob);
		
		return s1;
	}
	
	public StudentEntity getByUsername(String username) throws Exception {
		StudentEntity student = dao.findByUsername(username);
		if(student==null) {
			throw new Exception("User not found");
		}
		return student;
	}
	
	public StudentEntity getByUsernameAndPassword(String username, String phonenumber) throws Exception {
		StudentEntity student = dao.findByUsernameAndPhonenumber(username, phonenumber);
		if(student==null) {
			throw new Exception("User not found");
		}
		return student;
	}
	
	public String deleteUser(String sid) throws Exception {
		Optional<StudentEntity> student = dao.findById(sid);
		if(student==null) {
			throw new Exception("User not found");
		}
		dao.deleteById(sid);
		return "User deleted";
				
	}
	
	public StudentEntity updateUser(String sid, StudentEntity updateUser) throws Exception {
		StudentEntity existing=dao.getById(sid);
		if(existing==null) {
			throw new Exception("User not found");
		}
		existing.setName(updateUser.getName());
		existing.setDob(updateUser.getDob());
		existing.setMarks(updateUser.getMarks());
		existing.setPassword(updateUser.getPassword());
		existing.setPhonenumber(updateUser.getPhonenumber());
		existing.setSalary(updateUser.getSalary());
		existing.setUsername(updateUser.getUsername());
		
		return dao.save(existing);
	}
	
	
}
