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

//Assignment 8
package jyoti;
class DayIndex{
	int index;
	void days(int index)
	{
		if(index>=1 && index<=5)
		{
				//System.out.println("Weekday :" + index);
				if(index==1){
						System.out.println("Weekday :" + index + " and Day is Monday");
				}else if(index==2){
						System.out.println("Weekday :" + index + " and Day is Tuesday");
				}else if(index==3){
						System.out.println("Weekday :" + index + " and Day is Wednesday");
				}else if(index==4){
						System.out.println("Weekday :" + index + " and Day is Thusday");
				}else if(index==5){
						System.out.println("Weekday :" + index + " and Day is Friday ,Haapy Friday");
				}		
		}else if(index>=6 && index <=7){
						//System.out.println("Enjoy Weekend :" + index);
						if(index==6)
							System.out.println("Weekend :" + index + " Enjoy Saturday");
						else 
							System.out.println("Weekend :" + index + " Sunday is Funday ");
						}else{
						System.out.println(index + " : Invalid data,Please check your data");
				}
	}
	public static void main(String[] args){
				DayIndex dayIn = new DayIndex();
				dayIn.days(1);
				dayIn.days(2);
				dayIn.days(3);
				dayIn.days(4);
				dayIn.days(5);
				dayIn.days(6);
				dayIn.days(7);
				dayIn.days(8);
				dayIn.days(-8);
			}
			
		}			
	
	
	
	

