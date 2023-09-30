package gaurang;

public class Assignment23 {

	void printCount(String input) {
		int upper = 0;
		int lower = 0;
		int digit = 0;
		int count = 0;
		for(int index= 0; index < input.length() ; index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				upper++;
			}
			else if(Character.isLowerCase(ch)) {
				lower++;
			}
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else {
				count++;
			}
		}
		System.out.println("Uppercase count is "+upper);
		System.out.println("Lowercase count is "+lower);
		System.out.println("Digit count is "+digit);
		System.out.println("Special Character count is "+count);
	}
	
	public static void main(String[] args) {
		Assignment23 a = new Assignment23();
		a.printCount("TecHNo_cR6ediTs");
	}
}
