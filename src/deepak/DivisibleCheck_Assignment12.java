/*Assignment - 12 : 7th Sep'2023

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
		 15
		 30
*/
package deepak;
class DivisibleCheck_Assignment12{
	void divisibleTest(int startIndex, int endIndex){
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int index = startIndex ; index <= endIndex ; index++){
			if(index % 5 == 0 && index % 3 ==0)
				System.out.println(index);
		}
	}
	
	public static void main(String[] args){
		DivisibleCheck_Assignment12 divisible = new DivisibleCheck_Assignment12();
		divisible.divisibleTest(5, 40);
	}
}