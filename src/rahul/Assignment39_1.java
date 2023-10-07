/*Assignment 39: 01st Oct 2023
WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as is in the given string 
String str = "Yo7GEsH";
output : yO7geSh*/

package rahul;

public class Assignment39_1 {

	void convertToUpperCaseOrLowerCase(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				char chLower = Character.toLowerCase(ch);
				output = output + chLower;
			} else if (Character.isLowerCase(ch)) {
				char chUpper = Character.toUpperCase(ch);
				output = output + chUpper;
			} else if (Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		System.out.println("Output is: " + output);
	}

	public static void main(String[] args) {
		Assignment39_1 assignment39_1 = new Assignment39_1();
		assignment39_1.convertToUpperCaseOrLowerCase("Yo7GEsH");
		assignment39_1.convertToUpperCaseOrLowerCase("yO7geSh");
	}
}
