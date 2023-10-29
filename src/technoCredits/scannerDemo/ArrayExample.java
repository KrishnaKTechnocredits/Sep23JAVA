package technoCredits.scannerDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	static void add(int[] arr) {
		int sum = 0;
		for(int index=0;index<arr.length;index++) {
			sum = sum + arr[index];
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length : ");
		int len = sc.nextInt();
		int[] input = new int[len];
		for(int index=0;index<input.length;index++) {
			System.out.println("enter number : ");
			input[index] = sc.nextInt();
		}
		System.out.println(Arrays.toString(input));
		add(input);
	}
}
