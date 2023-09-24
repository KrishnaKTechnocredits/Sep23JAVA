/*Write a method which takes input and return to return all Uppercase from given input.

input : "TeCHNocreditS";
output : TCHNS

Hint : we can add characters in string like below.
String output = "";
output = output + str.charAt(index);*/

package onkar;

public class Assignment30 {
	
	void printUppercaseCharacters (String input) {
		String output = "";
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				output = output+input.charAt(index);
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		assignment30.printUppercaseCharacters("TeCHNocreditS");
	}
}
