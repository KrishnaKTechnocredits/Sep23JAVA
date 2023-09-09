/*Assignment - 9: 6th Sep'2023
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
dayIndex -> -3 : Invalid Index
*/
package deepak;
class Weekday_Asssignment9{
	void weekdayInfo(int index){
		if(index >=1 && index <=5){
			System.out.println("WEEKDAY");
			if(index == 1)
				System.out.println("Its a Monday");
			else if(index == 2)
				System.out.println("Its a Tuesday");
			else if(index == 3)
				System.out.println("Its a Wednesday");
			else if(index == 4)
				System.out.println("Its a Thursday");
			else if(index == 5)
				System.out.println("Its a Friday");
		}else if(index >5 && index <=7){
			System.out.println("WEEKEND");
			if(index == 6)
				System.out.println("Its a Saturday");
			else if(index == 7)				
				System.out.println("Its a Sunday");
		}else
				System.out.println("Invalid Index");
	}
	
	public static void main(String[] args){
		Weekday_Asssignment9 day = new Weekday_Asssignment9();
		day.weekdayInfo(2);
		day.weekdayInfo(6);
		day.weekdayInfo(11);
		day.weekdayInfo(-3);
	}
}