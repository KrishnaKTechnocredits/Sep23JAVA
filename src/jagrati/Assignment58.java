/*
Assignment-58 : 13th Oct'2023
WAP to print only special characters from the given string.
String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
output : "_!# *&%$" 
Note: including space in between
In case you are really blocked, refer  #836 for my approach*/

package jagrati;

public class Assignment58 {
	void specialCharacters(String input) {
		System.out.println("Please find below only special characters from the given string Te_23!cHNo#3cR3 2ed*&i2t%1S$ ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {

			} else if (Character.isLowerCase(ch)) {

			} else if (Character.isDigit(ch)) {

			} else {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		Assignment58 assign = new Assignment58();
		assign.specialCharacters("Te_23!cHNo#3cR3 2ed*&i2t%1S$");
	}
}
