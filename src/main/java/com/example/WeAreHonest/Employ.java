package com.example.WeAreHonest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Employ {
	@Id
	private int id;
	
	private String name;
	@Column
	private String Age;
	
	public Employ(){
		
	}
	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", Age=" + Age + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public Employ(String name, String age) {
		super();
		this.name = name;
		Age = age;
	}
	

}
