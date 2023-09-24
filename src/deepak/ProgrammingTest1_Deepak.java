/*Programming Test - 1 : 24th Sep'2023

Program 1 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS

String getOutput(String input){

}


Program 2 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 14eocreditTCHNS

String getOutput(String input){

}*/

package deepak;

public class ProgrammingTest1_Deepak {
	String fOutput;

	String getOutPut1(String input) {
		System.out.println("Input String: " + input);
		String uOutput = "";
		String lOutput = "";
		String dOutput = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch))
				uOutput = uOutput + ch;
			else if (Character.isLowerCase(ch))
				lOutput = lOutput + ch;
			else if (Character.isDigit(ch))
				dOutput = dOutput + ch;
		}
		System.out.println("Output String1: ");
		fOutput = dOutput + lOutput + uOutput;
		return fOutput;
	}

	String getOutPut2(String input) {
		int dSum = 0;
		String uOutput = "";
		String lOutput = "";
		String dOutput = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				dSum = dSum + temp;
			} else if (Character.isUpperCase(ch))
				uOutput = uOutput + ch;
			else if (Character.isLowerCase(ch))
				lOutput = lOutput + ch;
		}
		System.out.println("Output String2: ");
		fOutput = dSum + lOutput + uOutput;
		return fOutput;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingTest1_Deepak result = new ProgrammingTest1_Deepak();
		System.out.println(result.getOutPut1("TeCHNoc33r44editS"));
		System.out.println(result.getOutPut2("TeCHNoc33r44editS"));
	}
}