/*Assignment - 49 : 8th Oct'2023 Find the difference between age of youngest
 *  and eldest family member. int[] 
age = {13,45,2,48,89,91};
 output : (91-2) 89 */

package swati;

public class Ass49FindTheDiff {

	void findDiff(int[] input) {
		int maxnum = 0;
		int minnum = maxnum;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > maxnum) {
				maxnum = input[index];
			} else if (input[index] < maxnum) {
				minnum = input[index];
			}
		}
		System.out.println(maxnum - minnum);
	}

	public static void main(String[] args) {
		int[] age = { 13, 45, 2, 48, 89, 91 };
		new Ass49FindTheDiff().findDiff(age);
	}
}