/*Assignment - 69 : 29th Oct'23

Find weekdays or weekends based on dayIndex using switch case.

1 -> Monday

2 -> Tuesday

7 -> Sunday

input:

dayIndex -> 2 : Weekday and Its a tuesday

dayIndex -> 6 : WeekEnd and Its a saturday

dayIndex -> 11 : Invalid Index

dayIndex -> -3 : Invalid Index

*/

package deepak;

public class Assignment69_SwitchCase {

	void knowDayType(int dayNum) {
		switch (dayNum) {
		case (1):
			System.out.println("dayIndex -> " + dayNum + " : Weekday and Its a Monday");
			break;

		case (2):
			System.out.println("dayIndex -> " + dayNum + " :Weekday and Its a Tuesday");
			break;

		case (3):
			System.out.println("dayIndex -> " + dayNum + " : Weekday and Its a Wednesday");
			break;

		case (4):
			System.out.println("dayIndex -> " + dayNum + " : Weekday and Its a Thursday");
			break;

		case (5):
			System.out.println("dayIndex -> " + dayNum + " : Weekday and Its a Friday");
			break;

		case (6):
			System.out.println("dayIndex -> " + dayNum + " : Weekend and Its a Saturday");
			break;

		case (7):
			System.out.println("dayIndex -> " + dayNum + " : Weekend and Its a Sunday");
			break;

		default:
			System.out.println("dayIndex -> " + dayNum + " : Invalid Index");
		}
	}

	public static void main(String[] args) {
		Assignment69_SwitchCase output = new Assignment69_SwitchCase();
		System.out.println("Output: ");
		output.knowDayType(2);
		output.knowDayType(6);
		output.knowDayType(11);
		output.knowDayType(-3);
	}
}