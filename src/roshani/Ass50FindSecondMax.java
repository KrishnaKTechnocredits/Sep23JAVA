/*Assignment - 50 : 8th Oct'2023
Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89
*/
package roshani;

public class Ass50FindSecondMax {

	int maxAge = 0;
	int secondMax = 0;

	void findSecondMax(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] > maxAge) {
				secondMax = maxAge;
				maxAge = input[index];
			}
		}
		System.out.println("Second max from given array is: "+ secondMax);
	}

	public static void main(String[] args) {
		int[] age = { 13, 45, 2, 48, 89, 11, 19, 91 };
		new Ass50FindSecondMax().findSecondMax(age);
	}
}