/*Assignment-34 :  26th Sep'2023
Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17
*/
package jaykumar;

public class Assignment34 {

	int diff(int[] input) {
		int diff = 0;
		int sumEven=0;
		int sumOdd= 0;
		for(int index=0; index<input.length; index++) {
			int i = input[index];
			if(i%2==0) {
				sumEven += i;
			}else {
				sumOdd += i;
			}if(sumEven>sumOdd) {
				diff = sumEven - sumOdd;
			}else {
				diff = sumOdd - sumEven;
			}
		}
		return diff;
	}
	
	public static void main(String[] args) {
		Assignment34 assignment34 = new Assignment34();
		int[] input = {10,3,44,33,35};
		int answer = assignment34.diff(input);
		System.out.println(answer);
	}
}
