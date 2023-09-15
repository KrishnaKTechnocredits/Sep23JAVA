/*Assignment - 15 : 7th Sep'2023		 
On user defined range print sum of all the number which is divisible by 5 & 10.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 50
Output : Expected sum is 150*/

package rahul;

public class Assignment15_1 {

	void div5And10_Sum(int startRange, int endRange) {
		int sum = 0;
		for (int index = startRange; index <= endRange; index++) {
			if (index % 5 == 0 && index % 10 == 0) {
				sum = sum + index;
			}
		}
		System.out.println("Sum is: " + sum);
	}

	public static void main(String[] args) {
		Assignment15_1 assignment15_1 = new Assignment15_1();
		assignment15_1.div5And10_Sum(10, 50);
	}
}
