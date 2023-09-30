/*Assignment-33 : 26th Sep'2023
Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54
 */

package jagrati;

public class Assignment33 {
	void array(int [] input) {
		int sum =0;
		for(int index =0; index < input.length; index++) {
			if(input[index]%2 == 0) {
				sum = sum + input[index];
			}
		}System.out.println("Sum of all the even numbers from given array = " + sum);
	}
	public static void main(String[] args) {
		int[] num = {10,11,44,33,23};
		Assignment33 assign = new Assignment33();
		assign.array(num);
	}
}
