/*Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13*/

package onkar;

public class Assignment24 {
	
	void printSum(String input) {
		int sum = 0;
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of numbers in String "+input+" is "+sum);
	}
	
	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		assignment24.printSum("Rah5ulTEC6Hnoc2redItS");
	}
}
