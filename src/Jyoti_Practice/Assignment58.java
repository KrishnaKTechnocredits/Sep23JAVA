/*WAP to print only special characters from the given string.
String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
output : "_!# *&%$" 
Note: including space in between
In case you are really blocked, refer  #836 for my approach
	 */

package Jyoti_Practice;

public class Assignment58 {

	String getSpecialCharacters(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
				output = output + ch;

			}
		}
		return output;

	}

	public static void main(String[] args) {
		Assignment58 ass = new Assignment58();
		System.out.println("Special character String-->" + ass.getSpecialCharacters("Te_23!cHNo#3cR3 2ed*&i2t%1S$"));
	}

}
