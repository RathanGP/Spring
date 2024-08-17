package com.jsp.Spring.SpringProject_BookDB;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Spring.SpringProject_BookDB.controller.BookController;


public class App 
{
    public static void main( String[] args )
    {
     
    	ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
    	BookController bc=ac.getBean(BookController.class);
    	bc.deleteBook();
    	
    }
}
