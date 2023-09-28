/*  
Assignment-33 : 26th Sep'2023
Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54*/

package mayank;

public class Assignment33 {

		void printSum(int[] num) {
			int sum = 0;
			for (int index = 0; index < num.length; index++) {
				if (num[index] % 2 == 0) {
					sum = sum+ num[index];
				}

			}
			System.out.println("Sum of even number -> " + sum);
		}

		public static void main(String[] args) {
			int[] value = { 10, 11, 44, 33, 23 };
			Assignment33 assignment33 = new Assignment33();
			assignment33.printSum(value);
		}
	}


