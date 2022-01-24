package test.com.by.collections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import org.junit.Test;

import com.by.collections.model.AddressBookInfo;
import com.by.collections.model.ContactsInfo;
import com.by.functioninterface.InputValidation;

public class ValidateUserEntryTest implements  InputValidation {
	
	Predicate<String> inputNo = Pattern.compile("^[0-9]*").asMatchPredicate();
	Predicate<String> inputString = Pattern.compile("[A-Za-z][A-Za-z0-9_]*").asPredicate();
	
	@Test
	public void validateUserEntry() {
		Scanner scanner = new Scanner(System.in);
		AddContactTest addContactTest = new AddContactTest();
		HashMap<String, AddressBookInfo> addressBookMap = new HashMap<>();
		
		System.out.println("Enter the number of Address Books:");
		String noOfEntries = scanner.next();
		if(!inputNo.test(noOfEntries)) {
			System.out.println("Invalid Entry");
			return;
		}
		for (int i = 0; i < Integer.parseInt(noOfEntries); i++) {
			System.out.println("Enter the number of Contact for :");
			String noOfContact = scanner.next();
			
			if(!inputNo.test(noOfContact)) {
				System.out.println("Invalid Entry");
				return;
			}
			System.out.println("Enter Address Book Name:\n");
			String addBookName = scanner.next();
			if(!inputString.test(addBookName)) {
				System.out.println("Invalid Entry");
				return;
			}
			for(int j=0;j<Integer.parseInt(noOfContact);j++) {
				ContactsInfo conInfo = addContactTest.createNewContactInfo();
				Function<ContactsInfo,HashMap<String,String>> func2 = new ValidateUserEntryTest()::validateInput;
				InputValidation.printValue(func2.apply(conInfo));
				
				}
			}
		}
	
		
		@Override
		public HashMap<String,String> validateInput(ContactsInfo cInfo) {
			HashMap<String,String> validMap = new HashMap<String, String>();
			String s = cInfo.getFirstName().matches("[A-Za-z][A-Za-z0-9_]*")== true?validMap.put("First Name is Valid",cInfo.getFirstName()):validMap.put("First Name is InValid",cInfo.getFirstName());
			s = cInfo.getLastName().matches("[A-Za-z][A-Za-z0-9_]*")== true?validMap.put("Last Name is Valid",cInfo.getLastName()):validMap.put("Last Name is InValid",cInfo.getLastName());
			s = cInfo.getEmail().matches("^(.+)@(.+)$")== true?validMap.put("Email - Valid Entry",cInfo.getEmail()):validMap.put("Email - InValid Entry",cInfo.getEmail());
			s = cInfo.getPhoneNo().matches("^[0-9]\\1d{9}$")== true?validMap.put("Phone No - Valid Entry",cInfo.getPhoneNo()):validMap.put("Phone No - InValid Entry",cInfo.getPhoneNo());
			return validMap;
		}
}