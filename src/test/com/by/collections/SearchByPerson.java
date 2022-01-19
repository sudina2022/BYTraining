package test.com.by.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiPredicate;

import org.junit.Test;

import com.by.collections.model.AddressBookInfo;
import com.by.collections.model.ContactsInfo;

public class SearchByPerson {
	@Test
	public void searchPerson() {
		AddContactTest addContactTest = new AddContactTest();
		HashMap<String, AddressBookInfo> addressBookMap = createMap(addContactTest);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name to be searched:");
		String firstName = scanner.next();
        System.out.print("\nEnter Last Name to be searched:");
        String lastName = scanner.next();
        addressBookMap.forEach((s, addressBook) -> addressBook.getContacts().forEach(
                contact -> {
                    if(contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
               			System.out.println(addressBook.getAddressBookName()+"\t"+contact.toString());
                    }
                    }));
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
