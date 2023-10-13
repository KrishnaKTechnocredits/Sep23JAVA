/*Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17*/

package gaurang;

public class Assignment34 {

	int getDiff(int[] input) {
		int even = 0;
		int odd = 0;
		int total = 0;
		for(int index=0 ; index<input.length ; index++) {
			int x = input[index];
			if(x%2==0) {
				even += x;
			}
			else {
				odd += x;
			}
		}
		if(even>=odd) {
			total = even - odd;
		}
		else {
			total = odd - even;
		}
		return total;
	}
	
	public static void main(String[] args) {
		Assignment34 a = new Assignment34();
		int[] input = {10,3,44,33,35};
		int diff = a.getDiff(input);
		System.out.println(diff);
	}
}
