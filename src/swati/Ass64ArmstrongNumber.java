/*Assignment - 64 : 23rd Oct'2023
1. first 5 armstrong number from range 900 to 1100*/
package swati;

public class Ass64ArmstrongNumber {
	boolean getArmStrongNum(int numb) {
		int sum = 0;
		int temp = numb;
		while (numb != 0) {
			int rem = numb % 10;
			sum = (int) (sum + Math.pow(rem, 3));
			numb = numb / 10;
		}
		if (sum == temp) {
			return true;
		} else {
			return false;
		}
	}

	void countArmStrongNum(int startrange, int endrange) {
		int count = 0;
		System.out.println("Range " + startrange + " to " + endrange);
		for (int index = startrange; index <= endrange; index++) {
			boolean flag = getArmStrongNum(index);
			if (flag) {
				count++;
				System.out.println(index+" is armstrong number");
				if (count == 5)
					break;
			}
		}
		if (count == 0) {
			System.out.println("No armstrong numbers found is given range");
		}
	}
	
	public static void main(String[] args) {
		Ass64ArmstrongNumber ass64 = new Ass64ArmstrongNumber();
		ass64.countArmStrongNum(900, 1100);
		ass64.countArmStrongNum(1, 500);
	}
}
