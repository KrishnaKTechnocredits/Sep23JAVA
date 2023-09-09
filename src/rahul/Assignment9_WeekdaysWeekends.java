package rahul;

class Assignment9_WeekdaysWeekends {
	void weekdaysOrWeekends(int num) {
		if (num == 0 || num > 7 || num <= 0 ) {
			System.out.println("Invalid Index");
		}
		else if (num == 1) {
			System.out.println("Weekday");
			System.out.println("Monday");
		}
		else if (num == 2) {
			System.out.println("Weekday");
			System.out.println("Tuesday");
		}
		else if (num == 3) {
			System.out.println("Weekday");
			System.out.println("Wednesday");
		}
		else if (num == 4) {
			System.out.println("Weekday");
			System.out.println("Thursday");
		}
		else if (num == 5) {
			System.out.println("Weekday");
			System.out.println("Friday");
		}
		else if (num == 6) {
			System.out.println("WeekEnd");
			System.out.println("Saturday");
		}
		else if (num == 7) {
			System.out.println("WeekEnd");
			System.out.println("Sunday");
		}
	}
	
	public static void main (String args[]) {
		Assignment9_WeekdaysWeekends assignment9_weekdaysWeekends = new Assignment9_WeekdaysWeekends();
		assignment9_weekdaysWeekends.weekdaysOrWeekends(4);
		assignment9_weekdaysWeekends.weekdaysOrWeekends(7);
		assignment9_weekdaysWeekends.weekdaysOrWeekends(0);
		assignment9_weekdaysWeekends.weekdaysOrWeekends(100);
		assignment9_weekdaysWeekends.weekdaysOrWeekends(-6);
	}
}