/*Assignment - 49 : 8th Oct'2023
Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89
*/

package jyoti_Array;

public class Assignment49 {

	int max;

	void differenceInAge(int[] input) {
		int min = input[0];
		for (int index = 0; index < input.length; index++) {
			int temp = input[index];
			if (temp > min) {
				max = temp;
			} else {
				min = temp;
			}
		}
		System.out.println("Maximum age is:-->" + max);
		System.out.println("Minimum age is:-->" + min);
		System.out.println(
				"difference between age of yongest and eldest family member :-->" + max + -+min + "=" + (max - min));
	}

	public static void main(String[] arg) {
		int[] age = { 13, 45, 2, 48, 89, 91 };

		Assignment49 ass49 = new Assignment49();
		ass49.differenceInAge(age);

	}
}
