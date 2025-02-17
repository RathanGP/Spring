package com.jsp.Spring.SpringProject_vehicles.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Spring.SpringProject_vehicles.entity.Vehicle;
import com.jsp.Spring.SpringProject_vehicles.repository.VehicleRepository;

@Service
public class VehicleService 
{
	@Autowired
	private VehicleRepository  vehicleRepository;
	
	Scanner sc=new Scanner(System.in);
	public void addVehicle()
	{
		Vehicle vehicle=new Vehicle();
		
		System.out.println("Enter the Vehicle Id");
		vehicle.setVehicleId(sc.nextInt());
		System.out.println("Enter the Vehicle Name");
		vehicle.setVehicleName(sc.next());
		System.out.println("Enter the Vehicle Brand");
		vehicle.setVehicleBrand(sc.next());
		System.out.println("Enter the Vehicle Price");
		vehicle.setVehiclePrice(sc.nextInt());
		
		vehicleRepository.addVehicle(vehicle);
		
		System.out.println("vehicle added successfully...!");
	}
	public void findVehicle()
	{
		System.out.println("Enter Vehicle ID which you want to find...?");
		vehicleRepository.findVehicle(sc.nextInt());
		System.out.println("vehicle found  successfully...!");
	}
	public void updateVehicle()
	{
		System.out.println("Enter Vehicle ID which you want to update...?");
		Vehicle vehicleId = vehicleRepository.findVehicle(sc.nextInt());
		System.out.println("Enter the vehhicle Price");
		vehicleId.setVehiclePrice(sc.nextInt());
		vehicleRepository.updateVehicle(vehicleId);
		System.out.println("vehicle updated  successfully...!");
	}
	public void deleteVehicle()
	{
		System.out.println("Enter Vehicle ID which you want to delete...?");
		Vehicle vehicleId = vehicleRepository.findVehicle(sc.nextInt());
		vehicleRepository.deleteVehicle(vehicleId.getVehicleId());
		System.out.println("vehicle deleted  successfully...!");
	}
}
