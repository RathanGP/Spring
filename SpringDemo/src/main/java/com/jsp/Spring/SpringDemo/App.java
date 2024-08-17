package com.jsp.Spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
       Driver driver=ac.getBean(Driver.class);
       System.out.println(driver.getVehicle());
    }
}
