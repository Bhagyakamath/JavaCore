package com.example.springcoredemo.p2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="employee5")
@NamedQueries({
	@NamedQuery(name="employeefile", query="from EmployeeEntity where empname like :name")
})
public class EmployeeEntity {
	@Id
	private String empid;
	@Column
	private String empname;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}
