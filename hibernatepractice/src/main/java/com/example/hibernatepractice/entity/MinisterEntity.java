package com.example.hibernatepractice.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="minister3")
@Cacheable            //For caching
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@NamedQueries({ 
	@NamedQuery(name="minister.q1", query="from MinisterEntity"),
	@NamedQuery(name="minister.q2", query="select name from MinisterEntity")
})
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
