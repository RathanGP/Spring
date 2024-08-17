package com.jsp.spring.SpringProject_DI;

public class Student 
{
	private int studentId;
	private String studentName;
	
	private Pan pan;
	
	public Pan getPan() {
		return pan;
	}
	public void setPan(Pan pan) {
		this.pan = pan;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", pan=" + pan + "]";
	}
	
	public Student()
	{
		System.out.println("Student object");
	}
	
}
