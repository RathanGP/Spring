package com.jsp.spring.SpringProject_Autowiring;

public class Course
{
	private String courseName;


	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + "]";
	}
	

}
