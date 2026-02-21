package com.example.Hibernate_CRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee //table name
{

	//@Id for primary key
	@Id
	int id;//column
	String name;//column
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
	
	
}
