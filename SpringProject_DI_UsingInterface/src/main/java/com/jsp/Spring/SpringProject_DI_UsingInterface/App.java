package com.jsp.Spring.SpringProject_DI_UsingInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
       Driver driver=ac.getBean(Driver.class);
       driver.print();
    }
}
