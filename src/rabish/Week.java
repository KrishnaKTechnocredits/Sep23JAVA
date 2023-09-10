package rabish;
class Week {

	void weekDay(int dayIndex){
		
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Weekday");
			if(dayIndex==2)
			System.out.println("Its a tuesday");
		}
			if(dayIndex>=6 && dayIndex<=7){
				System.out.println("Weekend");
			}
				if(dayIndex==6){
				System.out.println("Its a saturday");
		}
			if(dayIndex>=8 || dayIndex<=0){
			System.out.println("Invalid Index");
		}
	}
		
	public static void main(String[] args){
		Week day= new Week();
		day.weekDay(2);
	}
}