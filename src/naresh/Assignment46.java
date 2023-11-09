package naresh;
public class Assignment46 {

	int getSumOfDigit(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	void sumOfMaxDigit(String[] arry) {
		int maxSum = 0;
		String maxSumName = "";
		for (int index = 0; index < arry.length; index++) {
			int output = getSumOfDigit(arry[index]);
			if (maxSum < output) {
				maxSum = output;
				maxSumName = arry[index];
			}
		}
		System.out.println(maxSumName + "->" + maxSum);
	}

	public static void main(String[] args) {
		Assignment46 a = new Assignment46();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		a.sumOfMaxDigit(input);
	}
}





	
/*
 * Assignment - 46 : 8th Oct'2023
 *//*
 * Print the name having maximum digit sum from given array.
 * 
 * String[] input = new String[4]; input[0] = "Rah2u4l"; input[1] =
 * "Tech3no3credits"; input[2] = "J6a6y"; input[3] = "cred5it2s";
 * 
 * output : J6a6y -> 12
 */