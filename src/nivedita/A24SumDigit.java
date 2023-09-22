/*
Assignment 24 - 16 sep 2023

Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13

Hint : Character.getNumericValue(str.charAt(index)); '7' -> 7
*/

package nivedita;

public class A24SumDigit {

	static int sum =0;
	public static void main(String[] args) {
		String input = "Rah5uiTEC6Hnoc2reditS";
			System.out.println("Sum of all digits := ");
		    System.out.println("Input : " +input);
				for(int index=0;index<input.length();index++) {
					if(Character.isDigit(input.charAt(index))) {
						sum = sum + Character.getNumericValue(input.charAt(index));
					}		
			}
			System.out.println("Output : " + sum);
	}
}