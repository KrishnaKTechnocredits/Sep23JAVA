/*Assignment - 8 : 6th Sep'2023

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

//Assignment - 8 : 6th Sep'2023

package roshani;

class DayCheck{
	
	void processData(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 5){
			System.out.println("\nIts Weekday:");
			if(dayIndex == 1){
				System.out.println("That is Monday!");
			}else if(dayIndex == 2){
				System.out.println("That is Tuesday!");
			}else if(dayIndex == 3){
				System.out.println("That is Wednesday!");
			}else if(dayIndex == 4){
				System.out.println("That is Thursday!");
			}else if(dayIndex == 5){
				System.out.println("That is Friday!");
			}
		}else if(dayIndex == 6 || dayIndex == 7){
			System.out.println("\nIts Weekend:");
			if(dayIndex ==6){
				System.out.println("That is Saturday!");
			}else if(dayIndex == 7){
				System.out.println("That is Sunday!");
			}	
		}else{
			System.out.println("\nInvalid day index!");
		}
	}
	
	public static void main(String[] args){
		DayCheck daycheck = new DayCheck();
		daycheck.processData(2);
		daycheck.processData(6);
		daycheck.processData(11);
		daycheck.processData(-3);	
	}
}


