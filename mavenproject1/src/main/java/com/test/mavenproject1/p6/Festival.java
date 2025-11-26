package com.test.mavenproject1.p6;

import java.time.LocalDate;

public class Festival {
	LocalDate l;
	public Festival() {
		l=LocalDate.now();
	}
	
	public void setData(String dt) throws Exception{
		this.l=LocalDate.of(Integer.parseInt(dt.substring(0, 4)), Integer.parseInt(dt.substring(5, 7)), Integer.parseInt(dt.substring(8, 10)));
		
	}
	
	public void display() {
		System.out.println(l);
	}
	
	public void ramCal() {
		System.out.println("Ramzan dates:");
		int days=(int) (12*29.5);
		for(int i=0; i<12; i++) {
			l=l.plusDays(days);
			display();
		}
	}
	
	public void diwaliCal() {
		System.out.println("Deepavali dates: ");
		int flag=3;
		int days=(int) (12*29.5);
		for(int i=0; i<12; i++) {
			if(flag%3==0) {
				l=l.plusDays(29);
				flag=0;
			}
			l=l.plusDays(days);
			display();
			flag++;
		}
	}
}
