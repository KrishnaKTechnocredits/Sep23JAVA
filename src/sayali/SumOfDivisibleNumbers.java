/* WAP on user defined range print sum of all the number which is divisible by 5 & 10.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 50
Output : Expected sum is 150 */

package sayali;

class SumOfDivisibleNumbers{
	
	void processData(int startRange, int endRange){
		int sum=0;
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0 && num%10==0){
				num = num + 1;
			}
		}		
		System.out.println("Expected sum is: " + sum);
	}
	
	public static void main(String[] args){
		SumOfDivisibleNumbers sumOfDivisibleNumbers = new SumOfDivisibleNumbers();
		sumOfDivisibleNumbers.processData(10,50);		
	}
}