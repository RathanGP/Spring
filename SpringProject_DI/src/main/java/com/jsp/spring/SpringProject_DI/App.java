package com.jsp.spring.SpringProject_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Student student=ac.getBean(Student.class);
        System.out.println(student);
    	
//    	BeanFactory bf=new XmlBeanFactory(new FileSystemResource("spring.xml"));
//    	bf.getBean(Student.class);
    }
}
