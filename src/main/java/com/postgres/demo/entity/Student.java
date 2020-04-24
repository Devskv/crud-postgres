package com.postgres.demo.entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	private Integer id;
	
	private String name;
	
	private Integer gpa;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGpa() {
		return gpa;
	}

	public void setGpa(Integer gpa) {
		this.gpa = gpa;
	}
	
	
	

}
