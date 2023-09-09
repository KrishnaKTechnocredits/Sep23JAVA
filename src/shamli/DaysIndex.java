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
dayIndex -> -3 : Invalid Index */

package shamli;

class DaysIndex{
	
	void processData(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Weekday");
				if(dayIndex==1){
					System.out.println("Monday");
				}else if(dayIndex==2){
					System.out.println("Tuesday");	
				}else if(dayIndex==3){
					System.out.println("Wednesday");
				}else if(dayIndex==4){
					System.out.println("Thrusday");
				}else if(dayIndex==5){
					System.out.println("Friday");
				}
				
		}else if(dayIndex==6 || dayIndex==7){
			System.out.println("Weekend");
				if(dayIndex==6){
					System.out.println("Saturday");
				}else if(dayIndex==2){
					System.out.println("Sunday");	
				}
		}else{
			System.out.println("Invalid dayIndex");
		}
	}
	
	public static void main(String[] args){
		DaysIndex dayindex = new DaysIndex();
		dayindex.processData(4);
		dayindex.processData(12);
		dayindex.processData(-4);
		dayindex.processData(6);
	}
}