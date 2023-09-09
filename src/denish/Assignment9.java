package denish;

class Assignment9{
	
	void weekDay(int day){
		if(day>=1 && day<=7){
			if(day>=1 && day<=5){
				System.out.println("WeekDay");
				if(day==1)
					System.out.println("Monday");
				else if(day==2)
					System.out.println("Tuesday");
				else if(day==3)
					System.out.println("Wednesday");
				else if(day==4)
					System.out.println("Thursday");
				else if(day==5)
					System.out.println("Friday");
			}
			
			else if(day>=6 && day<=7){
				System.out.println("Weekend");
				
				if(day==6)
					System.out.println("Saturday");
				else
					System.out.println("Sunday");
				}
		}
				else
					System.out.println("Invalid Index");
	}
	
		public static void main(String[] args){
			Assignment9 assignment9 = new Assignment9();
			assignment9.weekDay(2);
			assignment9.weekDay(6);
			assignment9.weekDay(15);
			assignment9.weekDay(-7);
		}
	
}