/*Assignment - 46 : 8th Oct'2023
Print the name having maximum digit sum from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : J6a6y -> 12*/

package jyoti_Array;

public class Assignment46 {

	int sumDigit(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);

			}
		}
		return sum;
	}

	void getString(String[] input) {
		int maxsum = 0;
		String temp = "";
		for (int index = 0; index < input.length; index++) {

			int sum = sumDigit(input[index]);
			if (sum > maxsum) {
				maxsum = sum;
				temp = input[index];
			}

		}
		System.out.println("String have max sum-->" + temp + '\n' + "Addition of digits-->" + maxsum);
	}

	public static void main(String[] arg) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

		Assignment46 ass46 = new Assignment46();
		ass46.getString(input);

	}
}
