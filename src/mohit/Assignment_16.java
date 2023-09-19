/*Assignment - 16 : 7th Sep'2023		 
On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
         12
         24
         36	*/
package mohit;

public class Assignment_16 {
	int count;

	void firstThreeNumbers(int startIndex, int endIndex) {
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 3 == 0 & num % 4 == 0) {
				System.out.println(num);
				count++;
				if (count == 3)
					break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment_16 assignment_16 = new Assignment_16();
		assignment_16.firstThreeNumbers(10, 500);
	}
}
