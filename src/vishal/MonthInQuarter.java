package vishal;

class MonthInQuarter{
	
	void processData(int monthIndex){
		if(monthIndex>=1 && monthIndex<=3)
		{
			System.out.println("This is a Quarter Q1");
			if(monthIndex == 1)
			{
				System.out.println("This is Winter !!!");
				System.out.println("January Month");
			}
			else if (monthIndex == 2)
			{
				System.out.println("This is Winter !!!");
				System.out.println("February Month");
			}
			else if (monthIndex == 3)
			{
				System.out.println("This is Winter !!!");
				System.out.println("March Month");
			}								
		}   
		else if (monthIndex>=4 && monthIndex<=6)
		{
			System.out.println("This is a Quarter Q2");
			if(monthIndex == 4)
			{
				System.out.println("This is Summer !!!");
				System.out.println("April Month");
			}
			else if (monthIndex == 5)
			{
				System.out.println("This is Summer !!!");
				System.out.println("May Month");			
			}
			else if (monthIndex == 6)
			{
			    System.out.println("This is Summer !!!");
				System.out.println("June Month");
			}
		}			
		else if (monthIndex>=7 && monthIndex<=9)
		{
			System.out.println("This is a Quarter Q3");
			if(monthIndex == 7)
			{
				System.out.println("This is Mansoon !!!");
				System.out.println("July Month");
			}
			else if (monthIndex == 8)
			{
				System.out.println("This is Mansoon !!!");
				System.out.println("August Month");			
			}
			else if (monthIndex == 9)
			{
			    System.out.println("This is Mansoon !!!");
				System.out.println("September Month");
			}
		}
		else if (monthIndex>=10 && monthIndex<=12)
		{
			System.out.println("This is a Quarter Q4");
			if(monthIndex == 10)
			{
				System.out.println("This is Autumn !!!");
				System.out.println("October Month");
			}
			else if (monthIndex == 11)
			{
				System.out.println("This is Autumn !!!");
				System.out.println("November Month");			
			}
			else if (monthIndex == 12)
			{
			    System.out.println("This is Autumn !!!");
				System.out.println("December Month");
			}
		}
		else 
		{
			System.out.println("Invalid Month Index");
		}	
	}
	
		public static void main(String[] arg)
	{
		MonthInQuarter monthInQuarter = new MonthInQuarter();
		monthInQuarter.processData(1);
		monthInQuarter.processData(5);
		monthInQuarter.processData(8);
		monthInQuarter.processData(12);
	}
}