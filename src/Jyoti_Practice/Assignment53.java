/*Assignment-53 : 13th Oct'2023

Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu

Assignment-53 : 13th Oct'2023

Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu

String getVowels(String str){
	String output = "";
	while(str.length() != 0){
		
	}	
}
*/

package Jyoti_Practice;

public class Assignment53 {
	String getVowels(String input) {
		System.out.println("Input : " + input);
		String output = "";
		while (input.length() > 0) {
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment53 output = new Assignment53();
		System.out.println("Output : " + output.getVowels("aakanikshaeaepdube"));
	}
}