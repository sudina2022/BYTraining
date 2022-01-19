package test.com.by.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiPredicate;

import org.junit.Test;

import com.by.collections.model.AddressBookInfo;
import com.by.collections.model.ContactsInfo;

public class CountByCityStateTest {

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
			       addressBookMap.forEach((s,addressBook) ->  {
			    	   this.getCityCount(addressBook.getContacts(), frequencymap);
			    	   });
			       System.out.println(frequencymap);
		       }
	       if (option == 2) {
		       addressBookMap.forEach((s,addressBook) ->  {
		    	   this.getStateCount(addressBook.getContacts(), frequencymap);
		    	   });
		       System.out.println(frequencymap);
	       }
		}while(option!=3);
	} 
	
	public void displayContacts(HashMap<String, AddressBookInfo> addressBookMap) {
		addressBookMap.forEach((s, addressBook) -> addressBook.getContacts().forEach(
                 contact -> {
                	 System.out.println(addressBook.getAddressBookName()+"\t"+contact.toString());
                     }));
    }
	
	public void getCityCount(ArrayList<ContactsInfo> contInfo,HashMap countMap) {
		
		contInfo.forEach(contact -> {
			 if( !countMap.containsKey( contact.getCity() ) ){
				countMap.put( contact.getCity(), 1 );
	        } else {
	        	countMap.put( contact.getCity(), (int) countMap.get(contact.getCity()) + 1 );
	        }
		});
	}
	
	public void getStateCount(ArrayList<ContactsInfo> contInfo,HashMap countMap) {
		contInfo.forEach(contact -> {
			if( !countMap.containsKey( contact.getState() ) ){
				countMap.put( contact.getState(), 1 );
	        } else { 
	        	countMap.put( contact.getState(), (int) countMap.get(contact.getState()) + 1 );
	        }
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
