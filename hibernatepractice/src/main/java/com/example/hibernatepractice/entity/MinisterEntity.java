package com.example.hibernatepractice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="minister2")
public class MinisterEntity {
	@Id
	private String id;
	@Column
	private String name;
	@OneToOne(mappedBy="ob")
	ProfileEntity p1;
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
	public ProfileEntity getP1() {
		return p1;
	}
	public void setP1(ProfileEntity p1) {
		this.p1 = p1;
	}
	
}
