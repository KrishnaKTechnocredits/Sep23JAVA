/* Assignment 50
Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89*/

package nivedita;

public class A50FindSecondMax {
	int maxNum (int[] arr) {
		int maxNum = arr[0];
		for (int index=0; index<arr.length; index++) {
			if (arr[index] > maxNum)
				maxNum = arr[index];
		}
		return maxNum;
	}
	
	void findSecondHighestNum (int[] arr) {
		int maxNum = maxNum (arr);
		int minDiff = maxNum;
		int secondHighestNum = arr[0];
		for (int index=0; index<arr.length; index++) {
			int diff = maxNum - arr[index];
			if (diff < minDiff && diff != 0) {
				minDiff = diff;
				secondHighestNum = arr[index];
			}
		}
		System.out.println("Second highest number from the given array is : "+secondHighestNum);
	}
	
	public static void main(String[] args) {
		int[] age = {13,45,2,48,89,11,19,91};
		new A50FindSecondMax().findSecondHighestNum(age);
	}
}
