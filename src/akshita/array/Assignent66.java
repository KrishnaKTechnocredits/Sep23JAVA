//WAP to return number without converting it to String Input: 123 Output: 321

package akshita.array;

import java.util.Scanner;

public class Assignent66 {

	void reverse(int input) {
		int rem = 0;
		int temp = 0;
		while (input > 0) {
			rem = input % 10;
			temp = temp * 10 + rem;
			input = input / 10;
		}
		System.out.println("Ouput : " + temp);
	}

	public static void main(String[] args) {
		Assignent66 ass66 = new Assignent66();
		System.out.println("Return number in reverse order");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int input = sc.nextInt();
		ass66.reverse(input);
		sc.close();
	}
}
