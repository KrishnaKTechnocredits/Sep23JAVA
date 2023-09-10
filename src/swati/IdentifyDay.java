package swati;

//Assignment 9
class IdentifyDay{

	void processData(int DayIndex){
		if(DayIndex>=1 && DayIndex<=5){
			System.out.println("\nIts a Weekday");
		}else if(DayIndex>=6 && DayIndex<=7){
			System.out.println("\nIts a Weekend");
		}
		if(DayIndex==1){
			System.out.println("Monday");
		}else if(DayIndex==2){
			System.out.println("Tuesday");
		}else if(DayIndex==3){
			System.out.println("Wednesday");
		}else if(DayIndex==4){
			System.out.println("Thursday");
		}else if(DayIndex==5){
			System.out.println("Friday");
		}else if(DayIndex==6){
			System.out.println("Saturday");
		}else if(DayIndex==7){
			System.out.println("Sunday");
		}else{
			System.out.println("\nInvalid Day");
		}
	}

	public static void main(String[] args){
		IdentifyDay identifyday = new IdentifyDay();
		identifyday.processData(1);
		identifyday.processData(7);
		identifyday.processData(5);
		identifyday.processData(10);
	
	}
}