
public class Individual implements Key{
	private String name;
	
	public Individual(String n) {
		name =n;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Individual: "+name;
	}
}
