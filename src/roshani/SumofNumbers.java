/*Assignment - 15 : 7th Sep'2023		 
On user defined range print sum of all the number which is divisible by 5 & 10.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 50
Output : Expected sum is 150
*/
package roshani;

class SumofNumbers{
	
	void numberCheck(int startIndex, int endIndex){
		int sum = 0;
		for(int num = startIndex ; num <= endIndex ; num++){
			if(num%5 == 0 && num%10 == 0){
				sum = sum + num;
			}
		}
		System.out.println("\nIn the range " +startIndex + " to " + endIndex + " , sum of all the numbers which are divisible by 5 is : "+ sum);
	}
	
	public static void main(String[] args){
		SumofNumbers sumofnumbers = new SumofNumbers();
		sumofnumbers.numberCheck(10,50);
		
	}
}
