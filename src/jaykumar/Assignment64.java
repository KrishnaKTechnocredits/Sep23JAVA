/*Assignment - 64 : 23rd Oct'2023
1. first 5 armstrong number from range 900 to 1100*/

package jaykumar;

public class Assignment64 {

	void armstrongNumbers(int startRange, int endRange) {
		int count = 0;
		System.out.println();
		System.out.println("Armstrong numbers in range of " + startRange + " to " + endRange);
		for (int index = startRange; index <= endRange; index++) {
			boolean flag = this.isArmstrong(index);
			if (flag) {
				count++;
				System.out.println(index + " is armstrong number!");
				if (count == 5) {
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println("No armstrong numbers");
		}
	}

	boolean isArmstrong(int num) {
		int temp = num;
		int sum = 0;
		int power = Integer.toString(num).length();
		while (num != 0) {
			int rem = num % 10;
			sum += Math.pow(rem, power);
			num = num / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Assignment64 assignment64 = new Assignment64();
		assignment64.armstrongNumbers(900, 1100);
		assignment64.armstrongNumbers(10, 1000);

	}
}
