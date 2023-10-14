/*Assignment-54 : 13th Oct'2023

Write a program to return unique (non- repetitive)vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : iu

String getVowels(String str){
	String output = "";
	while(str.length() != 0){
		
	}	
}
*/

package Jyoti_Practice;

public class Assignment54 {

	String getNonRepetitiveVowels(String str) {
		String output = "";
		while (str.length() != 0) {
			int originalLength = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (originalLength - newLength == 1) {
					output = output + ch;
				}

			}

		}
		return output;

	}

	public static void main(String[] args) {
		Assignment54 ass = new Assignment54();
		System.out.println("Non repetitive vowels are-->" + ass.getNonRepetitiveVowels("aakaniksha eaep dube"));
	}

}
