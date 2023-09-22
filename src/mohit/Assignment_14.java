/*Assignment - 14 : 7th Sep'2023		 
On user defined range print last number which is divisible by 5 & 9.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 100
Output : Last number divisible by 5 & 9 is 90
*/
package mohit;

public class Assignment_14 {

	void lastNumber(int startIndex, int endIndex) {
		for (int num = endIndex; num >= startIndex; num--) {
			if (num % 5 == 0 & num % 9 == 0) {
				System.out.println("The last number divisible by 5 and 9 is : " + num);
				break;
			}

		}
	}

	public static void main(String[] args) {
		Assignment_14 assignment_14 = new Assignment_14();
		assignment_14.lastNumber(5, 100);
	}

}
