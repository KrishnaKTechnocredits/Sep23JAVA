package denish;

public class Assignment26 {
	
	void printAll(String str) {
		while(str.length() > 0) {
			int orgLength = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			System.out.println(ch + "->" + (orgLength-newLength));
		}
	}
	
	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		assignment26.printAll("aakanksha");
	}
}
