/*Assignment - 13 : 7th Sep'2023		 
On user defined range print all numbers which are divisible by 7 or 13 in reverse order.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 39 is divisible by 13
		 35 is divisible by 7
		 28 is divisible by 7
		 26 is divisible by 13
		 21 is divisible by 7
		 14 is divisible by 7
		 13 is divisible by 13
		 7 is divisible by 7
*/
package deepak;
class DivisibleCheck1_Assignment13{
	void divisibleTest(int startIndex, int endIndex){
		for(int index = endIndex ; index >=startIndex ; index--){
			if(index % 7 == 0)
				System.out.println(index+" is divisible by 7");
			else if(index % 13 == 0)
				System.out.println(index+" is divisible by 13");
		}
	}
	
	public static void main(String[] args){
		DivisibleCheck1_Assignment13 divisible =  new DivisibleCheck1_Assignment13();
		divisible.divisibleTest(5, 40);
	}
}