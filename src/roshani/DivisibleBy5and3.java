/*Assignment - 12 : 7th Sep'2023

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
		 15
		 30
*/
package roshani;

class DivisibleBy5and3{
	
	void processData(int startIndex,int endIndex){
		
		System.out.println("\nIn the range of " + startIndex + " to " + endIndex + ", numbers that are divisible by 5 and 3 are:");
		for(int num=startIndex; num <= endIndex; num++){
			if(num%5 == 0 && num%3 == 0){
				System.out.println(num);
			}
		}	
	}
	
	public static void main(String[] args){
		DivisibleBy5and3 divisibleby5and3 = new DivisibleBy5and3();
		divisibleby5and3.processData(5,40);
	}
}