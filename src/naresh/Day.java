package naresh;

class Day1{

void dayCheck(int dayIndex){
	
		if(dayIndex>=8 || dayIndex<=0){
			System.out.println(dayIndex+" is invalid value");
		}
		if(dayIndex==1){
			System.out.println("Weekday");
			System.out.println(dayIndex+" is Monday");	
		}
		if(dayIndex==2){
			System.out.println("Weekday");
			System.out.println(dayIndex+" is Tuesday");
			
		}
		if(dayIndex==3){
			System.out.println("Weekday");
			System.out.println(dayIndex+" is Wednesday");
			
		}
		if(dayIndex==4){
			System.out.println("Weekday");
			System.out.println(dayIndex+" is Thrusday");
			
		}
			if(dayIndex==5){
			System.out.println("Weekday");
			System.out.println(dayIndex+" is Friday");
			
		}
			if(dayIndex==6){
			System.out.println("Weekend");
			System.out.println(dayIndex+" is Saturday");
			
		}
			if(dayIndex==7){
			System.out.println("Weekend");
			System.out.println(dayIndex+" is Sunday");	
		}
	}
	
	public static void main(String[] args){
		Day1 a = new Day1();
		
		a.dayCheck(1);
		a.dayCheck(2);
		a.dayCheck(7);
		a.dayCheck(9);
		a.dayCheck(-1);

	}
}