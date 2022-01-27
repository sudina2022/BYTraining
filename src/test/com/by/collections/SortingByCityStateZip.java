package test.com.by.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import org.junit.Test;

import com.by.collections.model.AddressBookInfo;
import com.by.collections.model.ContactsInfo;

public class SortingByCityStateZip {

	@Test
	public void countByCityState() {
		AddContactTest addContactTest = new AddContactTest();
		int option = 0;
		HashMap<String, AddressBookInfo> addressBookMap = createMap(addContactTest);
		displayContacts(addressBookMap);
		do {
		HashMap<String,Integer> frequencymap = new HashMap<String,Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Search no of persons using \n 1.city \n 2.state \n 3.Exit");
		option = scanner.nextInt();
			if (option == 1) {
				  addressBookMap.forEach((s, addressBook) -> {
				    	ArrayList<ContactsInfo> sortedList = SortingByCityStateZip.sortedListByCity(addressBook.getContacts());
				    	System.out.println(addressBook.getAddressBookName()+"\n");
				    	SortingByPersonTest.displayContacts(sortedList);
				    });
		       }
	       if (option == 2) {
	    	   addressBookMap.forEach((s, addressBook) -> {
	    	    	ArrayList<ContactsInfo> sortedList = SortingByCityStateZip.sortedListByState(addressBook.getContacts());
	    	    	System.out.println(addressBook.getAddressBookName()+"\n");
	    	    	SortingByPersonTest.displayContacts(sortedList);
	    	    });
	       }
	       if (option == 3) {
	    	   addressBookMap.forEach((s, addressBook) -> {
	    	    	ArrayList<ContactsInfo> sortedList = SortingByCityStateZip.sortedListByZip(addressBook.getContacts());
	    	    	System.out.println(addressBook.getAddressBookName()+"\n");
	    	    	SortingByPersonTest.displayContacts(sortedList);
	    	    });
	       }
		}while(option!=4);
	} 
	
	public void displayContacts(HashMap<String, AddressBookInfo> addressBookMap) {
		addressBookMap.forEach((s, addressBook) -> addressBook.getContacts().forEach(
                 contact -> {
                	 System.out.println(addressBook.getAddressBookName()+"\t"+contact.toString());
                     }));
    }
	
	public static ArrayList<ContactsInfo> sortedListByCity(ArrayList<ContactsInfo> contacts) {
		ArrayList<ContactsInfo> sortedContacts =  (ArrayList<ContactsInfo>) contacts   	          	
    	.stream()
		.sorted(Comparator.comparing(ContactsInfo::getCity))
		.collect(Collectors.toList());
		return sortedContacts;
	}
	
	public static ArrayList<ContactsInfo> sortedListByState(ArrayList<ContactsInfo> contacts) {
		ArrayList<ContactsInfo> sortedContacts =  (ArrayList<ContactsInfo>) contacts   	          	
    	.stream()
		.sorted(Comparator.comparing(ContactsInfo::getState))
		.collect(Collectors.toList());
		return sortedContacts;
	}
	
	public static ArrayList<ContactsInfo> sortedListByZip(ArrayList<ContactsInfo> contacts) {
		ArrayList<ContactsInfo> sortedContacts =  (ArrayList<ContactsInfo>) contacts   	          	
    	.stream()
		.sorted(Comparator.comparing(ContactsInfo::getZipCode))
		.collect(Collectors.toList());
		return sortedContacts;
	}
	
	public static void displayContacts(ArrayList<ContactsInfo> contacts) {
		contacts.forEach(contact -> {
			System.out.println(contact.toString());
		});
	}
   
   
	private HashMap createMap(AddContactTest addContactTest) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, AddressBookInfo> addressBookMap = new HashMap<>();

		System.out.println("Enter the number of Address Books:");
		int noOfEntries = scanner.nextInt();
		for (int i = 0; i < noOfEntries; i++) {
			System.out.println("Enter Address Book Name:\n");
			String addBookName = scanner.next();
			System.out.println("Enter the number of Contact for :"+addBookName.toString());
			int noOfContactEntries = scanner.nextInt();
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
