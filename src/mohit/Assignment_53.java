/*Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu

String getVowels(String str){
	String output = "";
	while(str.length() != 0){
		
	}	
}*/

package mohit;

public class Assignment_53 {
	void uniqueVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (ch != '*') {
					output = output + ch;
					input = input.replace(ch, '*');
				}
			}

		}
		System.out.println("The unique values in the string "  + "-> " + output);
	}

	public static void main(String[] args) {
		new Assignment_53().uniqueVowels("aakaniksha eaep dube");
		
	}
}
