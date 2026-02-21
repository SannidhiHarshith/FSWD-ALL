package com.klu.Constructor_DI;

public class Course {
	
	private String courseName;
	private int duration;
	
	public Course(String courseName,int duration) {
		this.courseName = courseName;
		this.duration = duration;
	}
	
	//setters and getters->right click on cursor->source->generate getters and setters

	public String getCourseName() {
		return courseName;
	}

//	public void setCourseName(String courseName) {
//		this.courseName = courseName;
//	}

	public int getDuration() {
		return duration;
	}

//	public void setDuration(int duration) {
//		this.duration = duration;
//	}
	

}
