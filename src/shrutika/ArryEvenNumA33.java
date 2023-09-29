/*Assignment-33 : 26th Sep'2023
Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54 */
package shrutika;

public class ArryEvenNumA33 {

	void evenNum(int[] arrInput) {
		int sum = 0;
		for (int index = 0; index < arrInput.length; index++) {
			if (arrInput[index] % 2 == 0) {
				sum = sum + arrInput[index];
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[] input = { 10, 11, 44, 33, 23 };
		ArryEvenNumA33 arryEvenNumA33 = new ArryEvenNumA33();
		arryEvenNumA33.evenNum(input);
	}
}
