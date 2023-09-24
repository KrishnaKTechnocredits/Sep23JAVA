/*
Assignment-32 : 23nd Sep'2023 
Write a method to print number of Uppercase,lowercase and digits in the input using ascii.

input : "TeCHNoc33r44editS";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 4
		 
*/

package roshani;

public class Assignment32{
	void printNumbersInString(String input){
		
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		for(int index = 0; index < input.length() ; index++){
			char ch = input.charAt(index);
			if(ch >= 65 && ch <= 90){
				upperCount++; 
			}else if(ch >= 97 && ch <= 122){
				lowerCount++;
			}else if (ch >= 48 && ch <= 57){
				digitCount++;
			}
		}
		System.out.println("\nString '" +input +"' is having: \nUppercase Letters- " + upperCount + "\nLowercase Letters- "+ lowerCount + "\nDigits- "+digitCount);
	}
	
	public static void main(String[] args){
		Assignment32 assignment32 = new Assignment32();
		assignment32.printNumbersInString("TeCHNoc33r44editS");
	}
}