package com.jsp.spring.SpringProject_IOC;

public class Address {
	private int addressId;
	private String location;
	private String city;

	

	public Address(int addressId, String location, String city) {
		super();
		addressId = addressId;
		location = location;
		city = city;
	}



	@Override
	public String toString() {
		return "Address [AddressId=" + addressId + ", Location=" + location + ", city=" + city + "]";
	}

}
