/*
Assignment-31 : 23rd Sep'2023 
Write a method which takes input and return all Uppercase from given input using ascii.

input : "TeCHNocreditS";
output : TCHNS
 
 */

package narendra;

public class Assignment30_ToDisplayUpperCase_UsingAscii {

	String printUppercaseFromGivenString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch <= 90 && ch >= 65) {
				output = output + ch;
			}
		}
//		System.out.println("output is: " + output);
		return output;
	}

	public static void main(String[] args) {
		Assignment30_ToDisplayUpperCase_UsingAscii printasciivalue = new Assignment30_ToDisplayUpperCase_UsingAscii();
		String input = "TeCHNocreditS";
		String output = printasciivalue.printUppercaseFromGivenString(input);
		System.out.println("Uppercase output: " + output);
	}

}
