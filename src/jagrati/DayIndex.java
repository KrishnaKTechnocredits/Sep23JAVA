package jagrati;

// Find weekdays or weekends based on dayIndex. *

class DayIndex{
	
		void weekCount(int dayIndex){
			if (dayIndex >= 1 && dayIndex <= 5){
				System.out.println("Weekday");
				if (dayIndex == 1){
					System.out.println("its monday");
				}if (dayIndex == 2 ){
					System.out.println("its tuesday");
				}if (dayIndex == 3){
					System.out.println("its wednesday");
				}if (dayIndex == 4){
					System.out.println("its Thursday");
				}if (dayIndex == 5){
					System.out.println("its Friday");
				}
			}else if (dayIndex == 6 || dayIndex == 7){
				System.out.println("Weekend");
					}if(dayIndex == 6){
						System.out.println("its Saturdey ");
					}else if (dayIndex == 7){
						System.out.println("its sunday");
					}else if (dayIndex > 7 || dayIndex < 0){
				System.out.println("Invalid index");
			}
		}
	
	public static void main(String [] args){
		DayIndex day = new DayIndex();
		day.weekCount(2);
		day.weekCount(6);
		day.weekCount(11);
		day.weekCount(-3);
	}
}