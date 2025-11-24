package com.test.mavenproject1.p3;

public class EmployeeDto implements Comparable<EmployeeDto>{
	private Integer empid;
	private String empname;
	
	public EmployeeDto() {
		super();
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
	@Override
	public int compareTo(EmployeeDto o) {
		return this.getEmpname().compareTo(o.empname);
	}
	
	
}
