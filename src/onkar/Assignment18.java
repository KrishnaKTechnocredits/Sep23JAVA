/*On user defined range print sum and average of numbers which is divisible by 5 & 7.
Hint : pass start and end index as a parameter.
Input : Range -> 1 to 110
Output : Numbers are,
                35
                70
                105
                Found 3 numbers which are divible by 5 & 7.
                sum = 210
                Avearge = 70*/
		 
package onkar;

public class Assignment18 {
	
	int sum=0;
	int count=0;
	
	void printSum(int startRange, int endRange) {
		for (int index=startRange; index<=endRange; index++) {
			if (index%5==0 && index%7==0) {
				System.out.println(index);
				sum=sum+index;
				count++;
			}
		}
		System.out.println("Sum = "+sum);
	}
	
	void printAverage() {
		int average = sum/count;
		System.out.println("Avearge = "+average);
	}
	
	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.printSum(1, 110);
		assignment18.printAverage();
	}
}
