package com.test.mavenproject1.p4;

public class StudentDto {
	private Integer sid;
	private String sname;
	private StudentDto() {
		super();
	}
	public StudentDto(Integer sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "StudentDto [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
