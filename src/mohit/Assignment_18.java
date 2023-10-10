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

package mohit;

public class Assignment_18 {
	int sum = 0;
	int count = 0;

	void sumOfDivBy5And7(int startIndex, int endIndex) {

		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				sum = sum + num;
				count++;
			}
		}
		System.out.println("Sum" + " " +  sum);

	}

	void AvgDivBy5And7() {
		int Avg = sum / count;
		System.out.println("Average" + " " + Avg);
	}

	public static void main(String[] args) {
		Assignment_18 assignment_18 = new Assignment_18();
		assignment_18.sumOfDivBy5And7(1, 110);
		assignment_18.AvgDivBy5And7();
	}
}
