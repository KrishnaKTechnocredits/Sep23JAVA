/*Assignment - 69 : 29th Oct'23 Find weekdays or weekends based on dayIndex 
using switch case. 1 -> Monday 2 -> Tuesday 7 -> Sunday input: dayIndex -> 2 :
	Weekday and Its a tuesday dayIndex -> 6 : WeekEnd and
Its a saturday dayIndex -> 11 : Invalid Index dayIndex -> -3 : Invalid Index*/
package shrutika;

public class As69SwitchCase {

	void printDaysUsingSwitchCase(int dayIndex) {
		switch (dayIndex) {
		case 1:
			System.out.println(dayIndex + " : WeekDay and Its a Monday");
			break;

		case 2:
			System.out.println(dayIndex + " : WeekDay and Its a Tuesday");
			break;

		case 3:
			System.out.println(dayIndex + " : WeekDay and Its a Wednsday");
			break;

		case 4:
			System.out.println(dayIndex + " : WeekDay and Its a Thursday");
			break;

		case 5:
			System.out.println(dayIndex + " : WeekDay and Its a Friday");
			break;

		case 6:
			System.out.println(dayIndex + " : WeekEnd and Its Saturday");
			break;

		case 7:
			System.out.println(dayIndex + " : WeekEnd and Its Sunday");
			break;

		default:
			System.out.println(dayIndex + " : Invalid dayIndex");
		}
	}

	public static void main(String[] args) {
		As69SwitchCase as69 = new As69SwitchCase();
		as69.printDaysUsingSwitchCase(2);
		as69.printDaysUsingSwitchCase(6);
		as69.printDaysUsingSwitchCase(11);
		as69.printDaysUsingSwitchCase(-3);
	}
}
