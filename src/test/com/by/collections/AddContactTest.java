package test.com.by.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiPredicate;

import org.junit.Test;

import com.by.collections.model.AddressBookInfo;
import com.by.collections.model.ContactsInfo;

public class AddContactTest {
	
	@Test
	public void addNewContact() throws Exception {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, AddressBookInfo> addressBookMap = new HashMap<>();
		
		System.out.println("Enter the number of Address Books:");
		int noOfEntries = scanner.nextInt(); 
		for(int i=0;i<noOfEntries;i++) {
			System.out.println("Enter the number of Contact for :");
     		int noOfContactEntries = scanner.nextInt(); 
			
				System.out.println("Enter Address Book Name:\n");
				String addBookName = scanner.next();
	     		for(int j=0;j<noOfContactEntries;j++) {
					ContactsInfo conInfo = createNewContactInfo();
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
		displayContacts(addressBookMap);
	}
	
	public ContactsInfo createNewContactInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter First Name:\n");
		String firstName = scanner.next();
        System.out.print("\nEnter Last Name:");
        String lastName = scanner.next();
        System.out.println("\nEnter Address:");
        String address = scanner.next();
        System.out.println("\nEnter City:");
        String city = scanner.next();
        System.out.println("\nEnter State:");
        String state = scanner.next();
        System.out.println("\nEnter Zip:");
        String zip = scanner.next();
        System.out.println("\nEnter EmailID:");
        String email = scanner.next();
        System.out.println("\nEnter Phone No:");
        String phoneNo = scanner.next();
        return(new ContactsInfo(firstName, lastName, phoneNo, address, city, state, zip, email));
	}
	
	public void displayContacts(HashMap<String, AddressBookInfo> addressBookMap) {
		addressBookMap.forEach((s, addressBook) -> addressBook.getContacts().forEach(
                 contact -> {
                	 System.out.println(addressBook.getAddressBookName()+"\t"+contact.toString());
                     }));
    }
}

	