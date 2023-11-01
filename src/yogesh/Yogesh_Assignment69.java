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

package yogesh;

public class Yogesh_Assignment69 {

	void dayIndex(int num) {
		switch (num) {
		case 1:
			System.out.println("Weekday Monday");
			break;
		case 2:
			System.out.println("Weekday Tuesday");
			break;
		case 3:
			System.out.println("Weekday Wednesday");
			break;
		case 4:
			System.out.println("Weekday Thursday");
			break;
		case 5:
			System.out.println("Weekday Friday");
			break;
		case 6:
			System.out.println("Weekend Saturday");
			break;
		case 7:
			System.out.println("Weekend Sunday");
			break;
		default:
			System.out.println("Invalid input");
		}

	}

	public static void main(String[] args) {
		Yogesh_Assignment69 assignment69 = new Yogesh_Assignment69();
		assignment69.dayIndex(1);
		assignment69.dayIndex(5);
		assignment69.dayIndex(6);
		assignment69.dayIndex(7);
		assignment69.dayIndex(8);

	}
}
