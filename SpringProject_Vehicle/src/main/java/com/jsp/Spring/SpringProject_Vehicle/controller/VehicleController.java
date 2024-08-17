package com.jsp.Spring.SpringProject_Vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jsp.Spring.SpringProject_Vehicle.service.VehicleService;

@Controller
public class VehicleController 
{
	@Autowired
	private VehicleService vehicleService;
	
	public void addVehicle()
	{
		vehicleService.addVehicleById();
	}
	public void findVehicleById()
	{
		vehicleService.findVehicleById();
	}
	public void updateVehicleById()
	{
		vehicleService.updateVehicleById();
	}
	public void deleteVehcileById()
	{
		vehicleService.deleteVehicleById();
	}

}
