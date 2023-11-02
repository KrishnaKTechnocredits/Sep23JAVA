//Assignment-66 : 28th Oct'2023
//WAP to return reverse number without converting it to String.
//
//input : 123
//output : 321

package pushpa;

import java.util.Scanner;

public class Assignment66 {

	public int revesreNumber(int input) {
		int rev = 0;
		while (input > 0) {
			int rem = input % 10;
			rev =  rem + (rev * 10);
			input /= 10;
		}
		return rev;

	}

	public static void main(String[] args) {
		Assignment66 assignment66 = new Assignment66();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No :");
		int no = scanner.nextInt();
		int result = assignment66.revesreNumber(no);
		System.out.println("Reverse of Number is :" + result);
	}

}
