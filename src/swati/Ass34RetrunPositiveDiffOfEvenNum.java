/*26th Sep'2023 Return positive difference of sum of all the even numbers and odd numbers from given array. 
input : {10,3,44,33,35} output : 17*/

package swati;

public class Ass34RetrunPositiveDiffOfEvenNum {

	void getSumOfNumbers(int[] arr) {
		int evensum = 0;
		int oddsum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				evensum += arr[index];
			} else {
				oddsum += arr[index];
			}
		}
		if (evensum > oddsum) {
			System.out.println("Sum is-> " + (evensum - oddsum));
		} else
			System.out.println("Sum is-> " + (oddsum - evensum));
	}

	public static void main(String[] args) {
		int[] input = { 10, 3, 44, 33, 35 };
		Ass34RetrunPositiveDiffOfEvenNum ass34RetrunPositiveDiffOfEvenNum = new Ass34RetrunPositiveDiffOfEvenNum();
		ass34RetrunPositiveDiffOfEvenNum.getSumOfNumbers(input);
	}
}
