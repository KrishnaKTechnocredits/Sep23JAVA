/*Assignment - 50 : 8th Oct'2023
Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89*/

package rahul;

public class Assignment50_1 {

	void findSecondMax(int[] array) {
		int max = array[0];
		int secondMax = 0;
		for (int index = 0; index < array.length; index++) {
			if (max < array[index]) {
				secondMax = max;
				max = array[index];
			}
		}
		System.out.println(secondMax);
	}

	public static void main(String[] args) {
		Assignment50_1 assignment50_1 = new Assignment50_1();
		int array[] = { 13, 45, 2, 48, 89, 11, 19, 91 };
		assignment50_1.findSecondMax(array);
	}
}
