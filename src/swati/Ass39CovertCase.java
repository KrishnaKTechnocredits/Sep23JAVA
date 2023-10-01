/*Assignment 39: 01st Oct 2023 WAP to convert lowercase character to uppercase and 
uppercase character to lowercase, keeping the digit as is in the given string.
String str = "Yo7GEsH"; 
output : yO7geSh*/

package swati;

public class Ass39CovertCase {

	void converCase(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				output = output + Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				output = output + Character.toUpperCase(ch);
			} else {
				output = output + ch;
			}
		}
		System.out.println(input + "-->" + output);
	}

	public static void main(String[] args) {
		Ass39CovertCase ass39CovertCase = new Ass39CovertCase();
		ass39CovertCase.converCase("Yo7GEsH");
	}
}
