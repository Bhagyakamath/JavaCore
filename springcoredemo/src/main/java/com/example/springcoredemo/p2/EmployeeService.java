package com.example.springcoredemo.p2;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	@Autowired
	EmployeeDao dao;
	public void addEmployee(EmployeeEntity ob) throws Exception{
		if(ob.getEmpname().equals("")) {
			throw new Exception("Name cannot be null");
		}
		dao.addEmployee(ob);
	}
}
