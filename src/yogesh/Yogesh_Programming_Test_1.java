/*Programming Test - 1 : 24th Sep'2023

Program 1 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS

String getOutput(String input){

}
*/
package yogesh;

public class Yogesh_Programming_Test_1 {
	String ucount = "";
	String lcount = "";
	String dcount = "";

	String getOutput(String input) {
		String output = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				dcount = dcount + ch;
			} else if (Character.isLowerCase(ch)) {
				lcount = lcount + ch;
			} else if (Character.isUpperCase(ch)) {
				ucount = ucount + ch;
			}
		}
		output = dcount + lcount + ucount;
		return output;
	}

	String getSum(String input) {
		String output = "";
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int i = Character.getNumericValue(ch);
				sum = sum + i;
			}
		}
		output = output + sum + lcount + ucount;
		return output;
	}

	public static void main(String[] args) {
		Yogesh_Programming_Test_1 programming1 = new Yogesh_Programming_Test_1();
		String input = "TeCHNoc33r44editS";
		String output = programming1.getOutput(input);
		System.out.println("Progran 1 output is->" + output);
		String output1 = programming1.getSum(input);
		System.out.println("Program 2 output is->" + output1);
	}
}
