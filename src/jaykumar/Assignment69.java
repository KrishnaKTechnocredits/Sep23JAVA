/*Assignment - 69 : 29th Oct'23
Find weekdays or weekends based on dayIndex using switch case.
1 -> Monday
2 -> Tuesday
7 -> Sunday
input:
dayIndex -> 2 : Weekday and Its a tuesday
dayIndex -> 6 : WeekEnd and Its a saturday
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index*/

package jaykumar;

public class Assignment69 {
	
	void processDay(int dayIndex) {
		switch(dayIndex) {
		case 1:
			System.out.println(dayIndex+" -> "+"Weekday and Its Monday!" );
			break;
		case 2:
			System.out.println(dayIndex+" -> "+"Weekday and Its Tuesday!" );
			break;
		case 3:
			System.out.println(dayIndex+" -> "+"Weekday and Its Wednesday!" );
			break;
		case 4:
			System.out.println(dayIndex+" -> "+"Weekday and Its Thursday!" );
			break;
		case 5:
			System.out.println(dayIndex+" -> "+"Weekday and Its Friday!" );
			break;
		case 6:
			System.out.println(dayIndex+" -> "+"Weekend and Its Saturday!" );
			break;
		case 7:
			System.out.println(dayIndex+" -> "+"Weekend and Its Sunday!" );
			break;
		default:
			System.out.println(dayIndex+" -> "+"Invalid Index!" );	
		}
		
	}

	public static void main(String[] args) {
		Assignment69 a = new Assignment69();
		a.processDay(2);
		a.processDay(6);
		a.processDay(11);
		a.processDay(-3);
		
	}
}
