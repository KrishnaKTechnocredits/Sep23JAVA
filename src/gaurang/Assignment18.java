/*On user defined range print sum and average of numbers which is divisible by 5 & 7.
Hint : pass start and end index as a parameter.*/

package gaurang;

public class Assignment18 {

	void sumAvg(int start, int end) {
		int sum = 0;
		int count = 0;
		for(int index = start; index<end ; index++) {
			if (index%5==0 && index%7==0) {
				sum = sum + index;
				count++; 
			}
		}
		int avg = sum/count;
		System.out.println("Sum and Average of requird numbers are "+sum+" "+avg);
	}
	
	public static void main(String[] args) {
		Assignment18 a =new Assignment18();
		a.sumAvg(1,110);
	}
}
