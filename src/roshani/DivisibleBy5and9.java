/*
Assignment - 14 : 7th Sep'2023		 
On user defined range print last number which is divisible by 5 & 9.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 100
Output : Last number divisible by 5 & 9 is 90
*/
package roshani;

class DivisibleBy5and9{
	
	void numberCheck(int startIndex, int endIndex){
	
		for(int num = endIndex ; num >= startIndex; num--){
			if(num%5 == 0 && num%9 == 0){
				System.out.println("\nIn the range of " + startIndex + " to " + endIndex + " ,Last number divisible by 5 & 9 is: " + num);
				break;
			}
		}
	}	
	
	public static void main(String[] args){
		DivisibleBy5and9 divisibleby5and9 = new DivisibleBy5and9();
		divisibleby5and9.numberCheck(5,100);
	}
}