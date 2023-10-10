/*
 * Assignment-30 : 22nd Sep'2023
 
Write a method which takes input and return to return all Uppercase from given input.

input : "TeCHNocreditS";
output : TCHNS

Hint : we can add characters in string like below.
String output = "";
output = output + str.charAt(index)
 */

package shamli;

public class Assignment30 {
	String createUpperCaseString(String input) {
		System.out.println("Input string is :"+input);
		String output="";
		for(int index=0;index<input.length();index++){
			char ch=input.charAt(index);
			if(Character.isUpperCase(ch)) {
				output=output+ch;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Assignment30 assignment30=new Assignment30();
		String output=assignment30.createUpperCaseString("TeCHNocreditS");
		System.out.println("Uppercase String is:"+output);
	}

}
