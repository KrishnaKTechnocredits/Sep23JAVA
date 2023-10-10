/*Assignment - 49 : 8th Oct'2023
Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89*/
package denish;

public class Assignment49 {

	void difference(int[] input) {
		int young = input[0];
		int old = 0;

		for (int index = 0; index < input.length; index++) {
			int x = input[index];
			if (x > young) {
				old = x;
			}
			if (x < old) {
				young = x;
			}
		}
		int sum = old - young;
		System.out.println("difference between age of yongest and eldest -> " + sum);
	}

	public static void main(String[] args) {
		Assignment49 assignment49 = new Assignment49();
		int[] age = { 13, 45, 2, 48, 89, 91 };
		assignment49.difference(age);
	}
}
