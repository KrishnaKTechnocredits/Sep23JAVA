package gaurang;

public class Assignment19 {

	void getChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("Frequency of " + ch + " is " + count);
	}
	
	void revChar(String input1) {
		for (int index = input1.length()-1; index >= 0; index--) {
			char chh = input1.charAt(index);
			System.out.println(chh);
		}	
	}

	public static void main(String[] args) {
		Assignment19 a19 = new Assignment19();
		a19.getChar("techno", 't');
		a19.revChar("techno");
	}
}