package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eclient2")
@CrossOrigin
public class C2Controller {
	@Autowired
	Client1 ob;
	@GetMapping("/test")
	public String client2() {
		return ob.f1();
				
	}
	
	@GetMapping("/liststudent")
	public List<StudentEntity> findAll(){
		return ob.findAll() ;
		
	}
}
