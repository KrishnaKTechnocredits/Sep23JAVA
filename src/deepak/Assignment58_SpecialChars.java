/*
Assignment-58 : 13th Oct'2023

WAP to print only special characters from the given string.
String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
output : "_!# *&%$" 
Note: including space in between
In case you are really blocked, refer  #836 for my approach
*/

package deepak;

public class Assignment58_SpecialChars {
	String getSpecialChars(String input) {
		System.out.println("Input : " + input);
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!((ch > 47 && ch <= 57) || (ch > 64 && ch <= 90) || (ch > 96 && ch <= 122))) {
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment58_SpecialChars output = new Assignment58_SpecialChars();
		System.out.println("Output : " + output.getSpecialChars("Te_23!cHNo#3cR3 2ed*&i2t%1S$"));
	}

}
