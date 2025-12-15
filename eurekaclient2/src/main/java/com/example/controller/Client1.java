package com.example.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="http://eurekaclient1/eclient1")
public interface Client1 {
	@GetMapping("/test")
	public String f1();
	@GetMapping("/liststudent")
	public List<StudentEntity> findAll();
}