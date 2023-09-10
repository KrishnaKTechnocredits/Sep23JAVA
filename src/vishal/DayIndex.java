package vishal;

class DayIndex{
	
	void weekDay(int day)
	{
		if(day>=1 && day<=7)
		{
			if(day>=1 && day<=5)
			{
			    System.out.println("Weekday");
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
			
			else if (day>=6 && day<=7)
			{
				System.out.println("Weekend");
				if(day==6)
					System.out.println("Saturday");
				else
					System.out.println("Sunday");
			}
		}
		else 
			System.out.println("Invalid index");	
	}
	
	public static void main(String[] arg)
	{
		DayIndex dayIndex = new DayIndex();
		dayIndex.weekDay(2);
		dayIndex.weekDay(6);
		dayIndex.weekDay(15);
		dayIndex.weekDay(-9);
	}
}
