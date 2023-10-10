/* Assignment - 49 : 8th Oct'2023
Find the difference between age of youngest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89 */

package sayali;

public class Assignment49 {

	void ageDifference(int[] input) {
		int yAge = input[0];
		int elAge = 0;

		for (int index = 0; index < input.length; index++) {
			int i = input[index];
			if (i > yAge) {
				elAge = i;
			}
			if (i < elAge) {
				yAge = i;
			}
		}
		int sum = elAge - yAge;
		System.out.println("Difference between age of yongest and eldest family member is: " + sum);
	}

	public static void main(String[] args) {
		Assignment49 assignment49 = new Assignment49();
		int[] age = { 13, 45, 2, 48, 89, 91 };
		assignment49.ageDifference(age);
	}
}