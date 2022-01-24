package com.by.functioninterface;

import java.util.HashMap;

import com.by.collections.model.ContactsInfo;

@FunctionalInterface
public interface InputValidation {

	public HashMap<String,String> validateInput(ContactsInfo conInfo);
	
	
	public static void printValue(HashMap checkMap) {
		System.out.println(checkMap);
		
	}

}
