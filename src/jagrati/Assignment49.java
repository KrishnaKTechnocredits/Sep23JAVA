/*
 Assignment - 49 : 8th Oct'2023
Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89
 */
package jagrati;

public class Assignment49 {

	void familyMember(int[] input) {
		int maxAge = input[0];
		int minAge = input[0];
		int diff = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > maxAge) {
				maxAge = input[index];
			} else if (input[index] < minAge) {
				minAge = input[index];
			}
		}
		diff = maxAge - minAge;
		System.out.println(" yongest family member age is " + minAge + " and eldest family member age is " + maxAge + " difference between age of " + diff);
	}
	
	public static void main(String[] args) {
		int[] age = { 13, 45, 2, 48, 89, 91 };
		Assignment49 assign = new Assignment49();
		assign.familyMember(age);
	}
}
