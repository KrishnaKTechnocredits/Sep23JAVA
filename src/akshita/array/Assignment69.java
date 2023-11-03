/*Find weekdays or weekends based on dayIndex using switch case.
1 -> Monday
2 -> Tuesday
7 -> Sunday
input:
dayIndex -> 2 : Weekday and Its a Tuesday
dayIndex -> 6 : WeekEnd and Its a Saturday
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index*/

package akshita.array;

public class Assignment69 {

	void day(String name) {
		switch (name) {
		case "1":
			System.out.println("Weekday and its a Monday");
			break;
		case "2":
			System.out.println("Weekday and its a Tuesday");
			break;
		case "3":
			System.out.println("Weekday and its a Wednesday");
			break;
		case "4":
			System.out.println("Weekday and its a Thursday");
			break;
		case "5":
			System.out.println("Weekday and its a Friday");
			break;
		case "6":
			System.out.println("Weekday and its a Saturday");
			break;
		case "7":
			System.out.println("Weekday and its a Sunday");
			break;
		default : System.out.println("Invalid Index");
		}
	}

	public static void main(String[] args) {
		Assignment69 ass69 = new Assignment69();
		ass69.day("2");
		ass69.day("6");
		ass69.day("11");
		ass69.day("-3");
	}
}
