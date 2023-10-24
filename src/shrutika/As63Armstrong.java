/*Assignment - 64 : 23rd Oct'2023

1. first 5 armstrong number from range 900 to 1100 */

package shrutika;

public class As63Armstrong {

	boolean amstrongNum(int num) {
		int temp = num;
		int range = 0;
		int sum = 0;
		while (num != 0) {
			range = num % 10;
			sum = sum + (range * range * range);
			num = num / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}

	void amstrongNumCount(int StartNum, int endNum) {
		boolean flag = false;
		int count = 0;
		System.out.println("\nGiven Range is " + StartNum + "," + endNum);
		for (int num = StartNum; num <= endNum; num++) {
			flag = amstrongNum(num);
			if (flag == true) {
				count++;
				System.out.println("amstrong Numers are " + num);
				if (count == 5) {
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println("from given range no amstrongNumber present");
		}
	}

	public static void main(String[] args) {
		As63Armstrong as63Armstrong = new As63Armstrong();
		as63Armstrong.amstrongNumCount(0, 9999);
		as63Armstrong.amstrongNumCount(900, 1100);
	}
}
