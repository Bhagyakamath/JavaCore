package com.example.hibernatepractice.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="stud1")
public class Student1Entity {
	@Id
	private String sid;
	@Column
	private String name;
	@OneToMany(mappedBy="ob")
	List<Marks1Entity> l1;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Marks1Entity> getL1() {
		return l1;
	}
	public void setL1(List<Marks1Entity> l1) {
		this.l1 = l1;
	}
	
}
