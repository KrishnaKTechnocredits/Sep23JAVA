package technoCredits.scannerDemo;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full name : ");
		String name = sc.nextLine();
		String[] arr = name.split("-");
		System.out.println(arr.length); //2
		System.out.println(arr[1]);
		System.out.println("================");
		System.out.println(name);
		
	}
}
