//Return positive difference of sum of all the even numbers and odd numbers from given array.
//input : {10,3,44,33,35}
//output : 17 


package aditya.Array;

public class Assignment34 {

	int displaySum(int[] arr) {
		int Evensum = 0;
		int Oddsum = 0;
		int PositiveDifference = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				Evensum = Evensum + arr[index];
			} else if (arr[index] % 2 != 0) {
				Oddsum = Oddsum + arr[index];
			}
			if (Evensum > Oddsum) {
				PositiveDifference = Evensum - Oddsum;
			} else {
				PositiveDifference = Oddsum - Evensum;
			}
		}

		System.out.println(Evensum);
		System.out.println(Oddsum);
		return PositiveDifference;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 10, 3, 44, 33, 35 };
		Assignment34 as34 = new Assignment34();
		int Answer = as34.displaySum(input);
		System.out.println(Answer);

	}

}
