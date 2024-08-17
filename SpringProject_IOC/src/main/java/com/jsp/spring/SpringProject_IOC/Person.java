package com.jsp.spring.SpringProject_IOC;

public class Person {
	private int personId;
	private String personName;

	private Address address;

	public Person(int personId, String personName, Address address) {
		super();
		personId = personId;
		personName = personName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [PersonId=" + personId + ", PersonName=" + personName + ", address=" + address + "]";
	}

}
