package com.java8;

public class Address {

	public Address(){
		
	}
	
	
	public Address(String address, String suburb, String state) {
		super();
		this.address = address;
		this.suburb = suburb;
		this.state = state;
	}


	private String address;
    private String suburb;
    private String state;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSuburb() {
		return suburb;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address ( address=" + address + ", suburb=" + suburb + ", state=" + state + ")";
	}
    
	
    
}
