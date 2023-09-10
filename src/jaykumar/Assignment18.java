/*On user defined range print sum and average of numbers which is divisible by 5 & 7.
Hint : pass start and end index as a parameter.
Input : Range -> 1 to 110
Output : Numbers are,
         35
		 70
         105
		 Found 3 numbers which are divible by 5 & 7.
		 sum = 210
		 Average = 70*/

package jaykumar;

public class Assignment18 {
	
	void sumAvg(int startRange, int endRange) {
		int sum=0;
		int avg=0;
		int count=0;
		System.out.println("Numbers are : ");
		for(int index=startRange; index<=endRange; index++) {
			if(index%5==0 && index%7==0) {
				System.out.println(index);
				count++;
				sum=sum+index;
			}
		}
		System.out.println("Found "+count+" numbers which are divisible by 5 & 7");
		System.out.println("Sum : "+sum);
		avg=sum/count;
		System.out.println("Average : "+avg);
	}
	
	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.sumAvg(1,110);
	}
}
