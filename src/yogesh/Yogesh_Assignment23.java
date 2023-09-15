/*Assignment - 23 : 14th Sep'2023
Write a program to find count of Uppercase, lowercase, digits and special characters.

String str = "TecHNo_cR6ediTs";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 1
		 Special char count -> 1*/

package yogesh;

public class Yogesh_Assignment23 {

	public static void main(String[] args) {
		String str = "TecHNo_cR6ediTs";
		int ucount = 0;
		int lcount = 0;
		int spacecount = 0;
		int dcount = 0;
		int specialcount = 0;

		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index))) {
				ucount++;
			} else if (Character.isLowerCase(str.charAt(index))) {
				lcount++;
			} else if (Character.isDigit(str.charAt(index))) {
				dcount++;
			} else if (str.charAt(index) == ' ') {
				spacecount++;
			} else
				specialcount++;
		}
		System.out.println("Uppercase ->" + ucount);
		System.out.println("Lowercase ->" + lcount);
		System.out.println("Digit ->" + dcount);
		System.out.println("Space ->" + spacecount);
		System.out.println("Special Character ->" + specialcount);
	}
}
