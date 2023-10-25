/*Assignment-53 : 13th Oct'2023

Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu

String getVowels(String str){
	String output = "";
	while(str.length() != 0){
		
	}	
}*/

package pratik;

public class Assignment53 {

	void printUniqueVowel(String input) {
		String output = "";
		while (input.length() != 0) {
			char ch = input.charAt(0);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
			input = input.replace(String.valueOf(ch), "");//Removes all occurrences of the current character from the input string.
		}
		System.out.println("Unique vowels in string are: " + output);
	}

	public static void main(String[] args) {
		Assignment53 assignment53 = new Assignment53();
		assignment53.printUniqueVowel("aakaniksha eaep dube");
	}
}
