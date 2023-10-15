/*Assignment - 50 : 8th Oct'2023
Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89*/

package jyoti_Array;

public class Assignment50 {
	int temp;
	

	void secondHighNum(int[] input) {

		for (int index = 0; index < input.length; index++)

		{

			for (int innerindex = index + 1; innerindex < input.length; innerindex++) {
				if (input[index] > input[innerindex]) {
					temp = input[index];
					input[index] = input[innerindex];
					input[innerindex] = temp;

				}
			}
		}

	}

	public static void main(String[] args) {
		int[] data = new int[8];
		int[] num = { 13, 45, 2, 48, 89, 11, 19, 91 };
		Assignment50 ass = new Assignment50();
		ass.secondHighNum(num);
		System.out.println("second max from given array-->" + num[data.length - 2]);
	}

}
