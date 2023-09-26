/*Program 2 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 14eocreditTCHNS */
package shrutika;

public class ProgramTest2 {

	String getOutput(String input) {
		int digit = 0;
		String lCase = "";
		String uCase = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digit = digit + Character.getNumericValue(ch);
			} else if (Character.isLowerCase(ch)) {
				lCase = lCase + ch;
			} else if (Character.isUpperCase(ch)) {
				uCase = uCase + ch;
			}
		}
		String temp = digit + lCase + uCase;
		return temp;
	}

	public static void main(String[] args) {
		ProgramTest2 programTest2 = new ProgramTest2();
		String output = programTest2.getOutput("TeCHNoc33r44editS");
		System.out.println(output);
	}
}
