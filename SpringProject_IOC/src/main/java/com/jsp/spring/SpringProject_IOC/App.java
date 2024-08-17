package com.jsp.spring.SpringProject_IOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App {
	public static void main(String[] args) 
	{
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.xml"));

		Person person = bf.getBean(Person.class);
		System.out.println(person);
		
	}
}
