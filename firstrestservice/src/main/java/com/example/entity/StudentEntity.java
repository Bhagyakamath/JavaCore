package com.example.entity;

import java.util.Date;

import com.example.exception.PasswordValidator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="stud1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
	@Id
	@NotNull(message="Id cannot be null")
	private String sid;
	@Column
	@NotNull(message="Name cannot be null")
	@NotBlank(message="Name cannot have only spaces")
	private String name;
	@Email(message="Invalid email")
	private String username;
	@PasswordValidator
	private String password;
	@Positive(message="Salary cannot be negative")
	private float salary;
	@Past(message="Date of birth cannot be future date")
	private Date dob;
	@Pattern(regexp = "[0-9]{10}",
		    message = "Invalid phone number")
	private String phonenumber;
	@Min(value=0, message="Marks cannot be less than zero")
	@Max(value=100, message="Marks cannot be greater than zero")
	private int marks;
	
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}
