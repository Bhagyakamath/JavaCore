package com.test.mavenproject1.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Demo5 {
	public static void main(String[] args) {
		List<EmployeeDto> employee=new ArrayList<>();
		employee.add(new EmployeeDto(1, "Ram"));
		employee.add(new EmployeeDto(2, "Rahul"));
		employee.add(new EmployeeDto(3, "Priya"));
		employee.add(new EmployeeDto(4, "Naina"));
		employee.add(new EmployeeDto(5, "Kavya"));
//		employee.forEach(System.out :: println);
		System.out.println(employee);
		
		Iterator it=employee.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println();
		

        Collections.sort(employee, Comparator.comparing(EmployeeDto::getEmpname));
        System.out.println(employee);

		}
}
