/*print the name having maximum digit sum from given array*/


package hetal;

public class Assignment46 {
	
	void printMaxDigitSum(String[] arr) {
		int maxSum = 0;
		String output = "";
		for(int index=0;index<arr.length;index++) {
			String x = arr[index];
			int sum = getDigitSum(x);
			if(sum > maxSum) {
				maxSum = sum;
				output = x;
			}
		}
		System.out.println(output + "-->" + maxSum);
	}
	
	int getDigitSum(String input) {
		int sum = 0;
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "j6a6y";
		input[3] = "cred5it2s";
		new Assignment46().printMaxDigitSum(input);
	}

}
