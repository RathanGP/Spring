package com.jsp.spring.SpringProject_AnnotationbasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.spring.SpringProject_AnnotationbasedConfiguration.Entity.Bike;

public class App 
{
    public static void main( String[] args )
    {
      // ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	
    	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    	
       Car car=ac.getBean(Car.class);
       System.out.println(car);
       
       Bike bike=ac.getBean(Bike.class);
       System.out.println(bike);
    }
}
