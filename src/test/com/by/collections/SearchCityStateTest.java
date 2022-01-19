package test.com.by.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiPredicate;

import org.junit.Test;

import com.by.collections.model.AddressBookInfo;
import com.by.collections.model.ContactsInfo;

public class SearchCityStateTest {
	
	@Test
	public void searchCityState() {
		AddContactTest addContactTest = new AddContactTest();
		int option = 0;
		HashMap<String, AddressBookInfo> addressBookMap = createMap(addContactTest);
		do {
		System.out.println("Search address book using \n 1.city \n 2.state \n 3. Both: \n 4. Exit");
		Scanner scanner = new Scanner(System.in);
		option = scanner.nextInt();
		if (option == 1) {
			System.out.println("Search City:");
			String city=scanner.next();
			addressBookMap.forEach((s, addressBook) -> addressBook.getContacts().forEach(
	                contact -> {
	                    if(contact.getCity().equalsIgnoreCase(city)) {
	               		 System.out.println(addressBook.getAddressBookName()+"\t"+contact.toString());
	                    }
	                }
	        ));
		}
		if (option == 2) {
			System.out.println("Search State");
			String state=scanner.next();
			addressBookMap.forEach((s, addressBook) -> addressBook.getContacts().forEach(
	                contact -> {
	                    if(contact.getState().equalsIgnoreCase(state)) {
	               		 System.out.println(addressBook.getAddressBookName()+"\t"+contact.toString());
	                    }
	                }
	        ));
		}
		if (option == 3) {
			System.out.println("Search City:");
			String city=scanner.next();
			System.out.println("Search State:");
			String state=scanner.next();
			
			addressBookMap.forEach((s, addressBook) -> addressBook.getContacts().forEach(
		                contact -> {
		                    if(contact.getCity().equalsIgnoreCase(city) && contact.getState().equalsIgnoreCase(state)) {
		               		 System.out.println(addressBook.getAddressBookName()+"\t"+contact.toString());
		                    }
		                }
		        ));
		}
		}while(option!=4);
	}

	private HashMap createMap(AddContactTest addContactTest) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, AddressBookInfo> addressBookMap = new HashMap<>();

		System.out.println("Enter the number of Address Books:");
		int noOfEntries = scanner.nextInt();
		for (int i = 0; i < noOfEntries; i++) {
			System.out.println("Enter the number of Contact for :");
			int noOfContactEntries = scanner.nextInt();

			System.out.println("Enter Address Book Name:\n");
			String addBookName = scanner.next();
			for (int j = 0; j < noOfContactEntries; j++) {
				ContactsInfo conInfo = addContactTest.createNewContactInfo();
				BiPredicate biPred = (aBookMap, addName) -> addressBookMap.containsKey(addBookName);
				if (biPred.test(addressBookMap, addBookName)) {
					AddressBookInfo addBookInfo = addressBookMap.get(addBookName);
					addBookInfo.getContacts().add(conInfo);
					
				}else {
					addressBookMap.put(addBookName, new AddressBookInfo(addBookName, new ArrayList<>()));
					addressBookMap.get(addBookName).getContacts().add(conInfo);
				}
			}
		}
		return addressBookMap;

	}


}
