package akshita;

class DayIndex{
	
	void indexOfDay(int index){
		if(index >=1 && index <=5){
			System.out.println("It is a Weekday");
				if(index == 1){
					System.out.println("It is a Monday");
				}
		         else if(index == 2){
					System.out.println("It is a Tuesday");
				}
		}
		else if(index ==6 || index ==7){
			System.out.println("It is a Weekend");
				if(index == 6){
			System.out.println("It is a Saturday");
		    }
			else{
			System.out.println("It is a Sunday");	
			}
		}
		else{
			System.out.println("Invalid Index");
		}
	}
	public static void main(String[] args){
	DayIndex dayIndex = new DayIndex();
	dayIndex.indexOfDay(2);
	dayIndex.indexOfDay(6);
	dayIndex.indexOfDay(11);
	dayIndex.indexOfDay(-3);
	}
}