package com.pruthvi.college.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String totalnoofstudent;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTotalnoofstudent() {
		return totalnoofstudent;
	}
	public void setTotalnoofstudent(String totalnoofstudent) {
		this.totalnoofstudent = totalnoofstudent;
	}

	public College(String name, String totalnoofstudent) {
		super();
		this.name = name;
		this.totalnoofstudent = totalnoofstudent;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
