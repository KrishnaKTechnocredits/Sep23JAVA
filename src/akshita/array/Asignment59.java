//Using scanner class, take 2 inputs from user and ask user which operation they would like to perform , accordingly call methods of calculator.
//input :  enter input 1 : 23     enter input 2 : 20
//which operation you want to perform, valid operations are [add,sub,mul,div].
//add
//output : sum of 23 and 20 is 43

package akshita.array;

import java.util.Scanner;

public class Asignment59 {

	int output;

	int add(int input1, int input2) {
		output = input1 + input2;
		return output;
	}

	int sub(int input1, int input2) {
		if (input1 > input2) {
			output = input1 - input2;
		} else
			output = input2 - input1;
		return output;
	}

	int div(int input1, int input2) {
		output = input1 / input2;
		return output;
	}

	int mul(int input1, int input2) {
		output = input1 * input2;
		return output;
	}

	public static void main(String[] args) {
		Asignment59 ass59 = new Asignment59();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int var1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int var2 = sc.nextInt();
		while (true) {
			System.out.println("which operation you want to perform Add/Sub/div/Mul : ");
			String ope = sc.next();
			if (ope.equals("Add")) {
				System.out.println(ass59.add(var1, var2));
			} else if (ope.equals("Sub")) {
				System.out.println(ass59.sub(var1, var2));
			} else if (ope.equalsIgnoreCase("Div")) {
				System.out.println(ass59.div(var1, var2));
			} else if (ope.equalsIgnoreCase("Mul")) {
				System.out.println(ass59.mul(var1, var2));
			} else {
				System.out.println("You Entered invalid operation . Plz enter valid Operation add/sub/mul/div");
			}
			
			System.out.println("Would like to continue (Yes/No) ?");
			String temp = sc.next();
			if (temp.equals("No")) {
				break;
			}
			continue;
		}
         sc.close();
	}
}
