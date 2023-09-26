/*Program 1 : Write a program to rearrange string as per below example.
Method 1:
String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS
Method 2:
String input = "TeCHNoc33r44editS";
output : 14eocreditTCHNS
*/

package jaykumar;

public class ProgrammingTest1 {
	String uOutput = "";
	String lOutput = "";
	
	String getOutput(String input) {
		String output = "";
		String dOutput = "";

		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				dOutput += ch;
			}else if(Character.isUpperCase(ch)) {
				uOutput += ch;
			}else if(Character.isLowerCase(ch)) {
				lOutput += ch;
			}
		}
		output = dOutput+lOutput+uOutput;
		return output;
	}
	
	String getOutput1(String input) {
		String output="";
		int sum=0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				int i = Character.getNumericValue(ch);
				sum += i;
			}
		}
		output = sum+lOutput+uOutput;
		return output;
	}
	
	public static void main(String[] args) {
		ProgrammingTest1 test = new ProgrammingTest1();
		String output = test.getOutput("TeCHNoc33r44editS");
		System.out.println(output);
		String output1 = test.getOutput1("TeCHNoc33r44editS");
		System.out.println(output1);
	}
}
