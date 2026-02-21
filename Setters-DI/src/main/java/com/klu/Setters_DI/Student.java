package com.klu.Setters_DI;

public class Student {
	private int id;
	private String name;
	private int age;
//	public int getId() {
//		return id;
//	}
	public void setId(int id) {
		this.id = id;
	}
//	public String getName() {
//		return name;
//	}
	public void setName(String name) {
		this.name = name;
	}
//	public int getAge() {
//		return age;
//	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void  display(){
		System.out.println("the id is:"+id);
		System.out.println("the name is:"+name);
		System.out.println("the age is:"+age);
		}




}
