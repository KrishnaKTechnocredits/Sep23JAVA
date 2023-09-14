package akash;

class DayIndex{
	
	void findDayIndex(int day){
		if(day>=1 && day<=7){
			if(day>=1 && day<=5){
				System.out.println("Weekdays");
				if(day == 1)
					System.out.println("Monday");
				else if(day == 2)
					System.out.println("Tuesday");
				else if(day == 3)
					System.out.println("Wednesday");
				else if(day == 4)
					System.out.println("Thurday");
				else if(day == 5)
					System.out.println("Friday");
			}else if(day>=6 && day<=7){
				System.out.println("Weekend");
				if(day == 6)
					System.out.println("Saturday");
				else
					System.out.println("Sunday");
				
			}
		}else 
			System.out.println("Invalid Index");
	}
	
	public static void main(String[] args){
		DayIndex dayindex = new DayIndex();
		dayindex.findDayIndex(1);
		dayindex.findDayIndex(6);
		dayindex.findDayIndex(7);
		dayindex.findDayIndex(-9);
		dayindex.findDayIndex(0);
	}
}
