package com.example.hibernatepractice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="marks1")
public class Marks1Entity {
	@Id
	private String id1;
	@Column

	private int testno;
	private int marks;
	@ManyToOne
	Student1Entity ob;
	public String getId1() {
		return id1;
	}
	public void setId1(String id1) {
		this.id1 = id1;
	}
	public int getTestno() {
		return testno;
	}
	public void setTestno(int testno) {
		this.testno = testno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student1Entity getOb() {
		return ob;
	}
	public void setOb(Student1Entity ob) {
		this.ob = ob;
	}
	
}
