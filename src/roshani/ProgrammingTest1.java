/*Program 1 : Write a program to rearrange string as per below example.
String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS

String getOutput(String input){

}

Program 2 : Write a program to rearrange string as per below example.
String input = "TeCHNoc33r44editS";
output : 14eocreditTCHNS
*/

package roshani;

public class ProgrammingTest1 {
	
	String getOutput(String input){
		
		String digitOutput= "";
		String upperOutput= "";
		String lowerOutput= "";
		
		for(int index = 0; index < input.length(); index++){
			char ch = input.charAt(index);
			if(Character.isDigit(ch)){
				digitOutput = digitOutput + ch;
			}else if(Character.isLowerCase(ch)){
				lowerOutput = lowerOutput + ch;
			}else if(Character.isUpperCase(ch)){
				upperOutput = upperOutput + ch;
			}
		}
		String output = digitOutput + lowerOutput + upperOutput;
		System.out.println("Rearraged String of Program1 is: " + output);
		return output;
	}
	
	String getOutput1(String input){
		int digitSum = 0;
		String upperOutput= "";
		String lowerOutput= "";
		
		for(int index = 0; index < input.length(); index++){
			char ch = input.charAt(index);
			if(Character.isDigit(ch)){
				digitSum = digitSum + Character.getNumericValue(ch);
			}else if(Character.isLowerCase(ch)){
				lowerOutput = lowerOutput + ch;
			}else if(Character.isUpperCase(ch)){
				upperOutput = upperOutput + ch;
			}
		}
		String output = digitSum + lowerOutput + upperOutput;
		System.out.println("Rearraged String of Program2 is: " + output);
		return output;
	}
	
	public static void main(String[] args){
		ProgrammingTest1 programmingtest1 = new ProgrammingTest1();
		programmingtest1.getOutput("TeCHNoc33r44editS");
		programmingtest1.getOutput1("TeCHNoc33r44editS");
	}
}