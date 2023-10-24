/*Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89*/

package mohit;

public class Assignment_49 {
	void printDiff(int[] age) {
		int maxAge = age[0];
		int minAge = age[0];

		for (int index = 0; index < age.length; index++) {

			if (age[index] > maxAge) {
				maxAge = age[index];
			} else if (age[index] < minAge) {
				minAge = age[index];
			}
		}
		System.out.println("The output is " + (maxAge - minAge));
	}

	public static void main(String[] args) {
		int[] age = { 13, 45, 2, 48, 89, 91 };
		Assignment_49 assignment_49 = new Assignment_49();
		assignment_49.printDiff(age);
	}
}
