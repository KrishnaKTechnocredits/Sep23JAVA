/*Assignment-30 : 22nd Sep'2023
 
Write a method which takes input and return to return all Uppercase from given input.

input : "TeCHNocreditS";
output : TCHNS*/

package rahul;

public class Assignment30_1 {

	String getAllUppercase(String input) {
		String strUppercase = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				strUppercase = strUppercase + ch;
			}
		}
		return strUppercase;
	}

	public static void main(String[] args) {
		Assignment30_1 assignment30_1 = new Assignment30_1();
		String output = assignment30_1.getAllUppercase("TeCHNocreditS");
		System.out.println("Uppercase chars: " + output);
	}
}
