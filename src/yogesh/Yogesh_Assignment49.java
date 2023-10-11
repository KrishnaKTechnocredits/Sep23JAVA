//Assignment - 49 : 8th Oct'2023
//Find the difference between age of yongest and eldest family member.
//int[] age = {13,45,2,48,89,91};
//output : (91-2) 89
package yogesh;

public class Yogesh_Assignment49 {
	int max;

	void diffAge(int[] input) {
		int min=input[0];
		for (int index = 0; index < input.length; index++) {
			int temp = input[index];
			if (temp > min) {
				max = temp;
			} else {
				min = temp;
			}
		}
		System.out.println("Maximum num is:-->" + max);
		System.out.println("Minimum num is:-->" + min);
		System.out.println("Didderence is :-->" + max + -+min + "=" + (max - min));
	}

	public static void main(String[] args) {
		int[] input = { 13, 45, 2, 48, 89, 91 };
		Yogesh_Assignment49 assignment49 = new Yogesh_Assignment49();
		assignment49.diffAge(input);

	}
}
