/* Assignment-30 : 22nd Sep'2023
 
Write a method which takes input and return to return all Uppercase from given input.

input : "TeCHNocreditS";
output : TCHNS*/
package shrutika;

public class UpperCaseAssig30 {

	void upperCase(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(input.charAt(index))) {
				output = output + input.charAt(index);
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		UpperCaseAssig30 upperCaseAssig30 = new UpperCaseAssig30();
		upperCaseAssig30.upperCase("TeCHNocreditS");
	}
}
