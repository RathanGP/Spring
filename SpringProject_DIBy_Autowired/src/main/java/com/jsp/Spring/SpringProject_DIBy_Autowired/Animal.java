package com.jsp.Spring.SpringProject_DIBy_Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal 
{
	//field injection
	//@Autowired
	private Tiger tiger;

	public Tiger getTiger() {
		return tiger;
	}

	//setter injection
	//@Autowired
	public void setTiger(Tiger tiger) {
		this.tiger = tiger;
	}
	//constructor injection
	@Autowired
	public Animal(Tiger tiger) {
		super();
		this.tiger = tiger;
	}

}
