/*
 * On user defined range print sum of all the number which is divisible by 5 & 10.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 50
Output : Expected sum is 150
 */

package shamli;

public class Assignment16 {

	void sumOfNumDivisibleByGivenNum(int startIndex,int endIndex) {
		int sum=0;
		for(int i=startIndex;i<=endIndex;i++) {
			if(i%5==0 && i%10==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of all numbers divisible by 5 and 10 is "+sum);
	}
	public static void main(String[] args) {
		Assignment16 assignment16= new Assignment16();
		assignment16.sumOfNumDivisibleByGivenNum(10, 50);
	}

}
