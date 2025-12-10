package com.example.springcoredemo.p1;

public class Holiday {
	String holidayname;
	String holidaydate;
	public Holiday() {
		
	}
	public Holiday(String holidayname, String holidaydate) {
		super();
		this.holidayname = holidayname;
		this.holidaydate = holidaydate;
	}
	public void display() {
		System.out.println(holidayname+" "+holidaydate);
	}
	public String getHolidayname() {
		return holidayname;
	}
	public void setHolidayname(String holidayname) {
		this.holidayname = holidayname;
	}
	public String getHolidaydate() {
		return holidaydate;
	}
	public void setHolidaydate(String holidaydate) {
		this.holidaydate = holidaydate;
	}
	
}
