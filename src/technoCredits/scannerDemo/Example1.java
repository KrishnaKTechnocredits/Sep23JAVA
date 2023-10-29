package technoCredits.scannerDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements : ");
		int len = sc.nextInt();
		String[] name = new String[len];
		
		for(int index=0;index<len;index++) {
			System.out.println("Enter name : ");
			name[index] = sc.next();
		}
		
		System.out.println(Arrays.toString(name));
	}
}
