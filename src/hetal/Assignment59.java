//*Using scanner class, take 2 inputs from user and ask user which operation they would like to perform , accordingly call methods of calculator.
//*input : 
//*enter input 1 : 23
//*enter input 2 : 20
//*which operation you want to perform, valid operations are [add,sub,mul,div].
//*add
//*output : sum of 23 and 20 is 43

package hetal;

import java.util.Scanner;

public class Assignment59 {

	int ans;

	void add(int num1, int num2) {
		ans = num1 + num2;
		System.out.println("addition is : " +ans);
	}

	void sub(int num1, int num2) {
		ans = num1 - num2;
		System.out.println("substraction is : " +ans);
	}

	void mul(int num1, int num2) {
		ans = num1 * num2;
		System.out.println("multiplication is : " +ans);
	}

	void div(int num1, int num2) {
		ans = num1 / num2;
		System.out.println("Division is : " +ans);

	}

	public static void main(String[] args) {
		Assignment59 a = new Assignment59();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("enter num2 : ");
		int num2 = sc.nextInt();

		while (true) {
			System.out.println("which operation you want to perform : ");
			String operation = sc.next();
			if (operation.equals("add")) {
				a.add(num1, num2);
			} else if (operation.equals("sub")) {
				a.sub(num1, num2);
			} else if (operation.equals("mul")) {
				a.mul(num1, num2);
			} else if (operation.equals("div")) {
				a.div(num1, num2);
			} else {
				System.out.println("please choose valid operation , valid operation are[add,mul,div,sub]);");
				continue;
			}
			System.out.println("would you like to continue (yes/no) ?");
			String temp = sc.next();
			if (temp.equals("no")) {
				break;
			}
		}
	}
}
