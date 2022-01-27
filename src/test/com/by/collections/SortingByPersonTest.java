package test.com.by.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import org.junit.Test;
import com.by.collections.model.AddressBookInfo;
import com.by.collections.model.ContactsInfo;
public class SortingByPersonTest {
	
	@Test
	public void sortByPerson() {
	AddContactTest addContactTest = new AddContactTest();
	HashMap<String, AddressBookInfo> addressBookMap = createMap(addContactTest);
	Scanner scanner = new Scanner(System.in);

    addressBookMap.forEach((s, addressBook) -> {
    	ArrayList<ContactsInfo> sortedList = SortingByPersonTest.sortedList(addressBook.getContacts());
    	System.out.println(addressBook.getAddressBookName()+"\n");
    	SortingByPersonTest.displayContacts(sortedList);
    });
}
      
	
	public static ArrayList<ContactsInfo> sortedList(ArrayList<ContactsInfo> contacts) {
		ArrayList<ContactsInfo> sortedContacts =  (ArrayList<ContactsInfo>) contacts   	          	
    	.stream()
		.sorted(Comparator.comparing(ContactsInfo::getFirstName))
		.collect(Collectors.toList());
		return sortedContacts;
	}
	
	public static void displayContacts(ArrayList<ContactsInfo> contacts) {
		contacts.forEach(contact -> {
			System.out.println(contact.toString());
		});
	}
   

private HashMap<String, AddressBookInfo> createMap(AddContactTest addContactTest) {

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
