package com.test.mavenproject1.p4;

import java.util.ArrayList;
import java.util.List;

import com.test.mavenproject1.p3.EmployeeDto;

public class Demo3 {

	public static void main(String[] args) {
		List<EmployeeDto> ob=new ArrayList<>();
		ob.add(new EmployeeDto(100, "Ramesh"));
		ob.add(new EmployeeDto(101, "Suresh"));
		Display ob1=new Display();
		ob1.f1(ob);
		
		System.out.println();
		
		List<StudentDto> so=new ArrayList<>();
		so.add(new StudentDto(1, "Ram"));
		so.add(new StudentDto(1, "Syam"));
		Display so1=new Display();
		so1.f1(so);
		

	}

}

class Display{
	public void f1(List<? extends Object> ob) {
		ob.forEach(System.out :: println);
	}
}

interface Display1{
	public void f2(List<? extends Object> ob);
}