/*Programming Test - 1 : 24th Sep'2023

Program 1 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS

String getOutput(String input){

}*/
package mayank;

public class Mayank_ProgrammingTest1 {
	String nOutput;

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
		nOutput = dOutput + lOutput + uOutput;
		return nOutput;
	}

	String getOutPut2(String input) {
				int dsum = 0;
				String uOutput = "";
				String lOutput = "";
				//String dOutput = "";
					for (int index = 0; index < input.length(); index++) {
						char ch= input.charAt(index);
						if (Character.isDigit(ch)) {
							int temp = Character.getNumericValue(ch);
							dsum = dsum + temp;
						}else if(Character.isUpperCase(ch))
							uOutput = uOutput + ch;
						else if(Character.isLowerCase(ch))
							lOutput = lOutput + ch;						
					}
	
					System.out.println("Output String2: ");
					nOutput = dsum + lOutput + uOutput;
					return nOutput;
	}
     public static void main(String[] args) {
    	 Mayank_ProgrammingTest1 test = new Mayank_ProgrammingTest1 ();
    	 System.out.println(test.getOutPut1("TeCHNoc33r44editS"));
    	 System.out.println(test.getOutPut2("TeCHNoc33r44editS"));
     }
     }