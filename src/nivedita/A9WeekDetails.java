/*
Assignment - 9 : 6th Sep'2023

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

package nivedita;
class A9WeekDetails{
		
	void proccessData(int dayIndex){
		if(dayIndex >=1 && dayIndex<=5){
			System.out.println("Its a Weekday");
		}else if(dayIndex ==6 || dayIndex==7){
			System.out.println("Its Weekend");
		}
		
		if(dayIndex==1){
			System.out.println("Monday");
		}else if(dayIndex==2){
			System.out.println("Tuesday");
		}else if(dayIndex==3){
			System.out.println("Wednessday");
		}else if(dayIndex==4){
			System.out.println("Thursday");
		}else if(dayIndex==5){
			System.out.println("Friday");
		}else if(dayIndex==6){
			System.out.println("Saturday");
		}else if(dayIndex==7){
			System.out.println("Sunday");
		}
		
		else 
			System.out.println("Invalid Index");
	}
		
	public static void main(String[] args){
		A9WeekDetails weekdetails = new A9WeekDetails();
		weekdetails.proccessData(2);
		weekdetails.proccessData(6);
		weekdetails.proccessData(11);
		weekdetails.proccessData(-3);
	}
}