package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

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
}
