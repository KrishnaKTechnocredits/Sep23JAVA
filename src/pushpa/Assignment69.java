//Assignment - 69 : 29th Oct'23
//
//Find weekdays or weekends based on dayIndex using switch case.
//
//1 -> Monday
//
//2 -> Tuesday
//
//7 -> Sunday
//
//input:
//
//dayIndex -> 2 : Weekday and Its a tuesday
//
//dayIndex -> 6 : WeekEnd and Its a saturday
//
//dayIndex -> 11 : Invalid Index
//
//dayIndex -> -3 : Invalid Index

package pushpa;

import java.util.Scanner;

public class Assignment69 {

	public void findDay(int choice) {
		switch (choice) {
		case 1:
			System.out.println("Weekday and Its a Monday");

			break;

		case 2:
			System.out.println("Weekday and Its a Tuesday");

			break;
		case 3:
			System.out.println("Weekday and Its a Wednesday");

			break;
		case 4:
			System.out.println("Weekday and Its a Thursday");

			break;
		case 5:
			System.out.println("Weekday and Its a Friday");

			break;
		case 6:
			System.out.println("Weekend and Its a Saturday");

			break;
		case 7:
			System.out.println("Weekend and Its a Sunday");

			break;
		default:
			System.out.println("Invalid Index");
			break;
		}
	}

	public static void main(String[] args) {
		Assignment69 assignment69 = new Assignment69();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice :");
		int ch = scanner.nextInt();
		assignment69.findDay(ch);
		scanner.close();
	}
}
