
abstract class CipherS {
	protected char[] alp = new char[26];
	
	public abstract String encode(String in);
	public abstract String decode(String in);
}
