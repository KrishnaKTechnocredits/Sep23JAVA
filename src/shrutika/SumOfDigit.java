/*Assignment - 24 : 16th Sep'2023

Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13 */

package shrutika;

public class SumOfDigit {

	void CharFreqSumOfDigit(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				int num = Character.getNumericValue(input.charAt(index));
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfDigit sumOfDigit = new SumOfDigit();
		sumOfDigit.CharFreqSumOfDigit("Rah5ulTEC6Hnoc2redItS");
	}

}
