package com.by.collections.model;

import java.util.ArrayList;

public class AddressBookInfo {
	
	String addressBookName;
	ArrayList<ContactsInfo> contacts;
	
	public AddressBookInfo(String addressBookName, ArrayList<ContactsInfo> contacts) {
		super();
		this.addressBookName = addressBookName;
		this.contacts = contacts;
	}

	public String getAddressBookName() {
		return addressBookName;
	}

	public void setAddressBookName(String addressBookName) {
		this.addressBookName = addressBookName;
	}

	public ArrayList<ContactsInfo> getContacts() {
		return contacts;
	}

	public void setContacts(ArrayList<ContactsInfo> contacts) {
		this.contacts = contacts;
	}
	
}
