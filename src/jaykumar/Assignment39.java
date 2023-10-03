/*Assignment 39: 01st Oct 2023
WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as is in the given string 
String str = "Yo7GEsH";
output : yO7geSh*/

package jaykumar;

public class Assignment39 {

	String processString(String input) {
		String output = "";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
				output += ch;
			}else if(Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
				output += ch;
			}else {
				output += ch;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		String str = "Yo7GEsH";
		System.out.println("Input String: "+str);
		System.out.println("Output String: "+assignment39.processString(str));
	}
}
