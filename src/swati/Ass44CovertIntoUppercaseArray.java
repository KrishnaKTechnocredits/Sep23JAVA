/*Assignment - 44 : 8th Oct'2023 Convert the input element into upper case if it 
 * contains digit. 
 * String[] input = new String[4];
 *input[0] = "Rah2u4l";
 *input[1] = "Technocredits";
 *input[2] = "J6a6y"; 
 *input[3] = "cred5it2s"; 
 * output : [RAH2U4L,Technocredits, J6A6Y, CRED5IT2S]
*/
package swati;

import java.util.Arrays;

public class Ass44CovertIntoUppercaseArray {

	boolean hasDigit(String input) {
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	void CovertStringCase(String[] input) {
		for (int index = 0; index < input.length; index++) {
			boolean flag = hasDigit(input[index]);
			if (flag) {
				input[index] = input[index].toUpperCase();
			}
		}
		System.out.println(Arrays.toString(input));
	}

	public static void main(String[] args) {
		String[] input = { "Rah2u4l", "Technocredits", "j6a6y", "cred5it2s" };
		new Ass44CovertIntoUppercaseArray().CovertStringCase(input);
	}

}
