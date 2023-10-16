/*Assignment - 45 : 8th Oct'2023

Print the name having maximum and minimum length from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : Min length name is : J6a6y
         Max length name is : Technocredits*/

package rahul;

public class Assignment45_1 {

	void checkLength(String[] input) {
		int minLength = input[0].length();
		String minString = "";
		int maxLength = input[0].length();
		String maxString = "";
		for (int index = 0; index < input.length; index++) {
			if (maxLength < input[index].length()) {
				maxLength = input[index].length();
				maxString = input[index];
			}
			if (minLength > input[index].length()) {
				minLength = input[index].length();
				minString = input[index];
			}
		}
		System.out.println("Min length name is: " + minString);
		System.out.println("Max length name is: " + maxString);
	}

	public static void main(String[] args) {
		Assignment45_1 assignment45_1 = new Assignment45_1();
		String[] arr = { "Rah2u4l", "Technocredits", "J6a6y", "cred5it2s" };
		assignment45_1.checkLength(arr);
	}
}