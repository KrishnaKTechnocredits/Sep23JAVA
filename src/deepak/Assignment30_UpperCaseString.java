/*Assignment-30 : 22nd Sep'2023
 
Write a method which takes input and return to return all Uppercase from given input.

input : "TeCHNocreditS";
output : TCHNS

Hint : we can add characters in string like below.
String output = "";
output = output + str.charAt(index);*/
package deepak;

public class Assignment30_UpperCaseString {

	String getUpperCaseString(String input) {
		System.out.println("Input: " + input);
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				output = output + input.charAt(index);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment30_UpperCaseString getString = new Assignment30_UpperCaseString();
		String output = getString.getUpperCaseString("TeCHNocreditS");
		System.out.println("Output: " + output);
	}
}
