package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.StudentInterface;
import com.example.entity.StudentEntity;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/m1")
@CrossOrigin
public class MainController {
	@Autowired
	StudentInterface stud;
	
	@GetMapping("/")
	public ResponseEntity<String> f1() {
		return new ResponseEntity<String>("Welcome to controller", HttpStatus.OK);
	}
	
	@GetMapping("/m1")
	public String f2() {
		return "<h1>Inside the other mapping</h1>";
	}
	
	@GetMapping("/allstudents")
	public ResponseEntity<List<StudentEntity>> f3(){
		List<StudentEntity> std=stud.findAll();
		if(std==null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<List<StudentEntity>>(std, HttpStatus.OK);
		}
		
	}
	
	@GetMapping("/byid/{id}")
	public Optional<StudentEntity> f4(@PathVariable String id){
		return stud.findById(id);
	}
	
	@GetMapping("/byname/{name}")
	public List<StudentEntity> f5(@PathVariable String name){
		return stud.findByName(name);
	}
	
	@PostMapping("/useradd")
	public ResponseEntity<String> f6(@Valid @RequestBody StudentEntity std){
		return ResponseEntity.ok("Valid student");
	}
}





