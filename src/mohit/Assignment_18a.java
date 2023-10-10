/*/*On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 7:
			12
			24
			36
              */

package mohit;

public class Assignment_18a {
	void sumOfDivBy5And7(int startIndex, int endIndex) {
		int count = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				count++;
				if (count <= 3) {
					System.out.println(num);
				}
			}

		}
	}

	public static void main(String[] args) {
		Assignment_18a assignment_18a = new Assignment_18a();
		System.out.println("First 3 numbers divisible by 3 and 7 : ");
		assignment_18a.sumOfDivBy5And7(10, 500);

	}

}
