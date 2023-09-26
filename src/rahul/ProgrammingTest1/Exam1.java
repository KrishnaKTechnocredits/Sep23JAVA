/*Program 1 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS
*/

package rahul.ProgrammingTest1;

public class Exam1 {

	void getOutput(String input) {
		String outputDigit = "";
		String outputUppercase = "";
		String outputLowercase = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				outputDigit = outputDigit + input.charAt(index);
			} else if (Character.isUpperCase(input.charAt(index))) {
				outputUppercase = outputUppercase + input.charAt(index);
			} else if (Character.isLowerCase(input.charAt(index))) {
				outputLowercase = outputLowercase + input.charAt(index);
			}
		}
		System.out.println("Final output is: " + outputDigit + outputLowercase + outputUppercase);
	}

	public static void main(String[] args) {
		Exam1 e1 = new Exam1();
		e1.getOutput("TeCHNoc33r44editS");
	}
}
