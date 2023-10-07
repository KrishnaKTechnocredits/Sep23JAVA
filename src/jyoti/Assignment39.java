/*Assignment 39: 01st Oct 2023
WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as is in the given string 
String str = "Yo7GEsH";
output : yO7geSh
*/

package jyoti;

public class Assignment39 {

	void getData(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				output = output + Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				output = output + Character.toUpperCase(ch);
			} else {
				output = output + ch;
			}
		}
		System.out.println("Output-->" + output);
	}

	public static void main(String[] args) {
		Assignment39 cc = new Assignment39();
		cc.getData("Yo7GEsH");

	}

}