/*
Assignment - 24 : 16th Sep'2023
Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13
Hint : Character.getNumericValue(str.charAt(index)); '7' -> 7
*/

package jagrati;

public class Assignment24 {
	
	void sumOfDigit(String input) {
		int sum=0;
		for(int index =0; index< input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				int value = Character.getNumericValue(input.charAt(index));
				sum = sum + value;
			}
		}System.out.println("sum of all the digits within given input is = " + sum);
	}
	public static void main(String[] args) {
		Assignment24 assign24 = new Assignment24();
		assign24.sumOfDigit("Rah5ulTEC6Hnoc2redItS");
		
	}

}
