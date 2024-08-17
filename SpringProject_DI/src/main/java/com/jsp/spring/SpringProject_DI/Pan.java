package com.jsp.spring.SpringProject_DI;

public class Pan 
{
	private int panId;
	private int panNumber;
	
	public int getPanId() {
		return panId;
	}
	public void setPanId(int panId) {
		this.panId = panId;
	}
	public int getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(int panNumber) {
		this.panNumber = panNumber;
	}
	
	@Override
	public String toString() {
		return "Pan [panId=" + panId + ", panNumber=" + panNumber + "]";
	}
	public Pan()
	{
		System.out.println("Pan object");
	}
	

}
