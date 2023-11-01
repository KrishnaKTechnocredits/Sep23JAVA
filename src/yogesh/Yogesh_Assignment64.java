//Assignemnt64: 
//first 5 armstrong number from range 900 to 1100

package yogesh;

public class Yogesh_Assignment64 {

	static boolean armstrongNumber(int number) {
		int power = Integer.toString(number).length();
		int sum = 0;
		int temp = number;

		while (number > 0) {
			int remainder = number % 10;
			sum = (int) (sum + Math.pow(remainder, power));
			number = number / 10;
		}

		return temp == sum;
	}

	public static void findArmstrongNumbers(int start, int end) {
		int count = 0;
		for (int number = start; number <= end; number++) {
			if (armstrongNumber(number)) {
				System.out.print(number + " ");
				if (count == 5) {
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println("No Armstrong numbers found between " + start + " and " + end);
		}

	}

	public static void main(String[] args) {

		System.out.println("Armstrong numbers between 900 and 1100 are:");
		findArmstrongNumbers(900, 1100);
	}
}
