package com.test.mavenproject1.p8;

public class Demo1 {

	public static void main(String[] args) {
		Employee1 ob=new Employee1(1015, "Ram", "Bangalore", "CEO", 1015);
		System.out.println(ob);
		Employee1 ob1=new Employee1.Builder()
				.empid(1010)
				.empname("Shyam")
				.city("Indore")
				.managerid(1015)
				.designation("HR-O").build();
		System.out.println(ob1);
		System.out.println();
		
		
		
		Student1 so=new Student1(1, "Rahul", 20);
		System.out.println(so);
		Student1 so1=new Student1.Builder()
				.sid(2)
				.sname("Naina")
				.age(22).build();
		System.out.println(so1);

	}

}
