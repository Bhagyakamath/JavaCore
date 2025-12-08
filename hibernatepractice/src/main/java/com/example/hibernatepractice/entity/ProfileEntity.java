package com.example.hibernatepractice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="profile2")
public class ProfileEntity {
	@Id
	private String profileid;
	@Column
	private String profilename;
	@OneToOne
	MinisterEntity ob;
	public String getProfileid() {
		return profileid;
	}
	public void setProfileid(String profileid) {
		this.profileid = profileid;
	}
	public String getProfilename() {
		return profilename;
	}
	public void setProfilename(String profilename) {
		this.profilename = profilename;
	}
	public MinisterEntity getOb() {
		return ob;
	}
	public void setOb(MinisterEntity ob) {
		this.ob = ob;
	}
	
}
