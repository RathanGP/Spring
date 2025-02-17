package com.jsp.springmvc.studentdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.springmvc.studentdb.entity.Student;
import com.jsp.springmvc.studentdb.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository studentRepository;
	
	public ModelAndView addStudent(Student student)
	{
		studentRepository.addStudent(student);
		
		ModelAndView mvc=new ModelAndView();
		mvc.setViewName("index.jsp");
		
		return mvc;
		
	}
	
	public ModelAndView displayAllStudents()
	{
		List<Student> students=studentRepository.findAllStudents();
		
		ModelAndView mvc=new ModelAndView();
		mvc.setViewName("DisplayStudent.jsp");
		mvc.addObject("studentList",students);
		
		return mvc;
		
	}

	public ModelAndView deleteStudent()
	{
		

		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("index.jsp");

		return mvc;
		
	}
	
	

}
