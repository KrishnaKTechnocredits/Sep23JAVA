/*
Assignment-54 : 13th Oct'2023
Write a program to return unique (non-repeated) vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : iu
 */

package jagrati;

public class Assigment54 {
	String vowels(String input) {
		String output ="";
		while (input.length() != 0) {
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			if(ch=='i' || ch== 'u') {
				output = output +ch;
			}
		}
		return output;
	}
public static void main(String[] args) {
	String output = new Assigment54().vowels("aakaniksha eaep dube");
	//String input = "aakaniksha eaep dube";
	System.out.println("unique (non-repeated) vowels included in the string is = " + output);
	
}
}
