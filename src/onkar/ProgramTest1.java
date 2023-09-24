/*Program 1 : Write a program to rearrange string as per below example.
String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS

Program 2 : Write a program to rearrange string as per below example.
String input = "TeCHNoc33r44editS";
output : 14eocreditTCHNS*/

package onkar;

public class ProgramTest1 {
	
	String getOutput (String input) {
		String digitOutput = "";
		String smallLetters = "";
		String capitalLetters = "";
		
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digitOutput = digitOutput + ch;
			} else if (Character.isLowerCase(ch)) {
				smallLetters = smallLetters + ch;
			} else if (Character.isUpperCase(ch)) {
				capitalLetters = capitalLetters + ch;
			}
		}
		String output = digitOutput + smallLetters + capitalLetters;
		return output;
	}
	
	String getOutput1 (String input) {
		int digitSum = 0;
		String smallLetters = "";
		String capitalLetters = "";
		
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digitSum = digitSum + Character.getNumericValue(ch);
			} else if (Character.isLowerCase(ch)) {
				smallLetters = smallLetters + ch;
			} else if (Character.isUpperCase(ch)) {
				capitalLetters = capitalLetters + ch;
			}
		}
		String output = digitSum + smallLetters + capitalLetters;
		return output;
	}
	
	public static void main(String[] args) {
		ProgramTest1 test = new ProgramTest1();
		System.out.println(test.getOutput("TeCHNoc33r44editS"));
		System.out.println(test.getOutput1("TeCHNoc33r44editS"));
	}
}
