/*Assignment - 16 : 7th Sep'2023		 
On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
         12
         24
         36	
*/

package deepak;

public class Assignment16_DivisibleCheck3 {
	void divisibleTest(int startIndex, int endIndex) {
		int count = 0;
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 3 == 0 && index % 4 == 0) {
				count++;
				System.out.println(index);
				if (count == 3)
					break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment16_DivisibleCheck3 divisible = new Assignment16_DivisibleCheck3();
		divisible.divisibleTest(10, 500);
	}
}
