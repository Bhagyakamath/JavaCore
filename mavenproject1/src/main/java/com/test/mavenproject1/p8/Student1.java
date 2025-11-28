package com.test.mavenproject1.p8;

public class Student1 {
	private int sid;
	private String sname;
	private int age;
	public Student1(int sid, String sname, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}
	public Student1(Builder b) {
		this.sid=b.sid;
		this.sname=b.sname;
		this.age=b.age;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + ", age=" + age + "]";
	}
	
	public static class Builder{
		private static int sid;
		private static String sname;
		private static int age;
		
		public Builder sid(int sid) {
			this.sid=sid;
			return this;
		}
		public Builder sname(String sname) {
			this.sname=sname;
			return this;
		}
		public Builder age(int age) {
			this.age=age;
			return this;
		}
		public Student1 build() {
			return new Student1(this);
		}
	}
}
