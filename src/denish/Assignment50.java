/*Assignment - 50 : 8th Oct'2023
Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89*/

package denish;

public class Assignment50 {
	
	void secondMaxNum(int[] input) {
		int maxnum = 0;
		int secondmax = 0;
		
		for(int index=0; index<input.length; index++) {
			int x = input[index];
			if(x>maxnum) {
				secondmax = maxnum;
				maxnum = x;
			}
		}
		System.out.println(secondmax);
	}
	
	public static void main(String[] args) {
		int[] age = {13,45,2,48,89,11,19,91};
		Assignment50 assignment50 = new Assignment50();
		assignment50.secondMaxNum(age);
	}
}
