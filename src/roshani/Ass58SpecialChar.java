/*WAP to print only special characters from the given string.
String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
output : "_!# *&%$" 
Note: including space in between
In case you are really blocked, refer  #836 for my approach
*/

package roshani;

public class Ass58SpecialChar {
	String getSpecialCharacters(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
				output = output + ch;

			}
		}
		System.out.println("Given string is: "+str);
		return output;
	}

	public static void main(String[] args) {
		Ass58SpecialChar assignment58 = new Ass58SpecialChar();
		System.out.println("Special characters in given string are-->" + assignment58.getSpecialCharacters("Te_23!cHNo#3cR3 2ed*&i2t%1S$"));
	}
}
