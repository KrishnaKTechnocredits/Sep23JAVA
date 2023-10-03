/*Assignment 39: 01st Oct 2023
WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as is in the given string 
String str = "Yo7GEsH";
output : yO7geSh
 */

package jagrati;

public class Assignment39 {
	static String covertCharacter(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch)) {
				output = output + Character.toUpperCase(ch);
			} else if (Character.isUpperCase(ch)) {
				output = output + Character.toLowerCase(ch);
			} else if (Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		System.out.println(input + " given string upper to lower and lower to upper conversion is " + output);
		return output;
	}

	public static void main(String[] args) {
		String input = "Yo7GEsH";
		Assignment39.covertCharacter(input);

	}
}
