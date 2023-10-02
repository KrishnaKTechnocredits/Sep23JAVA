/*Assignment 39: 01st Oct 2023
WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as is in the given string 
String str = "Yo7GEsH";
output : yO7geSh*/

package deepak;

public class Assignment39_InvertCharacterCases {
	String caseChange(String input) {
		System.out.println("Input: " + input);
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch))
				output = output + Character.toUpperCase(ch);
			else if (Character.isUpperCase(ch))
				output = output + Character.toLowerCase(ch);
			else if (Character.isDigit(ch))
				output = output + ch;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment39_InvertCharacterCases invertChars = new Assignment39_InvertCharacterCases();
		System.out.println("Output: " + invertChars.caseChange("Yo7GEsH"));
	}
}
