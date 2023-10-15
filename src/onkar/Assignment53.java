/*Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu

String getVowels(String str){
	String output = "";
	while(str.length() != 0){
		
	}	
}*/

package onkar;

public class Assignment53 {
	
	void getVowels (String input) {
		String output = "";
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (ch != '*') {
				if (ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u') {
					output += ch;
					input = input.replace(ch , '*');
				}
			}
		}
		System.out.println("Unique vowels in the given string are : "+output);
	}
	
	public static void main (String[] args) {
		new Assignment53().getVowels("aakaniksha eaep dube");
	}
}