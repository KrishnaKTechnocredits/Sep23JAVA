/* Find weekdays or weekends based on dayIndex using switch case.

1 -> Monday

2 -> Tuesday

7 -> Sunday

input:

dayIndex -> 2 : Weekday and Its a tuesday

dayIndex -> 6 : WeekEnd and Its a saturday

dayIndex -> 11 : Invalid Index

dayIndex -> -3 : Invalid Index */

package sayali;

public class Assignment69 {

	void processData(int dayIndex) {

		switch (dayIndex) {
		case 1:
			System.out.println("dayIndex -> " + dayIndex + ": " + "Weekday and It's a Monday");
			break;

		case 2:
			System.out.println("dayIndex -> " + dayIndex + ": " + "Weekday and It's a Tuesday");
			break;

		case 3:
			System.out.println("dayIndex -> " + dayIndex + ": " + "Weekday and It's a Wednesday");
			break;

		case 4:
			System.out.println("dayIndex -> " + dayIndex + ": " + "Weekday and It's a Thursday");
			break;

		case 5:
			System.out.println("dayIndex -> " + dayIndex + ": " + "Weekday and It's a Friday");
			break;

		case 6:
			System.out.println("dayIndex -> " + dayIndex + ": " + "Weekend and It's a Saturday");
			break;

		case 7:
			System.out.println("dayIndex -> " + dayIndex + ": " + "Weekend and It's a Sunday");
			break;

		default:
			System.out.println("dayIndex -> " + dayIndex + ": " + "Invalid Index");
		}
	}

	public static void main(String[] args) {
		Assignment69 ass69 = new Assignment69();
		ass69.processData(2);
		ass69.processData(6);
		ass69.processData(11);
		ass69.processData(-3);
	}
}