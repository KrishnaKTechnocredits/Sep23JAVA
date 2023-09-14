package gaurang;

class WeekdayorWeekend{
	
	void weekDays(int num){
		if(num>=1 && num<6)
			System.out.println("It is Weekday.");
		else if(num == 6 || num == 7)
			System.out.println("It is Weekend.");
		else
			System.out.println("Invalid index.");
	}
	
	public static void main(String[] args){
		WeekdayorWeekend weekdayorWeekend = new WeekdayorWeekend();
		weekdayorWeekend.weekDays(4);
		weekdayorWeekend.weekDays(7);
		weekdayorWeekend.weekDays(2);
		weekdayorWeekend.weekDays(11);
	}
}