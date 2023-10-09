/*Assignment - 47 : 8th Oct'2023 Print the string eliminating digits
 *  given array. String[] input = new String[4]; input[0] = "Rah2u4l"; 
 *  input[1] = "Tech3no3credits"; input[2] = "J6a6y"; input[3] = "cred5it2s"; 
 *  output : ["Rahul", "Technocredits", "Jay", "credits"]
*/
package swati;

import java.util.Arrays;

public class Ass47PrintNameHaveMaxDigSum {

	String getOutput(String str) {
		String str1 = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch)) {
				str1 += ch;
			}
		}
		return str1;
	}

	void printString(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = getOutput(input[index]);
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		String[] input = { "Rah2u4l", "Tech3no3credits", "J6a6y", "cred5it2s" };
		new Ass47PrintNameHaveMaxDigSum().printString(input);
	}
}
