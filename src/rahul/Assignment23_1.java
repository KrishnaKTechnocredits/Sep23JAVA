/*Assignment - 23 : 14th Sep'2023
Write a program to find count of Uppercase, lowercase, digits and special characters.

String str = "TecHNo_cR6ediTs";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 1
		 Special char count -> 1*/

package rahul;

public class Assignment23_1 {

	int uppercaseCount;
	int lowercaseCount;
	int digitCount;
	int specialCharCount;

	void findUpperLowercaseDigitsSpecialChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				uppercaseCount++;
			} else if (Character.isLowerCase(input.charAt(index))) {
				lowercaseCount++;
			} else if (Character.isDigit(input.charAt(index))) {
				digitCount++;
			} else {
				specialCharCount++;
			}
		}
		displayCount();
	}

	void displayCount() {
		System.out.println("Uppercase -> " + uppercaseCount);
		System.out.println("Lowercase -> " + lowercaseCount);
		System.out.println("Digit -> " + digitCount);
		System.out.println("Special char count -> " + specialCharCount);
	}

	public static void main(String[] args) {
		Assignment23_1 assignment23_1 = new Assignment23_1();
		assignment23_1.findUpperLowercaseDigitsSpecialChar("TecHNo_cR6ediTs");
	}
}
