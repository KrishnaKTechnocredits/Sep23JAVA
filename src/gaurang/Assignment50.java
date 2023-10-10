/*Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89*/

package gaurang;

public class Assignment50 {

	void findSec(int[] input) {
		int max = 0 ;
		int maxIndex = 0;
		int mmax = 0;
		for(int index=0 ; index<input.length ; index++) {
			int x = input[index];
			if(x>max) {
				max = x;
				maxIndex=index;
			}
		}
		for(int index=0 ; index<input.length ; index++) {
			int x = input[index];
			input[maxIndex]=0;
			if(x>mmax) {
				mmax = x;
			}
		}
		System.out.println("Second highest in given array is "+mmax);
	}
	
	public static void main(String[] args) {
		Assignment50 a = new Assignment50();
		int[] age = {13,45,2,48,89,11,19,91};
		a.findSec(age);
	}
}
