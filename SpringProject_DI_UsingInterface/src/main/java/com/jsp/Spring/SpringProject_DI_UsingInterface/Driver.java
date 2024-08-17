package com.jsp.Spring.SpringProject_DI_UsingInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Driver
{
	@Autowired
	@Qualifier("bike")
	private Vehicle vehicle;
	
	public void print()
	{
		vehicle.name();
	}

}
