/* Assignment - 24 : 16th Sep'2023
Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13

Hint : Character.getNumericValue(str.charAt(index)); '7' -> 7
*/
package jyoti;
class CountStringCasesNSum{
	int dCount=0;
	int sum=0;
	
	void stringCheck(String input){
		System.out.println("Digits are :");		
		for (int index=0;index<input.length();index++){
			if(Character.isDigit(input.charAt(index))){
				dCount++;
				sum=sum+(Character.getNumericValue(input.charAt(index)));
				System.out.println(Character.getNumericValue(input.charAt(index)));
				}
			}
			System.out.println("*****************************************");
			System.out.println("Sum of all digit in given string is: "+sum);
		}

	public static void main(String[] args){
	CountStringCasesNSum	strcs = new CountStringCasesNSum();
	strcs.stringCheck("Rah5ulTEC6Hnoc2redItS");
		
	}
}

