// WAP to write first 5 Armstrong number from range 900 to 1100

package akshita.array;

import java.util.Scanner;

public class Assignment64 {

	static boolean armstrong(int num) {
		int sum = 0;
		int temp = num;
		int reminder = 0;
		String str = Integer.toString(num);
		int leng = str.length();
		while (num > 0) {
			reminder = num % 10;
			sum = (int) (sum + (Math.pow(reminder, leng)));
			num = num / 10;
		}
		if (sum == temp) {
			return true;
		} else
			return false;
	}

	void countArmstrong(int start, int end) {
		int count = 0;
		for (int index = start; index <= end; index++) {

			boolean flag = armstrong(index);
			if (flag) {
				count++;
				System.out.println(index);
				if (count ==5) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment64 assg64 = new Assignment64();
		Scanner sc = new Scanner(System.in);
		System.out.println("First 5 Armstrong Number in range of ");
		System.out.println("Enter Start Range : ");
		int start = sc.nextInt();
		System.out.println("Enter End Range : ");
		int end = sc.nextInt();	
		assg64.countArmstrong(start, end);
		sc.close();
	}
}
