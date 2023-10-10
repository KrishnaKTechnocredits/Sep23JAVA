//WAP o print String having maximum digit sum from given array.
//Input: {Rah2u4, Technocredits, J6a6y, cred5it2s}
//Output : J6a6y

package akshita.array;

import java.util.Arrays;

public class Assignment46 {

	void maxDigitString(String[] input) {
		int max = 0;
		String var = "";
		for (int index = 0; index < input.length; index++) {
			int sum = 0;
			String str = input[index];
			for (int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				char ch = str.charAt(innerIndex);
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
			}
			if (max < sum) {
				max = sum;
				var = str;
			}
		}
		System.out.println("String having maximum digit sum : "+ var);
	}

	public static void main(String[] args) {
		Assignment46 ass46 = new Assignment46();
		String[] arr = { "Rah2u4", "Technocredits", "J6a6y", "cred5it2s" };
		System.out.println(Arrays.toString(arr));
		ass46.maxDigitString(arr);
	}
}
