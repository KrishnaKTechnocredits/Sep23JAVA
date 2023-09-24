/* Program 1 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";

output : 3344eocreditTCHNS */

package shrutika;

public class ProgramingTest1 {

	String getOut(String input) {
		String uCase = "";
		String lCase = "";
		String dCase = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				uCase = uCase + input.charAt(index);
			} else if (Character.isLowerCase(input.charAt(index))) {
				lCase = lCase + input.charAt(index);
			} else if (Character.isDigit(input.charAt(index))) {
				dCase = dCase + input.charAt(index);
			}
		}
		String output = dCase + lCase + uCase;
		return output;
	}

	public static void main(String[] args) {
		ProgramingTest1 programingTest1 = new ProgramingTest1();
		programingTest1.getOut("TeCHNoc33r44editS");
		System.out.println(programingTest1.getOut("TeCHNoc33r44editS"));
	}
}
