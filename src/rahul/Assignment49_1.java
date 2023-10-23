/*Assignment - 49 : 8th Oct'2023
Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89*/

package rahul;

public class Assignment49_1 {

	int maxNumber(int[] array) {
		int max = array[0];
		for (int index = 1; index < array.length; index++) {
			if (max < array[index]) {
				max = array[index];
			}
		}
		return max;
	}

	int minNumber(int[] array) {
		int min = array[0];
		for (int index = 1; index < array.length; index++) {
			if (min > array[index]) {
				min = array[index];
			}
		}
		return min;
	}

	void findDifferene(int max, int min) {
		int differenceNumber = max - min;
		System.out.println("Difference is: " + differenceNumber);
	}

	public static void main(String[] args) {
		Assignment49_1 assignment49_1 = new Assignment49_1();
		int[] array = { 13, 45, 2, 48, 89, 91 };
		int max = assignment49_1.maxNumber(array);
		int min = assignment49_1.minNumber(array);
		assignment49_1.findDifferene(max, min);
	}
}
