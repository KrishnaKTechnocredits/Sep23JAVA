/*
# Program 1 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS

*/

//* Using For loop statement *//

package narendra;

public class Program_Test1_RearrangeString {

	void toPrintStringOutput1(String input) {
		System.out.print("output using for loop is: ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				System.out.print(ch);
			}
		}
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch)) {
				System.out.print(ch);
			}
		}
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				System.out.print(ch);
			}
		}

	}
//* Using Nested if-else statement *//

	void toPrintStringOutput2(String input) {
		String lCase = "";
		String uCase = "";
		String digit = "";
		System.out.println("");
		System.out.print("output using nested if-else is: ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch)) {
				lCase = lCase + ch;
			} else if (Character.isUpperCase(ch)) {
				uCase = uCase + ch;
			} else if (Character.isDigit(ch)) {
				digit = digit + ch;
			}

		}
		System.out.println(digit + lCase + uCase);

	}

	public static void main(String[] args) {
		Program_Test1_RearrangeString sumofdigits = new Program_Test1_RearrangeString();
		sumofdigits.toPrintStringOutput1("TeCHNoc33r44editS");
		sumofdigits.toPrintStringOutput2("TeCHNoc33r44editS");
	}

}