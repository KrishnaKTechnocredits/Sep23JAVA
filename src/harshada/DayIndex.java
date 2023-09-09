//Assignment - 8 : 6th Sep'2023
//Find weekdays or weekends based on dayIndex. *
//1 -> Monday
//2 -> Tuesday
//7 -> Sunday
//
//input:
//dayIndex -> 2 : Weekday
//                Its a tuesday    
//dayIndex -> 6 : WeekEnd
//				Its a saturday
//dayIndex -> 11 : Invalid Index
//dayIndex -> -3 : Invalid Index
package harshada;
class DayIndex{
	
	void processDayIndx(int day){
		if(day>=1 && day<=7){
			if(day>=1 && day<=5){
				System.out.println("Weekday");
				if(day==1)
					System.out.println("Its a Monday");
				else if(day==2)
					System.out.println("Its a Tuesday");
				else if(day==3)
					System.out.println("Its a Wednsday");
				else if(day==4)
					System.out.println("Its a Thursday");
				else if(day==5)
					System.out.println("Its a Friday");
			}
			else if(day>=6 && day<=7){
				System.out.println("Weekday");
				if(day==6)
					System.out.println("Its a Saturday");
				else
					System.out.println("Its a Sunday");
			}
		}else
			System.out.println("Invalid Index");
	}
	
	public static void main(String[]args){
		DayIndex dayIndex=new DayIndex();
		dayIndex.processDayIndx(2);
		dayIndex.processDayIndx(6);
		dayIndex.processDayIndx(11);
		dayIndex.processDayIndx(-3);
	}
}