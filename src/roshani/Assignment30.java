/*Assignment-30 : 22nd Sep'2023
 
Write a method which takes input and return to return all Uppercase from given input.

input : "TeCHNocreditS";
output : TCHNS

Hint : we can add characters in string like below.
String output = "";
output = output + str.charAt(index);
*/

package roshani;

public class Assignment30 {
	void upperCaseStringUsingForLoop(String input) {
		String output = "";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				output = output + ch;
			}
		}
		System.out.println("The uppercase letters from string '"+input+"' using For Loop are: " + output);
	}
	
	void upperCaseStringUsingWhileLoop(String input) {
		String output = "";
		int index = 0;
		while(index < input.length()) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				output = output + ch;
			}
		}
		index++;
		System.out.println("The uppercase letters from string '"+input+"' using While Loop are: " + output);	
	}
	
	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		assignment30.upperCaseStringUsingForLoop("TeCHNocreditS");
		assignment30.upperCaseStringUsingForLoop("TeCHNocreditS");
	}
}
