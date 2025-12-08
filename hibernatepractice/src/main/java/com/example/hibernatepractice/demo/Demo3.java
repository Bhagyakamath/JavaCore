package com.example.hibernatepractice.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.hibernatepractice.dao.EmployeeDao;
import com.example.hibernatepractice.entity.EmployeeSalary;
import com.example.hibernatepractice.entity.SalaryEntity;

public class Demo3 {
	public static void main(String[] args) {
		try {
			EmployeeDao dao=new EmployeeDao();
			List<EmployeeSalary> es=dao.getEmployeeSalary();
			es.forEach((x)->{System.out.println(x.getEid()+" "+x.getOb());});
			System.out.println("Done");
			
			EmployeeSalary e=new EmployeeSalary();
			e.setEid("s03");
			e.setFname("Ram");
			List<SalaryEntity> ob=new ArrayList<SalaryEntity>();
			SalaryEntity s=new SalaryEntity();
			s.setEid("s03");
			s.setId("1001");
			s.setSalary(90000l);
			s.setMonth("January");
			ob.add(s);
			e.setOb(ob);
			
			dao.addEmployeeSalary(e);
			System.out.println("Done");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
