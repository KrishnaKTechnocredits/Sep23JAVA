/*Assignment - 46 : 8th Oct'2023
Print the name having maximum digit sum from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : J6a6y -> 12
 */

package jagrati;

public class Assignment46 {
	
	int getSum(String str) {
		int sum =0; 
		for (int index =0; index < str.length(); index++) {
			char ch= str.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	void maxDigitSum(String [] input) {
		int maxSum =0;
		String name = "";
		for(int index =0; index < input.length; index++) {
			int temp = getSum(input[index]);
			if (temp>maxSum) {
				maxSum = temp;
				name = input[index];
			}
		} System.out.println("Name " + name + " have maximum digit sum = " + maxSum);
	}
public static void main(String[] args) {
	String[] input = new String[4];
	input[0] = "Rah2u4l";
	input[1] = "Tech3no3credits";
	input[2] = "J6a6y";
	input[3] = "cred5it2s";
	Assignment46 assign = new Assignment46();
	assign.maxDigitSum(input);
}
}
