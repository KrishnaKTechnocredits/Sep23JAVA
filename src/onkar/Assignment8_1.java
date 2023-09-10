package onkar;

class Assignment8_1{
	
	void findDay (int dayIndex){
		if (dayIndex >= 1 && dayIndex <= 5){
			System.out.println("It is a Weekday");
			if(dayIndex == 1)
				System.out.println("It is Monday");
			else if(dayIndex == 2)
				System.out.println("It is Tuesday");
			else if(dayIndex == 3)
				System.out.println("It is Wednesday");
			else if(dayIndex == 4)
				System.out.println("It is Thursday");
			else if(dayIndex == 5)
				System.out.println("It is Friday");
		}else if (dayIndex == 6 || dayIndex == 7){
			System.out.println("It is Weekend !!!");
			if(dayIndex == 6)
				System.out.println("It is Saturday");
			else
				System.out.println("It is Sunday");
		}else
			System.out.println("Invalid day Index");
	}
	
	public static void main(String[] args){
		Assignment8_1 assignment8_1 = new Assignment8_1();
		assignment8_1.findDay(2);
		assignment8_1.findDay(7);
		assignment8_1.findDay(-3);
		assignment8_1.findDay(11);
	}
}