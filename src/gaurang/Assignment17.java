/* On user defined range print second last, third last, forth last number which is divisible by 2 & 3.
Hint : pass start and end index as a parameter.*/

package gaurang;

public class Assignment17 {

	void printValue(int start, int end) {
		int count = 0;
		for(int index = end; index>start ; index --) {
			if(index%2==0 && index%3==0) {
				count++;
				if(count>1 && count<5) {
					System.out.println("Output of given range is "+index);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment17 a = new Assignment17();
		a.printValue(10,100);
	}
}
