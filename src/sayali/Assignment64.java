/* Assignemnt64: 
WAP to print first 5 Armstrong number from range 900 to 1100 */

package sayali;

public class Assignment64 {

	boolean getArmStrongNum(int num) {
		double sum = 0;
		int temp = num;
		while (num != 0) {
			int reminder = num % 10;
			sum += Math.pow(reminder, 3);
			num /= 10;
		}
		if (sum == temp) {
			return true;
		} else {
			return false;
		}
	}

	void armStrongNumCount(int startrange, int endrange) {
		int count = 0;

		for (int index = startrange; index <= endrange; index++) {
			boolean flag = getArmStrongNum(index);
			if (flag) {
				count++;

				System.out.println("\n Armstrong number is:" + index);
				if (count == 5)
					break;
			}
		}
		if (count == 0) {
			System.out.println("Armstrong number not found in given range");
		}
	}

	public static void main(String[] args) {
		Assignment64 ass64 = new Assignment64();
		ass64.armStrongNumCount(900, 1100);
	}
}