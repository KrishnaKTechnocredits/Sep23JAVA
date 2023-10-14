/* WAP to print only special characters from the given string.
String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
output : "_!# *&%$" 
Note: including space in between */

package sayali;

public class Assignment58 {

	void printSpecialChar(String input) {

		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch) || Character.isLetter(ch)) {
				input = input.replace(ch, '@');
			}
		}
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch != '@')
				output += ch;
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		new Assignment58().printSpecialChar("Te_23!cHNo#3cR3 2ed*&i2t%1S$");
	}
}