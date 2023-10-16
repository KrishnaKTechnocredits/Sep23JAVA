/*Assignment-58 : 13th Oct'2023 WAP to print only special
characters from the given string. String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
output : "_!# *&%$" */

package swati;

public class Ass58PrintOnlySpecialChar {

	void printSpecialChar(String input) {
		System.out.println("Origional string : "+input);
		String Specialcharstring = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isLetterOrDigit(ch)) {
				Specialcharstring += ch;
			}
		}
		System.out.println("Special characters in given string are : "+Specialcharstring);
	}

	public static void main(String[] args) {
		new Ass58PrintOnlySpecialChar().printSpecialChar("Te_23!cHNo#3cR3 2ed*&i2t%1S$");
	}
}
