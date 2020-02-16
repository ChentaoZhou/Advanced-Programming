
public class Business implements Key{
	private String name;
	
	public Business(String n) {
		name =n;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Business: "+name;
	}
}
