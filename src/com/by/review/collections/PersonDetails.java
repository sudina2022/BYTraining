package com.by.review.collections;

public class PersonDetails {

	String firstName;
	String lastName;
	String phoneNo;
	String address;
	
		public PersonDetails(String firstName, String lastName, String phoneNo, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.address = address;
	}
		
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "\n First Name: "+getFirstName() +"\t Last Name='" + getLastName() + "\t Address='" + getAddress() + "\t Phono No='" + getPhoneNo();
	}
	
}
