/*Assignment - 15 : 7th Sep'2023		 
On user defined range print sum of all the number which is divisible by 5 & 10.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 50
Output : Expected sum is 150
*/
package deepak;
class Assignment15_SumDivisibleNumbers{
	void sumDivisibleNum(int startIndex, int endIndex){
		int sum = 0;
		for(int index = startIndex ; index <= endIndex ; index++){
			if(index % 5 == 0 && index % 10 == 0){
				sum = sum + index;
			}
		}
		System.out.println("Sum of numbers divisible by 5 & 10 in the given range is "+sum);
	}
	public static void main(String[] args){
		Assignment15_SumDivisibleNumbers sum = new Assignment15_SumDivisibleNumbers();
		sum.sumDivisibleNum(10, 50);
	}
}
