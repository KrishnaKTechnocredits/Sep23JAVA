/*Assignment - 10 : 6th Sep'2023
Print information about the Month based on the Monday index. [Nested If else]
input : 1
output :
Quarter -> Q1
Season -> Winter
Month Name -> January
----------------------
input : 2
output : 
Quarter -> Q1
Season -> Winter
Month Name -> February
--------------------
input : 12
Quarter -> Q4
Season -> Winter
Month Name -> December*/
package deepak;
class Month_Assignment10{
	void monthInfo(int monthIndex){
		if(monthIndex == 12 || monthIndex == 1 || monthIndex == 2){
			System.out.println("Quarter -> Q1");
			System.out.println("Season -> WINTER");
			if(monthIndex == 12)
				System.out.println("Month Name -> December");
			else if(monthIndex == 1)
				System.out.println("Month Name -> January");
			else if(monthIndex == 2)
				System.out.println("Month Name -> February");
		}else if(monthIndex == 3 || monthIndex == 4 || monthIndex == 5){
			System.out.println("Quarter -> Q2");
			System.out.println("Season -> SUMMER");
			if(monthIndex == 3)
				System.out.println("Month Name -> March");
			else if(monthIndex == 4)
				System.out.println("Month Name -> April");
			else if(monthIndex == 5)
				System.out.println("Month Name -> May");
		}else if(monthIndex == 6 || monthIndex == 7 || monthIndex == 8){
			System.out.println("Quarter -> Q3");
			System.out.println("Season -> MONSOON");
			if(monthIndex == 6)
				System.out.println("Month Name -> June");
			else if(monthIndex == 7)
				System.out.println("Month Name -> July");
			else if(monthIndex == 8)
				System.out.println("Month Name -> August");
		}else if(monthIndex == 9 || monthIndex == 10 || monthIndex == 11){
			System.out.println("Quarter -> Q4");
			System.out.println("Season -> AUTUMN");
			if(monthIndex == 9)
				System.out.println("Month Name -> September");
			else if(monthIndex == 10)
				System.out.println("Month Name -> October");
			else if(monthIndex == 11)
				System.out.println("Month Name -> November");
		}else
				System.out.println("Invalid month index entered");
	}
	
	public static void main(String[] args){
		Month_Assignment10 month = new Month_Assignment10();
		month.monthInfo(1);
		month.monthInfo(5);
		month.monthInfo(7);
		month.monthInfo(9);
		month.monthInfo(14);
		
	}
}