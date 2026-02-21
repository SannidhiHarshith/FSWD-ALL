package com.klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("101")
	private int id;
	
	@Value("9390255499")
	private long phone;
	
	@Value("95.5")
	private float marks;
	
    // ===== Non-Primitive Object Dependency =====
    @Autowired
    private Course c;

	
	public void display() {
		System.out.println("The ID is : "+id);
		System.out.println("The Phone Number is : "+phone);
		System.out.println("The Marks is : "+marks);
		System.out.println("The Course : "+c.getCourseName());
	}
	

}
