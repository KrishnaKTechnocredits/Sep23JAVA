/*Assignment-17 : 8th Sep'2023

On user defined range print second last, third last, forth last number which is divisible by 2 & 3.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 100
Output : 90
              84		 
	      78*/

package mohit;

public class Assignment_17 {
	void secondThirdFourthLastNum(int startIndex, int endIndex) {
		int count = 0;
		for (int num = endIndex; num >= startIndex; num--) {
			if (num % 2 == 0 && num % 3 == 0) {
				count++;
				if (count >= 2 && count <= 4)
					System.out.println(num);

			}
		}

	}

	public static void main(String[] args) {
		Assignment_17 assignment_17 = new Assignment_17();
		assignment_17.secondThirdFourthLastNum(10, 100);
	}
}
