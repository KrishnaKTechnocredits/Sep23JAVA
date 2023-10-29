package technoCredits.scannerDemo;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rno : ");
		int rno = sc.nextInt();
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter last received score : ");
		double score = sc.nextDouble();
		System.out.println("====================");
		System.out.println("Student rno is - " + rno);
		System.out.println("Student name is - " + name);
		System.out.println("Student score - " + score);
		sc.close();
	}
}
