package com.test.mavenproject1.p8;

public class Employee1 {
	private int empid;
	private String empname;
	private String city;
	private String designation;
	private int managerid;
	public Employee1(Builder ob) {
		this.empid=ob.empid;
		this.empname=ob.empname;
		this.city=ob.city;
		this.designation=ob.designation;
		this.managerid=ob.managerid;
	}
	public Employee1(int empid, String empname, String city, String designation, int managerid) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.city = city;
		this.designation = designation;
		this.managerid = managerid;
	}
	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", empname=" + empname + ", city=" + city + ", designation=" + designation
				+ ", managerid=" + managerid + "]";
	}
	public static class Builder{
		//Builder Design Pattern
		private static int empid;
		private static String empname;
		private static String city;
		private static String designation;
		private static int managerid;
		
		public Builder empid(int empid) {
			this.empid=empid;
			return this;
		}
		
		public Builder empname(String empname) {
			this.empname=empname;
			return this;
		}
		
		public Builder city(String city) {
			this.city=city;
			return this;
		}
		
		public Builder designation(String designation) {
			this.designation=designation;
			return this;
		}
		
		public Builder managerid(int managerid) {
			this.managerid=managerid;
			return this;
		}
		
		public Employee1 build() {
			return new Employee1(this);
		}
	}
}
