package com.jsp.Spring.SpringProject_DIBy_Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
       Animal animal=ac.getBean(Animal.class);
       System.out.println(animal.getTiger());
    }
}
