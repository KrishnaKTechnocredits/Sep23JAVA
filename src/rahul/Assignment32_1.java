/*Assignment-32 : 23nd Sep'2023 
Write a method to print number of Uppercase,lowercase and digits in the input using ascii.

input : "TeCHNoc33r44editS";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 4*/

package rahul;

public class Assignment32_1 {

	void useASCIIToFindCount(String input) {
		int uppercase = 0;
		int lowercase = 0;
		int digit = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch >= 65 && ch <= 90) {
				uppercase++;
			} else if (ch >= 97 && ch <= 122) {
				lowercase++;
			} else if (ch >= 48 && ch <= 57) {
				digit++;
			}
		}
		System.out.println("Uppercase -> " + uppercase);
		System.out.println("Lowercase -> " + lowercase);
		System.out.println("Digit -> " + digit);
	}

	public static void main(String[] args) {
		Assignment32_1 assignment32_1 = new Assignment32_1();
		assignment32_1.useASCIIToFindCount("TeCHNoc33r44editS");
	}
}
