/*WAP to print only special characters from the given string.
String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
output : "_!# *&%$" 
Note: including space in between*/

package mohit;

public class Assignment_58 {
	String output = "";

	void printSpecialCharacters(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch) || Character.isLetter(ch)) {
			} else {
				output = output + ch;
			}
		}
		System.out.println("The special character in the string is : " + output);
	}

	public static void main(String[] args) {
		String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
		new Assignment_58().printSpecialCharacters(str);

	}
}
