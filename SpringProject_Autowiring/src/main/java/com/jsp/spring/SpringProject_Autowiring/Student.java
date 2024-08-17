package com.jsp.spring.SpringProject_Autowiring;

public class Student 
{
	private Course course;

	

	public Student(Course course) {
		super();
		this.course = course;
	}



	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	
	
	

}
