package com.jsp.Spring.SpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle
{
	@Override
	public String toString() {
		return "Car ";
	}

	public void name()
	{
		System.out.println("CAR");
	}

}
