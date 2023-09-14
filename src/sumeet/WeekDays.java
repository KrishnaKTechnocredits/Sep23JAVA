package sumeet;

class DayIndex{
	
	void dayIndex(int num){
		if(num>=1 && num<=5){
			System.out.println("Weekday");
			if(num==1)
				System.out.println("It is Monday");
			else if(num==2)
				System.out.println("It is Tuesday");
			else if(num==3)
				System.out.println("It is Wednesday");
			else if(num==4)
				System.out.println("It is Thursday");
			else if(num==5)
				System.out.println("It is Friday");
		}
		else if(num==6 || num==7){
			System.out.println("Weekend");
			if(num==6)
				System.out.println("Saturday");
			else
				System.out.println("Sunday");
		}else
			System.out.println("Invalid day index");
	}
	
	public static void main(String[] args){
		DayIndex day= new DayIndex();
		day.dayIndex(2);
		day.dayIndex(7);
		day.dayIndex(11);
		day.dayIndex(-3);
	}
}