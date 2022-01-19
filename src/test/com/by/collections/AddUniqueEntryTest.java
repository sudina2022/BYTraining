package test.com.by.collections;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiPredicate;
import org.junit.Test;
import com.by.collections.model.AddressBookInfo;
import com.by.collections.model.ContactsInfo;

public class AddUniqueEntryTest {
	@Test
	public void addUniqueEntry() throws Exception {
		AddContactTest addContactTest = new AddContactTest();
		HashMap<String, AddressBookInfo> addressBookMap = createMap(addContactTest);
		System.out.println("Enter Address Book Name you want to edit:");
		Scanner scanner = new Scanner(System.in);
		String addBookName = scanner.nextLine();
		BiPredicate biPred = (aBookMap, addName) -> addressBookMap.containsKey(addBookName);
		if (biPred.test(addressBookMap, addBookName)) {
			ContactsInfo editContactsInfo = addContactTest.createNewContactInfo();
			if (((AddressBookInfo) addressBookMap.get(addBookName)).getContacts().contains(editContactsInfo)) {
				System.out.println("Contact already exists");
			} else {
				((AddressBookInfo) addressBookMap.get(addBookName)).getContacts().add(editContactsInfo);
			}
		} else {
			System.out.println("Address Book doesnt exist");
		}
		addContactTest.displayContacts(addressBookMap);
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
