/*Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17*/

package onkar;

public class Assignment34 {
	
	int getDifference (int[] arr) {
		int diff = 0;
		int evenSum = 0;
		int oddSum = 0;
		for (int index=0; index<arr.length; index++) {
			if (arr[index]%2 == 0)
				evenSum += arr[index];
			else
				oddSum += arr[index];
		}
		if (evenSum >= oddSum)
			diff = evenSum - oddSum;
		else 
			diff = oddSum - evenSum;
		return diff;
	}
	
	public static void main(String[] args) {
		Assignment34 assignment34 = new Assignment34();
		int[] input = {10,3,44,33,35};
		int output = assignment34.getDifference(input);
		System.out.println(output);
	}
}
