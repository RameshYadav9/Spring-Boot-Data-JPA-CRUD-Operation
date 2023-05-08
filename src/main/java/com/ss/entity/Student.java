package com.ss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")

public class Student {
	@Id
	@Column(name = "student_id")
	private Integer id;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}

	@Column(name = "students_name")
	private String name;
	
	@Column(name = "fee")
	private Double fee;
	
	
    public Student() {   //default constructor  for storing multiple student
    	
    }

	public Student(Integer id, String name, Double fee) {
		
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

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

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}
	

}
