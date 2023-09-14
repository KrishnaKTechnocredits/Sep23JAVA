/*On user defined range print second last, third last, forth last number which is divisible by 2 & 3.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 100
Output : 90
         84		 
	     78*/

package onkar;

public class Assignment17 {
	
	void printNumbers (int startRange, int endRange) {
		int count=0;
		for (int index=endRange; index>=startRange; index--) {
			if (index%2==0 && index%3==0) {
				count++;
				if (count>=2 && count<5)
					System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.printNumbers(10, 100);
	}
}
