package com.jsp.spring.SpringProject_AnnotationbasedConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car
{
	@Value("101")
	private int carId;
	@Value("x6")
	private String carModel;
	@Value("BMW")
	private String carBrand;
	@Value("20000000")
	private int carPrice;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carModel=" + carModel + ", carBrand=" + carBrand + ", carPrice=" + carPrice
				+ "]";
	}

	
}
