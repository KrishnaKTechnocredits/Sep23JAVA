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

package roshani;

public class Ass69SwitchCase {
	//String day = "";
	void processInfo(int day) {
		switch(day) {
			case 1:
				System.out.println("DayIndex: " + day + ", Weekday! It's Monday.");
				break;

			case 2:
				System.out.println("DayIndex: " + day + ", Weekday! It's Monday.");
				break;

			case 3:
				System.out.println("DayIndex: " + day + ", Weekday! It's Wednesday.");
				break;

			case 4:
				System.out.println("DayIndex: " + day + ", Weekday! It's Thursday.");
				break;

			case 5:
				System.out.println("DayIndex: " + day + ", Weekday! It's Friday.");
				break;

			case 6:
				System.out.println("DayIndex: " + day + ", Weekend! It's Saturday.");
				break;

			case 7:
				System.out.println("DayIndex: " + day + ", Weekend! It's Sunday.");
				break;

			default:
				System.out.println("DayIndex: " + day + ", Invalid Index.");
			}			
	}
	public static void main(String[] args) {
		Ass69SwitchCase assignment69 = new Ass69SwitchCase();
		assignment69.processInfo(2);
		assignment69.processInfo(6);
		assignment69.processInfo(11);
		assignment69.processInfo(-3);
		
	}
}
