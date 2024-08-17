package com.jsp.Spring.SpringProject_vehicles.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.jsp.Spring.SpringProject_vehicles.entity.Vehicle;

@Repository
public class VehicleRepository
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql_config");
	
	public void addVehicle(Vehicle vehicle)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(vehicle);
		et.commit();
		em.close();
		
	}
	public Vehicle findVehicle(int vehicleId)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
	    Vehicle vehicle=em.find(Vehicle.class,vehicleId);
		et.commit();
		em.close();
		System.out.println(vehicle);
		return vehicle;
		
	}
	public void updateVehicle(Vehicle vehicle)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
	    em.merge(vehicle);
		et.commit();
		em.close();
	}
	public void deleteVehicle(int vehicleId)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Vehicle vehicle=em.find(Vehicle.class,vehicleId);
		et.begin();
	    em.remove(vehicle);
		et.commit();
		em.close();
	}

}
