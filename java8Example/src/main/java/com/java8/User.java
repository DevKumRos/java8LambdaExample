package com.java8;

public class User {
	
	

	public User() {
		super();
	}
	
	public User(String name, String lastName, Address address,int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
	}
	private String name;
    private String lastName;
    private Address address;
    private int age; 
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User ( name=" + name + ", lastName=" + lastName + ", address=" + address + ", age=" + age + ")";
	}
    
	
    
}
