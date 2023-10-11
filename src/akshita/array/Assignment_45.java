//Print the name having maximum and minimum length from given array.
///input ={"Rah2u4" , "Technocredits" , "J6a6y", "cred5it2s"}
//Output: Min length=J6a6y   & Max length=Technocredit

package akshita.array;

import java.util.Arrays;

public class Assignment_45 {
	int max;
	void maxString(String[] input) {
		String maxChar="";
		for (int index = 0; index < (input.length - 1); index++) {
			int iLength = input[index].length();
			if (max < iLength) {
				max = iLength;
				maxChar = input[index];
			}
		}
		System.out.println("Maximum length string : " + maxChar);
	}
	void minString(String[] input1) {
		int min = 0;
		String minChar="";
		for (int index = 0; index < (input1.length - 1); index++) {
			int iLength = input1[index].length();
			if (max < iLength) {
				min = iLength;
				minChar = input1[index];
			}
		}
		System.out.println("Minimum length string : " + minChar);
	}

	public static void main(String[] args) {
		Assignment_45 ass45 = new Assignment_45();
		String[] arr = { "Rah2u4", "Technocredits", "J6a6y", "cred5it2s" };
		System.out.println(Arrays.toString(arr));
		ass45.minString(arr);
		ass45.maxString(arr);
	}
	
}
