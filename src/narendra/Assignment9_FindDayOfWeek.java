package narendra;

class Assignment9_FindDayOfWeek {
	void processDayIndex(int dayIndex) {
		if (dayIndex >= 1 && dayIndex <= 7) {
			if (dayIndex >= 1 && dayIndex <= 5) {
				System.out.println("Weekday");
				if (dayIndex == 1) {
					System.out.println("It's a Monday");
				} else if (dayIndex == 2) {
					System.out.println("It's a Tuesday");
				} else if (dayIndex == 3) {
					System.out.println("It's a Wednesday");
				} else if (dayIndex == 4) {
					System.out.println("It's a Thursday");
				} else if (dayIndex == 5) {
					System.out.println("It's a Friday");
				}
			} else if (dayIndex == 6 || dayIndex == 7) {
				System.out.println("Weekend");
				if (dayIndex == 6) {
					System.out.println("It's a Saturday");
				} else if (dayIndex == 7) {
					System.out.println("It's a Sunday");
				}
			}
		} else {
			System.out.println("Invalid Index");
		}
	}

	public static void main(String[] args) {
		Assignment9_FindDayOfWeek finddayofweek = new Assignment9_FindDayOfWeek();
		finddayofweek.processDayIndex(2);
		finddayofweek.processDayIndex(6);
		finddayofweek.processDayIndex(11);
		finddayofweek.processDayIndex(-3);
	}
}