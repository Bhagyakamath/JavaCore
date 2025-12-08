package com.example.hibernatepractice.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="citizen2")
public class CitizenEntity {
	@Id
	private String id;
	@Column
	private String name;
	@ManyToMany(mappedBy="citizen")
	List<PropertyEntity> property=new ArrayList<PropertyEntity>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<PropertyEntity> getProperty() {
		return property;
	}
	public void setProperty(List<PropertyEntity> property) {
		this.property = property;
	}
	
}
