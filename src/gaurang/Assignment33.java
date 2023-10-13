/*Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54*/

package gaurang;

public class Assignment33 {

	int getSum(int[] input) {
		int sum = 0;
		for(int index = 0 ; index<input.length ; index++) {
			int x = input[index];
			if(x%2==0) {
				sum += x;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment33 a = new Assignment33();
		int[] input = {10,11,44,33,23};
		int x = a.getSum(input);
		System.out.println(x);
	}
}
