package com.jsp.Spring.SpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle 
{
	@Override
	public String toString() {
		return "Bike ";
	}

	public void name()
	{
		System.out.println("BIKE");
	}

}
