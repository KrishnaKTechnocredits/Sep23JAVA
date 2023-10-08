/*Print the name having maximum digit sum from given array.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no5credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : J6a6y -> 12*/

package gaurang;

public class Assignment46 {

	int getSum (String input) {
		int sum = 0;
		for(int index=0 ; index<input.length() ; index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	void getPrint(String[] input) {
		int sum = 0;
		int maxSum = 0;
		int minSum = getSum(input[0]);
		String max = "";
		String min = input[0];
		for(int index = 0 ; index<input.length ; index++) {
			String x = input[index];
			sum = getSum(x);
			if(sum>maxSum) {
				maxSum = sum;
				max = x;
			}
			if(sum<minSum) {
				minSum = sum;
				min = x;
			}
		}
		System.out.println(max+" has Maximum sum value --> "+maxSum);
		System.out.println(min+" has Minimum sum value --> "+minSum);
	}
	
	public static void main(String[] args) {
		Assignment46 a = new Assignment46();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no5credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		a.getPrint(input);
	}
}
