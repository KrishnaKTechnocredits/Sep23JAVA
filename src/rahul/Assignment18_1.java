/*Assignment-18 : 8th Sep'2023

On user defined range print sum and average of numbers which is divisible by 5 & 7.
Hint : pass start and end index as a parameter.
Input : Range -> 1 to 110
Output : Numbers are,
                35
				70
                105
		 Found 3 numbers which are divible by 5 & 7.
		 sum = 210
		 Avearge = 70*/

package rahul;

public class Assignment18_1 {

	void div5And7(int startRange, int endRange) {
		int sum = 0;
		int avg = 0;
		System.out.println("Numbers are: ");
		for (int index = startRange; index <= endRange; index++) {
			if (index % 5 == 0 && index % 7 == 0) {
				System.out.println(index);
				sum = sum + index;
			}
		}
		System.out.println("Sum is: " + sum);
		avg = sum / 3;
		System.out.println("Average is: " + avg);
	}

	public static void main(String[] args) {
		Assignment18_1 assignment18_1 = new Assignment18_1();
		assignment18_1.div5And7(1, 110);
	}
}
