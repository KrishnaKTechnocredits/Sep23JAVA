/*Assignment - 9 : 6th Sep'2023
Find weekdays or weekends based on dayIndex. *
1 -> Monday
2 -> Tuesday
7 -> Sunday

input:
dayIndex -> 2 : Weekday
                Its a tuesday    
dayIndex -> 6 : WeekEnd
				Its a saturday
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index*/
package mohit;

public class Assignment_9 {
	void findDay(int dayIndex) {
		if (dayIndex >= 1 && dayIndex <= 5) {
			System.out.println("Its a weekday");
			if (dayIndex == 1)
			System.out.println("Monday");
			else if (dayIndex == 2)
			System.out.println("Tuesday");
			else if (dayIndex == 3)
			System.out.println("Wednesday");
			else if (dayIndex == 4)
			System.out.println("Thursday");
			else if (dayIndex == 5)
			System.out.println("Friday");
		}else if (dayIndex == 6 || dayIndex == 7) {
			System.out.println("its a weekend");
			if (dayIndex == 6) 
			System.out.println("Saturday");
			else
			System.out.println("Sunday");
		}
		else {
			System.out.println("invalid index");
		}
	}

	public static void main(String[] args) {
		Assignment_9 assignment_9 = new Assignment_9();
		assignment_9.findDay(2);
		assignment_9.findDay(6);
		assignment_9.findDay(11);
		assignment_9.findDay(-3);
	}

}
