package com.jsp.Spring.SpringProject_DI_UsingInterface;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle
{
	public void name()
	{
		System.out.println("Car");
	}
	
}
