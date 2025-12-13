package com.example.alldependencies.entity;

import java.sql.Date;
 
public class EmployeeEntity {
 
    private String empId;
    private String name;
    private String email;
    private String password;
    private float salary;
    private Date dob;
    private String phoneNumber;
    private String department;
    private String designation;
    private int experienceYears;
 
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getExperienceYears() {
        return experienceYears;
    }
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
 
    @Override
    public String toString() {
        return "EmployeeEntity [empId=" + empId + ", name=" + name + ", email=" + email + ", password=" + password
                               + ", salary=" + salary + ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", department=" + department
                + ", designation=" + designation + ", experienceYears=" + experienceYears + "]";
    }
}
