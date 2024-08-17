package com.jsp.Spring.SpringProject_DI_UsingInterface;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle
{
	public void name()
	{
		System.out.println("Bike");
	}

}
