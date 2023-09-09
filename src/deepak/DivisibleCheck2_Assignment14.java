/*Assignment - 14 : 7th Sep'2023		 
On user defined range print last number which is divisible by 5 & 9.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 100
Output : Last number divisible by 5 & 9 is 90
*/
package deepak;
class DivisibleCheck2_Assignment14{
	void divisibleTest(int startIndex, int endIndex){
		for(int index = endIndex ; index >= startIndex ; index--){
			if(index % 5 == 0 && index % 9 == 0){
				System.out.println("Last number divisible by 5 & 9 is "+index);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		DivisibleCheck2_Assignment14 divisible = new DivisibleCheck2_Assignment14();
		divisible.divisibleTest(5, 100);
	}
}