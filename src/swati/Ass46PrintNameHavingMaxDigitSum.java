/*Assignment - 46 : 8th Oct'2023 Print the name having maximum digit sum from
given array. String[] 
input = new String[4];
input[0] = "Rah2u4l"; 
input[1] = "Tech3no3credits"; 
input[2] = "J6a6y"; 
input[3] = "cred5it2s";
output : J6a6y -> 12*/

package swati;

public class Ass46PrintNameHavingMaxDigitSum {

	int calculateSum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	void printMaxSumName(String[] input) {
		String name = "";
		int total = 0;
		for (int index = 0; index < input.length; index++) {
			int digitsum = calculateSum(input[index]);
			if (digitsum > total) {
				total = digitsum;
				name = input[index];
			}
		}
		System.out.println(name + " -> " + total);
	}

	public static void main(String[] args) {
		String[] str = { "Rah2u4l", "Tech3no3credits", "J6a6y", "cred5it2s" };
		new Ass46PrintNameHavingMaxDigitSum().printMaxSumName(str);
	}
}
