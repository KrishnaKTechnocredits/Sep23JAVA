/*Assignment - 49 : 8th Oct'2023
Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89 */
package shrutika;

public class As49ArrDiffYoungOld {

	void ageDiff(int[] input) {
		int diff = 0;
		int maxNum = 0;
		int minNum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < input.length - 1) {
				maxNum = input[index];
			} else {
				minNum = input[index];
			}
		}
		if (maxNum > minNum) {
			diff = maxNum - minNum;
		} else
			diff = minNum - maxNum;
		System.out.println(diff);
	}

	public static void main(String[] args) {
		int[] input = { 13, 45, 2, 48, 89, 91 };
		new As49ArrDiffYoungOld().ageDiff(input);
	}
}
