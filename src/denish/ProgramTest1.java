package denish;

public class ProgramTest1 {
	
	String getOutput(String input) {
		String digitOutput = "";
		String smallLetter = "";
		String capitalLetter = "";
		
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				digitOutput = digitOutput + ch;
			}else if(Character.isLowerCase(ch)) {
				smallLetter = smallLetter + ch;
			}else if(Character.isUpperCase(ch)) {
				capitalLetter = capitalLetter + ch;
			}
		}
		String output = digitOutput + smallLetter + capitalLetter;
		return output;
	}
	
	String getOutput1(String input) {
		int digitSum = 0;
		String smallLetter = "";
		String capitalLetter = "";
		
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				digitSum = digitSum + Character.getNumericValue(ch);
			}else if(Character.isLowerCase(ch)) {
				smallLetter = smallLetter + ch;
			}else if(Character.isUpperCase(ch)) {
				capitalLetter = capitalLetter + ch;
			}
		}
		String output = digitSum + smallLetter + capitalLetter;
		return output;
	}
	
	public static void main(String[] args) {
		ProgramTest1 programTest1 = new ProgramTest1();
		System.out.println(programTest1.getOutput("TeCHNoc33r44editS"));
		System.out.println(programTest1.getOutput1("TeCHNoc33r44editS"));
	}
}
