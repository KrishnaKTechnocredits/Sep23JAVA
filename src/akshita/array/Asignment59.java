//Using scanner class, take 2 inputs from user and ask user which operation they would like to perform , accordingly call methods of calculator.
//input :  enter input 1 : 23     enter input 2 : 20
//which operation you want to perform, valid operations are [add,sub,mul,div].
//add
//output : sum of 23 and 20 is 43


package akshita.array;

import java.util.Scanner;

public class Asignment59 {

	int calulator(int input1, int input2,String ope) {
		int output=0;
		if(ope.equals("Add")) {
			output = input1 + input2;
		}
		if(ope.equals("Sub")) {
			if(input1>input2) {
				output = input1  - input2;
			}
			else
				output = input2 -input1;
		}
		if(ope.equalsIgnoreCase("Div")) {
			output = input1/input2;
		}
		if(ope.equalsIgnoreCase("Mul")) {
			output = input1* input2;
		}
		else {
			System.out.println("You Enteredinvalid operation");
		}
		return output;
	}
	public static void main(String[] args) {
		Asignment59 ass59 = new Asignment59();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter First Number : " );
		int var1 = sc.nextInt();
		System.out.println("Enter Second Number : " );
		int var2 = sc.nextInt();
		System.out.println("which operation you want to perform Add/Sub/div/Mul : ");
		String ope = sc.next();
		System.out.println(ass59.calulator(var1,var2,ope));
	}

}
