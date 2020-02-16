import java.util.ArrayList;

public class AddressBook {
	ArrayList<Key> key = new ArrayList<Key>();
	ArrayList<Value> value = new ArrayList<Value>();
	
	public AddressBook() {
		
	}
	
	public void set(Key k, Value v) {
		key.add(k);
		value.add(v);
	}
	public Value get(Key k) {
		int index = key.indexOf(k);
		return value.get(index);
	}
	
	public String toString() {
		String s ="";
		for(int i=0;i<key.size();i++) {
			s +=  key.get(i)+" , "+value.get(i)+"\n";
		}
		return s;
	}
	
}
