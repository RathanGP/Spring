package com.jsp.Spring.SpringProject_Vehicle.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Spring.SpringProject_Vehicle.entity.Vehicle;
import com.jsp.Spring.SpringProject_Vehicle.repository.VehicleRepository;

@Service
public class VehicleService 
{
	@Autowired
	private VehicleRepository vehicleRepository;
	Scanner sc=new Scanner(System.in);
	public void addVehicleById()
	{
		Vehicle vehicle=new Vehicle();
		System.out.println("Enter the VehicleID");
		vehicle.setVehicleId(sc.nextInt());
		System.out.println("Enter the Vehicle Name");
		vehicle.setVehicleName(sc.next());
		System.out.println("Enter the Vehicle Brand");
		vehicle.setVehicleBrand(sc.next());
		System.out.println("Enter the Vehicle Price");
		vehicle.setVehiclePrice(sc.nextInt());
		
		vehicleRepository.addVehicle(vehicle);
		System.out.println("Vehicle added successfully");
	}
	public void findVehicleById()
	{
		System.out.println("Enter the Vehicle ID");
		vehicleRepository.findVehicle(sc.nextInt());
		System.out.println("vehicle found successfully");
	}
	public void updateVehicleById()
	{
		System.out.println("Enter the VehicleId");
		Vehicle vehicleId=vehicleRepository.findVehicle(sc.nextInt());
		System.out.println("Enter the Vehicle price");
		vehicleId.setVehiclePrice(sc.nextInt());
		vehicleRepository.updateVehicle(vehicleId);
		
	}
	public void deleteVehicleById()
	{
		System.out.println("ENter the vehicleId to be deleted");
		Vehicle vehicleId = vehicleRepository.findVehicle(sc.nextInt());//calling the session value
		vehicleRepository.deleteVehicle(vehicleId.getVehicleId());//calling the closed session object
	}

}
