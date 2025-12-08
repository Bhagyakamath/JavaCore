package com.example.hibernatepractice.demo;

import java.util.Date;
import java.util.List;

import com.example.hibernatepractice.dao.EmployeeDao;
import com.example.hibernatepractice.entity.EmployeeEntity;

public class Demo1 {
	public static void main(String[] args) {
		try {
			EmployeeDao dao=new EmployeeDao();
			EmployeeEntity entity=new EmployeeEntity();
			entity.setEid("s01");
//			entity.setFname("Aria");
//			entity.setLname("Mendon");
//			entity.setDob(new Date());
//			dao.addEmployee(entity);
//			System.out.println("Employee added successfully");
//			dao.deleteEmployee(entity);
//			System.out.println("Employee deleted");
			
//			entity.setFname("Alice");
//			entity.setLname("Mendon");
//			entity.setDob(new Date());
//			dao.updateEmployee(entity);
//			System.out.println("Employee updated successfully");
			
//			System.out.println("List of employees");
//			List<EmployeeEntity> l1=dao.listEmployee();
//			l1.forEach(System.out::println);
			
			System.out.println("List of employees");
//			List<EmployeeEntity> l2=dao.listEmployeeNativeQuery();
//			List<EmployeeEntity> l2=dao.searchById("s01");
			List<EmployeeEntity> l2=dao.searchByName("Alice");
			l2.forEach(System.out::println);
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
