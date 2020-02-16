
public class AddressBookTest {

	public static void main(String[] args) {
		AddressBook ab = new AddressBook();
		Key k1 = new Individual("Bob");
		Key k2 = new Business("Alice");
		Value v1 = new Phone("13126613500");
		Value v2 = new Address("21 Beith St");
		
		ab.set(k1, v1);
		ab.set(k2, v2);

		System.out.println(ab);
	}

}
