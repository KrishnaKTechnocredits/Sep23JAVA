/*Assignment - 50 : 8th Oct'2023 Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89
*/
package swati;

public class Ass50FindSecondMax {

	void findSecondMaxNum(int[] input) {
		int maxnum = 0;
		int secondmaxnum = 0;
		
		for(int index=0;index<input.length;index++) {
			if(input[index]>maxnum) {
				secondmaxnum = maxnum;				
				maxnum = input[index];
			}
		}
		System.out.println("Second max number from given array is -> "+secondmaxnum);
	}

	public static void main(String[] args) {
		int[] age = { 13, 45, 2, 48, 89, 11, 19, 91 };
		new Ass50FindSecondMax().findSecondMaxNum(age);
	}
}
