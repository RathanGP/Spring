package com.jsp.Spring.SpringProject_vehicles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jsp.Spring.SpringProject_vehicles.service.VehicleService;

@Controller
public class VehicleController 
{
	@Autowired
	private VehicleService vehicleService;
	
	public void addVehicle()
	{
		vehicleService.addVehicle();
	}

	public void findVehicle()
	{
		vehicleService.findVehicle();
	}
	
	public void updateVehicle()
	{
		vehicleService.updateVehicle();
	}
	public void deleteVehicle()
	{
		vehicleService.deleteVehicle();
	}

	
	
}
