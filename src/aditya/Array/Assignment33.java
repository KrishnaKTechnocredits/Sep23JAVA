//Print sum of all the even numbers from given array.
//input : {10,11,44,33,23}
//output : 54


package aditya.Array;

class Assignment33 {

	int display(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			{
				if (arr[index] % 2 == 0) {
					sum = sum + arr[index];

				}
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		int[] input = { 10,11,44,33,23 };
		Assignment33 as33 = new Assignment33();
		int Answer = as33.display(input);
		System.out.println("Sum of even numbers in array " +Answer);
	}

}