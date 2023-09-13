/*Assignment-17 : 8th Sep'2023

On user defined range print second last, third last, forth last number which is divisible by 2 & 3.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 100
Output : 90
         84
	     78*/

package rahul;

public class Assignment17_1 {

	void div2And3(int startRange, int endRange) {
		int count = 0;
		System.out.println("Second last, third last, forth last numbers are: ");
		for (int index = endRange; index >= startRange; index--) {
			if (index % 2 == 0 && index % 3 == 0) {
				count++;
				if (count >= 2 && count <= 4) {
					System.out.println(index);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment17_1 assignment17_1 = new Assignment17_1();
		assignment17_1.div2And3(10, 100);
	}
}
