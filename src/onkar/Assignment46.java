/*Print the name having maximum digit sum from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : J6a6y -> 12*/

package onkar;

public class Assignment46 {
	int sum(String input) {
		int sum = 0;
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	String findMaxSumString (String[] arr) {
		int maxSum = 0;
		String str = "";
		for (int index=0; index<arr.length; index++) {
			int sum = sum(arr[index]);
			if (sum > maxSum) {
				maxSum = sum;
				str = arr[index];
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		String maxDigitSumString = new Assignment46().findMaxSumString(input);
		System.out.println(maxDigitSumString);
	}
}
