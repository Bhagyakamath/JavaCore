package com.example.hibernatepractice.demo;

import com.example.hibernatepractice.dao.EmployeeDao;
import com.example.hibernatepractice.entity.SalaryEntity;

public class Demo2 {
	public static void main(String[] args) {
		
		try {
			SalaryEntity se=new SalaryEntity();
			EmployeeDao dao=new EmployeeDao();
			se.setId("3");
			se.setEid("s01");
			se.setSalary(45000l);
			se.setMonth("December");
			dao.addSalary(se);
			
			SalaryEntity se1=new SalaryEntity();
			se1.setId("2");
			se1.setEid("s01");
			se1.setSalary(45000l);
			se1.setMonth("April");
			dao.addSalary(se1);
			
			System.out.println("Data added");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
