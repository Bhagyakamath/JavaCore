package com.example.hibernatepractice.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="property2")
public class PropertyEntity {
	@Id
	private String siteno;
	@Column
	private String propertyname;
	@ManyToMany
	List<CitizenEntity> citizen=new ArrayList<CitizenEntity>();
	public String getSiteno() {
		return siteno;
	}
	public void setSiteno(String siteno) {
		this.siteno = siteno;
	}
	public String getPropertyname() {
		return propertyname;
	}
	public void setPropertyname(String propertyname) {
		this.propertyname = propertyname;
	}
	public List<CitizenEntity> getCitizen() {
		return citizen;
	}
	public void setCitizen(List<CitizenEntity> citizen) {
		this.citizen = citizen;
	}
	
}
