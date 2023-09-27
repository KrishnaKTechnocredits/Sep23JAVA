/*Assignment-33 : 26th Sep'2023
Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54*/

package jaykumar;

public class Assignment33 {

	void sumEvenNum(int[] input) {
		int sum = 0;
		for(int index=0; index<input.length; index++) {
			int i = input[index];
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Assignment33 assignment33 = new Assignment33();
		int[] input = {10,11,44,33,23};
		assignment33.sumEvenNum(input);
	}
}
