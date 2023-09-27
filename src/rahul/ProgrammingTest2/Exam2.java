/*Program 2 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 14eocreditTCHNS*/

package rahul.ProgrammingTest2;

public class Exam2 {
	String outputDigit = "";
	String outputUppercase = "";
	String outputLowercase = "";
	int sum;

	void printSumString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				outputDigit = outputDigit + input.charAt(index);
			} else if (Character.isLowerCase(input.charAt(index))) {
				outputLowercase = outputLowercase + input.charAt(index);
			} else if (Character.isUpperCase(input.charAt(index))) {
				outputUppercase = outputUppercase + input.charAt(index);
			}
		}
		digitAddition();
	}

	void digitAddition() {

		for (int index = 0; index < outputDigit.length(); index++) {
			sum = sum + Character.getNumericValue(outputDigit.charAt(index));
		}
		System.out.println("Output is : " + sum + outputLowercase + outputUppercase);
	}

	public static void main(String[] args) {

		Exam2 e2 = new Exam2();
		e2.printSumString("TeCHNoc33r44editS");
	}
}
