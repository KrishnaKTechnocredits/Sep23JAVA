/*
Assignemnt64: 
first 5 armstrong number from range 900 to 1100
 */

package roshani;

public class Ass64ArmstrongNum {
	
	void armStrongNumCount(int startRange, int endRange) {
		int count = 0;
		System.out.println("Armstrong Num in the range of " + startRange + " to " + endRange +" are:");
		for(int index = startRange; index <= endRange; index++) {
			boolean flag = isArmstrong(index);
			if(flag) {
				count++;
				System.out.println(index);
				if(count == 5) {
					break;
				}
			}
		}
		if(count == 0) {
			System.out.println("No. of Armstrong numbers are:");
		}
	}
	
	boolean isArmstrong(int num) {
		int temp = num;
		int sum = 0;
		//int power = Integer.toString(num).length();
		while(num != 0) {
			int remainder = num % 10;
			sum = (int) (sum + Math.pow(remainder, 3));
			num = num / 10;
		}
		if(sum == temp) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Ass64ArmstrongNum assignment64 = new Ass64ArmstrongNum();
		assignment64.armStrongNumCount(900, 1100);
		assignment64.armStrongNumCount(1, 500);
	}
}
