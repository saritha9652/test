package com.hcl.test.beans;

public class Address {
	private String houseNo;
	private String city;
	private String state;
	public Address() {
		System.out.println("inside address default constructor");
	}
	public Address(String houseNo, String city, String state) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		System.out.println("inside address parameteride constructor");
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", state=" + state + "]";
	}
	
}
