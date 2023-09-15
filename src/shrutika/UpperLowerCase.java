/*Assignment - 23 : 14th Sep'2023
Write a program to find count of Uppercase, lowercase, digits and special characters.

String str = "TecHNo_cR6ediTs";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 1
		 Special char count -> 1 */
package shrutika;

public class UpperLowerCase {

	void upperLowerDigit(String input) {
		int uCount = 0;
		int lCount = 0;
		int dCount = 0;
		int sCount = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				uCount++;
			} else if (Character.isLowerCase(input.charAt(index))) {
				lCount++;
			} else if (Character.isDigit(input.charAt(index))) {
				dCount++;
			} else {
				sCount++;
			}
		}
		System.out.println("Uppercase ->" + uCount + "\nLowercase -> " + lCount + " \nDigit -> " + dCount
				+ "  \nSpecial char count -> " + sCount);
	}

	public static void main(String[] args) {
		UpperLowerCase upperLowerCase = new UpperLowerCase();
		upperLowerCase.upperLowerDigit("TecHNo_cR6ediTs");
	}
}
