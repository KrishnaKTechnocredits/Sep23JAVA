/*Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54*/

package onkar;

public class Assignment33 {
	
	void printSum(int[] arr) {
		int sum = 0;
		for (int index=0; index<arr.length; index++) {
			if (arr[index]%2 == 0)
				sum += arr[index];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Assignment33 assignment33 = new Assignment33();
		int[] input = {10,11,44,33,23};
		assignment33.printSum(input);
	}
}
