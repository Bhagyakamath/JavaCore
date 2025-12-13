package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import com.example.controller.MainController;
import com.example.dao.StudentInterface;
import com.example.entity.StudentEntity;
import com.example.service.UserService;

@SpringBootTest
@ActiveProfiles("h2")
public class FirstrestserviceApplicationTests {
	
	@Autowired
	UserService service;
	@Autowired
	StudentInterface dao;
	
	@Autowired
	MainController controller;
	@Test
	void case1() {
		assertTrue(true);
	}
	
	@Test
	@Order(1)
	void case2() throws ParseException {
		 StudentEntity ob=new StudentEntity();
		  ob.setSid("1001");
		  ob.setName("Saritha");
		  ob.setUsername("saritha@gmail.com");
		  ob.setPassword("Sari@123");
		  ob.setDob(new SimpleDateFormat("yyyy-MM-dd").parse("2002-12-15"));
		  ob.setPhonenumber("9008100323");
		  ob.setSalary(45000.00f);
		  ob.setMarks(89);
		  try {
			  service.addUser(ob);
		  }catch(Exception e) {
			  fail();
		  }
	}
	
	@Test
	@Order(2)
	void case3() {
		List<StudentEntity> err1=dao.findAll();
		assertEquals(err1.get(0).getName(), "Saritha");
	}
	
	@Test
	void case4() {
		try {
			ResponseEntity<String> s1=controller.f1();
			assertEquals(s1.getBody(), "Welcome to controller");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	void case5() {
		try {
			ResponseEntity<List<StudentEntity>> l1=controller.f3();
			int size=l1.getBody().size();
				assertNotEquals(size, 0);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	void case6() {
		try {
			StudentEntity ob=new StudentEntity();
			  ob.setSid("1003");
			  ob.setName("Naina");
			  ob.setUsername("saritha@gmail.com");
			  ob.setPassword("Sari@123");
			  ob.setDob(new SimpleDateFormat("yyyy-MM-dd").parse("2002-12-15"));
			  ob.setPhonenumber("9008100323");
			  ob.setSalary(45000.00f);
			  ob.setMarks(89);
			  ResponseEntity<String> s1=controller.f6(ob);
			  assertEquals(s1.getBody(), "User added");
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void case7() {
		try {
			ResponseEntity<String> s1=controller.f8("1003");
			assertEquals(s1.getBody(), "User deleted");
		} catch (Exception e) {
			fail();
		}
	}
}
