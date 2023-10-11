/* Print the name having maximum digit sum from given array.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
output : J6a6y -> 12 */

package sayali;

public class Assignment46 {

	int getMaxDigitSum(String input) {

		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	void processData(String[] input) {

		int sum = 0;
		int maxSum = 0;
		for (int index = 0; index < input.length; index++) {
			String s = input[index];
			sum = getMaxDigitSum(s);
			if (sum > maxSum) {
				maxSum = sum;
			}
		}
		System.out.println(+maxSum);
	}

	public static void main(String[] args) {
		Assignment46 assignment46 = new Assignment46();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		assignment46.processData(input);
	}
}