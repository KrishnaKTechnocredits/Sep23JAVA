/*Assignment - 15 : 7th Sep'2023		 
On user defined range print sum of all the number which is divisible by 5 & 10.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 50
Output : Expected sum is 150*/

package mohit;

public class Assignment_15 {
	void sumOfNumDivBy5And10(int startIndex, int endIndex){
		int sum=0;
		for(int num=startIndex;num<=endIndex;num++) {
			if(num%5==0 && num%10==0) {
				sum=sum+num;
			}
		}
		System.out.println("Expected sum is " + sum);
	}
		
		
		public static void main(String[] args){
			Assignment_15 assignment_15 = new Assignment_15();
			assignment_15.sumOfNumDivBy5And10(10, 50);
		}
	}


