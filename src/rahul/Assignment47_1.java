/*
 Assignment - 47 : 8th Oct'2023
remove digit from given staring array

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : ["Rahul", "Technocredits", "Jay", "credits"]
 */

package rahul;

import java.util.Arrays;

public class Assignment47_1 {

	void removeDigits(String[] array) {
		String newStr = "";
		for (int index = 0; index < array.length; index++) {
			String str = array[index];
			newStr = "";
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (Character.isLowerCase(ch) || Character.isUpperCase(ch)) {
					newStr = newStr + ch;
				}
			}
			array[index] = newStr;
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		Assignment47_1 assignment47_1 = new Assignment47_1();
		String[] array = { "Rah2u4l", "Tech3no3credits", "J6a6y", "cred5it2s" };
		assignment47_1.removeDigits(array);
	}
}
