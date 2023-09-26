/*
 * Assignment-34 :  26th Sep'2023
Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17
 */

package shamli.array;

public class Assignment34 {

	int positiveDiffOfAllEvenAndOddNumbers(int arr[]) {
		int diff=0;
		int evenSum=0;
		int oddSum=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]%2==0) {
				evenSum=evenSum +arr[index];
			}else if(arr[index]%2!=0) {
				oddSum=oddSum+arr[index];
			}
		}
		if(evenSum>oddSum) {
			diff=evenSum-oddSum;
			System.out.println("Difference of all the even and odd  numbers from array is :"+diff);
		}else {
			diff=oddSum-evenSum;
			System.out.println("Difference of all the even and odd  numbers from array is :"+diff);
		}
	
		return diff;
	}
	
	public static void main(String[] args) {
		Assignment34 assignment34=new Assignment34();
		int input[]=  {10,3,44,33,35};
		assignment34.positiveDiffOfAllEvenAndOddNumbers(input);
	}
}
