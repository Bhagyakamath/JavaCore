package com.example.hibernatepractice.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee1")
public class EmployeeSalary {
	@Id
	private String eid;
	@Column
	private String fname;
	
	@OneToMany
	@JoinColumn(name="eid")
	List<SalaryEntity> ob;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public List<SalaryEntity> getOb() {
		return ob;
	}

	public void setOb(List<SalaryEntity> ob) {
		this.ob = ob;
	}
	
}
