/*Assignment - 24 : 16th Sep'2023

Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13

Hint : Character.getNumericValue(str.charAt(index)); '7' -> 7
*/

package roshani;

public class Assignment24 {
	
	void sumOfDigitsInGivenString(String str) {
		int sum = 0;
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("\nSum of all the digits in string '"+str+"' is : "+sum);
	}
	
	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		assignment24.sumOfDigitsInGivenString("Rah5ulTEC6Hnoc2redItS");
	}
}
