package com.jsp.Spring.SpringProject_vehicles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Spring.SpringProject_vehicles.controller.VehicleController;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
       VehicleController vc=ac.getBean(VehicleController.class);
       vc.deleteVehicle();
       
    }
}
