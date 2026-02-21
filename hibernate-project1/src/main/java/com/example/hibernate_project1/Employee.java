package com.example.hibernate_project1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	int id;
	String name;
}
