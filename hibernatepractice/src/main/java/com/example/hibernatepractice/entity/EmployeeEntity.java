package com.example.hibernatepractice.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Table(name="Employee1")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class EmployeeEntity {
	@Id
	private String eid;
	
	@Column
	private String fname;
	private String lname;
	private Date dob;
	public void setEid(String eid) {
		this.eid = eid;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + "]";
	}
	
}
