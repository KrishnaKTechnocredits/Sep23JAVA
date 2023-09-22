/*
 * On user defined range print last number which is divisible by 5 & 9.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 100
Output : Last number divisible by 5 & 9 is 90
 */

package shamli;

public class Assignment15 {

	void lastNumDivisibleInrange(int startIndex, int endIndex) {
		for(int i=endIndex;i>startIndex;i--) {
			if(i%5==0 && i%9==0) {
				System.out.println("Last number divisible by 5 & 9 is "+i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		assignment15.lastNumDivisibleInrange(5, 100);

	}

}
