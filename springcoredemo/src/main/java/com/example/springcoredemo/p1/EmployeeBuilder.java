package com.example.springcoredemo.p1;

public class EmployeeBuilder {
	String empid;
	String empname;
	public EmployeeBuilder(Build ob) {
		this.empid=ob.empid;
		this.empname=ob.empname;
	}
	public void display() {
		System.out.println(empid+" "+ empname);
	}
 static class Build {
	 	String empid;
		String empname;
		public Build empid(String s1) {
			this.empid=s1;
			return this;
		}
		public Build empname(String s1) {
			this.empname=s1;
			return this;
		}
		public EmployeeBuilder build() {
			return new EmployeeBuilder(this);
		}
	}
}
