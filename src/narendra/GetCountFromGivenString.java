/*
Assignment - 23 : 14th Sep'2023
Write a program to find count of Uppercase, lowercase, digits and special characters.

String str = "TecHNo_cR6ediTs";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 1
		 Special char count -> 1
*/

package narendra;

public class GetCountFromGivenString {

	void toPrintCountFromGivenString(String input) {
//		System.out.println(input.toUpperCase());
		int countUppercase = 0;
		int countLowercase = 0;
		int countDigits = 0;
		int countSpaceChar = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				countUppercase++;
			} else if (Character.isLowerCase(ch)) {
				countLowercase++;
			} else if (Character.isDigit(ch)) {
				countDigits++;
			} else {
				countSpaceChar++;
			}
		}
		System.out.println("Uppercase count is: " + countUppercase);
		System.out.println("Lowercase count is: " + countLowercase);
		System.out.println("Digits count is: " + countDigits);
		System.out.println("Special Char count is: " + countSpaceChar);

	}

	public static void main(String[] args) {
		GetCountFromGivenString getcountfromstring = new GetCountFromGivenString();
		getcountfromstring.toPrintCountFromGivenString("TecHNo_cR6ediTs");

	}

}
