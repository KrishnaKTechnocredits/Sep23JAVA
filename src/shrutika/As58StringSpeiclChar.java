/*Assignment-58 : 13th Oct'2023

WAP to print only special characters from the given string.
String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
output : "_!# *&%$" 
Note: including space in between */
package shrutika;

public class As58StringSpeiclChar {

	void specialChar(String input) {
		String splChar = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isLetterOrDigit(ch))
				splChar = splChar + ch;
		}
		System.out.println(input + "\nSpecial Characters are -> " + splChar);
	}

	public static void main(String[] args) {
		new As58StringSpeiclChar().specialChar("Te_23!cHNo#3cR3 2ed*&i2t%1S$");
	}
}
