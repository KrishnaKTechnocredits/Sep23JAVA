/*Assignment - 45 : 8th Oct'2023

Print the name having maximum and minimum length from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : Min length name is : J6a6y
         Max length name is : Technocredits*/
package jyoti_Array;

import java.util.Arrays;

public class Assignment45 {

	void maxLengthString(String[] str) {
		String max = str[0];
		String min = str[0];

		for (int index = 0; index < str.length; index++) {

			if (str[index].length() < min.length()) {
				min = str[index];
			} else if (str[index].length() > max.length()) {
				max = str[index];
			} 

		}
		System.out.println("Minimum length String is:--" + min+"Length-->"+min.length());
		System.out.println("Maximum length String is:--" + max+"Length-->"+max.length());

	}

	public static void main(String[] args) {

		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

		Assignment45 ass = new Assignment45();
		ass.maxLengthString(input);
	}
}
