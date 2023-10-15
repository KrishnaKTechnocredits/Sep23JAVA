/*WAP to print only special characters from the given string.
String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
output : "_!# *&%$" 
Note: including space in between*/

package onkar;

public class Assignment58 {
	
	void printSpecialCharacters (String input) {input = input.toLowerCase();
		String output = "";
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch) || Character.isLetter(ch)) {
			}else {
				output += ch;
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		new Assignment58().printSpecialCharacters("Te_23!cHNo#3cR3 2ed*&i2t%1S$");
	}
}
