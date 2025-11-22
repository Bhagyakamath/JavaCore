package com.test.mavenproject1.p3;

public class EmployeeDto {
	private Integer empid;
	private String empname;
	
	public EmployeeDto() {
		
	}
	public EmployeeDto(Integer empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "EmployeeDto [empid=" + empid + ", empname=" + empname + "]";
	}
	
	
}
