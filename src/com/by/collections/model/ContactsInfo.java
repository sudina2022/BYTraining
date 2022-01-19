package com.by.collections.model;

public class ContactsInfo {

	String firstName;
	String lastName;
	String phoneNo;
	String address;
	String city;
	String state;
	String zipCode;
	String email;
	
		
	public ContactsInfo(String firstName, String lastName, String phoneNo, String address, String city, String state,
			String zipCode, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.email = email;
	}
	
	
	public ContactsInfo() {
		// TODO Auto-generated constructor stub
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	 @Override
	    public boolean equals(Object newContact) {
	        if(newContact == this) {
	            return true;
	        }
	        if(!(newContact instanceof ContactsInfo)){
	            return false;
	        }
	        ContactsInfo contact = (ContactsInfo) newContact;
	        if(this.firstName.equalsIgnoreCase(contact.getFirstName()) &&
	                this.lastName.equalsIgnoreCase(contact.getLastName())) {
	            return true;
	        }else {
	            return false;
	        }
	    }
	 
	 @Override
		
		public String toString() {
			return "First Name: "+getFirstName() +"\t Last Name=" + getLastName() + "\t Address=" + getAddress() + "\t Phono No=" + getPhoneNo() + "\t City= "+getCity() + "\t State="+getState();
		}
}
