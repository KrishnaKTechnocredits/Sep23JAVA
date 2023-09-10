// WAP to print information about month based on the monthIndex.using nested if else.

package sayali;

class MonthInfo{
	
	void displayMonth(int monthIndex){
		if(monthIndex >= 1 && monthIndex <= 3){
			System.out.println("\n Quarter -> Q1");
			System.out.println("Season -> Winter");
			
			if(monthIndex == 1)
				System.out.println("Month Name -> January");
			else if(monthIndex == 2)
				System.out.println("Month Name -> February");
			else if(monthIndex == 3)
				System.out.println("Month Name -> March");
			}
			
		else if(monthIndex >= 4 && monthIndex <= 6){
			System.out.println("\n Quarter -> Q2");
			System.out.println("Season -> Summer");
			
			if(monthIndex == 4)
				System.out.println("\n Month -> April");
			else if(monthIndex == 5)
				System.out.println("\n Month -> May");
			if(monthIndex == 6)
				System.out.println("\n Month -> June");		
		}
		
		else if(monthIndex >= 7 && monthIndex <= 9){
			System.out.println("\n Quarter -> Q3");
			System.out.println("Season -> Monsoon");
			
			if(monthIndex == 7)
				System.out.println("Month Name -> July");
			else if(monthIndex == 8)
				System.out.println("Month Name -> August");
			else if(monthIndex == 9)
				System.out.println("Month Name -> September");
		}
		
		else if(monthIndex >= 10 && monthIndex <= 12){
			System.out.println("\n Quarter -> Q4");
			System.out.println("Season -> Winter");
			
			if(monthIndex == 10)
				System.out.println("Month Name -> October");
			else if(monthIndex == 11)
				System.out.println("Month Name -> November");
			else if(monthIndex == 12)
				System.out.println("Month Name -> December");			
		}
	}
	
	public static void main(String[] args){
		MonthInfo month =  new MonthInfo();
		month.displayMonth(1);
		month.displayMonth(2);
		month.displayMonth(12);
	}
}