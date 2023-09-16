/*Assignment - 24 : 16th Sep'2023

Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13

Hint : Character.getNumericValue(str.charAt(index)); '7' -> 7*/

package jaykumar;

public class Assignment24 {
	
	void sumDigits(String input) {
		int sum=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum=sum+num;
			}
		}
		System.out.println("Sum of all digits is: " +sum);
	}
	
	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		assignment24.sumDigits("Rah5ulTEC6Hnoc2redItS");
	}
}
