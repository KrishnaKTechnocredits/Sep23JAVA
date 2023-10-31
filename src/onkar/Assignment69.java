/*Find weekdays or weekends based on dayIndex using switch case.

1 -> Monday

2 -> Tuesday

7 -> Sunday

input:

dayIndex -> 2 : Weekday and Its a tuesday

dayIndex -> 6 : WeekEnd and Its a saturday

dayIndex -> 11 : Invalid Index

dayIndex -> -3 : Invalid Index*/

package onkar;

public class Assignment69 {
	
	void findWeekday (int dayIndex) {
		switch (dayIndex) {
		case 1:
			System.out.println(dayIndex+" : Weekday and Its a Monday");
			break;
		
		case 2:
			System.out.println(dayIndex+" : Weekday and Its a Tuesday");
			break;
			
		case 3:
			System.out.println(dayIndex+" : Weekday and Its a Wednsday");
			break;
			
		case 4:
			System.out.println(dayIndex+" : Weekday and Its a Thursday");
			break;
			
		case 5:
			System.out.println(dayIndex+" : Weekday and Its a Friday");
			break;
		
		case 6:
			System.out.println(dayIndex+" : WeekEnd and Its a Saturday");
			break;
			
		case 7:
			System.out.println(dayIndex+" : WeekEnd and Its a Sunday");
			break;
			
		default:
			System.out.println(dayIndex+" : Invalid day index");
		}
	}
	
	public static void main(String[] args) {
		Assignment69 assignment69 = new Assignment69();
		assignment69.findWeekday(2);
		assignment69.findWeekday(6);
		assignment69.findWeekday(11);
		assignment69.findWeekday(-3);
	}
}
