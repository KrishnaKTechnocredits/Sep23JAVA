/*Assignment-30 : 22nd Sep'2023
 
Write a method which takes input and return to return all Uppercase from given input.

input : "TeCHNocreditS";
output : TCHNS

Hint : we can add characters in string like below.
String output = "";
output = output + str.charAt(index)*/

package jaykumar;

public class Assignment30 {

	String upperCase(String input) {
		String output = "";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				output = output+ch;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		String output = new Assignment30().upperCase("TeCHNocreditS");
		System.out.println(output);
	}
}