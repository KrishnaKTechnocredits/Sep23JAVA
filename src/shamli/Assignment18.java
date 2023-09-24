/*
 * On user defined range print sum and average of numbers which is divisible by 5 & 7.
Hint : pass start and end index as a parameter.
Input : Range -> 1 to 110
Output : Numbers are,
                35
	   			70
                105
		 Found 3 numbers which are divisible by 5 & 7.
		 sum = 210
		 Average = 70
 */


package shamli;

public class Assignment18 {
	
	void sumAndAvgOfnumDivisibleByGivenNum(int startIndex,int endIndex) {
		int sum=0;
		int avg=0;
		int count=0;
		for(int i=startIndex;i<=endIndex;i++)
		{
			if(i%5==0 &&i%7==0) {
				sum=sum+i;
				count++;	
			}	
		}
		avg=sum/count;
		System.out.println("Sum of all the numbers divisible by 5 and 7 from range is "+sum);
		System.out.println("Average of all the numbers divisible by 5 and 7 from range is "+avg);
	}

	public static void main(String[] args) {
		Assignment18 assignment18=new Assignment18();
		assignment18.sumAndAvgOfnumDivisibleByGivenNum(1, 110);
	}

}
