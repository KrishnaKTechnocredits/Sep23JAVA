/*Assignment34 26thsept 2023  return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17

*/
package mayank;


public class Assignment34 {

	int getPositiveDifference(int[] arr) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = 0; index < arr.length; index++){
			if (arr[index] % 2 == 0) {
				sumEven = sumEven + arr[index];
			}else {
				sumOdd = sumOdd + arr[index];
			}
		}
		if (sumEven>sumOdd){
			return sumEven-sumOdd;
		}
		else{
			return sumOdd-sumEven;
			}
		}

	public static void main(String [] args) {
		int [] input = {10,3,44,33,35};
		Assignment34 assignment34 =new  Assignment34();
		int result = assignment34.getPositiveDifference(input);
		System.out.println("output is "+result);
	}
}