//Assignment - 9 : 6th Sep'2023
package roshani;

class MonthCheck{
	
	void processData(int monthIndex){
		if(monthIndex >= 1 && monthIndex <= 3){
			System.out.println("\nThis is Q1 quarter.");
			if(monthIndex ==1){
				System.out.println("Its Winter!");
				System.out.println("Month is January.");
			}else if(monthIndex == 2){
				System.out.println("Its Winter!");
				System.out.println("Month is February.");
			}else if(monthIndex == 3){
				System.out.println("Its Winter!");
				System.out.println("Month is March.");
			}
		}else if(monthIndex >= 4 && monthIndex <= 6){
			System.out.println("\nThis is Q2 quarter.");
			if(monthIndex ==4){
				System.out.println("Its Summer!");
				System.out.println("Month is April.");
			}else if(monthIndex == 5){
				System.out.println("Its Summer!");
				System.out.println("Month is May.");
			}else if(monthIndex == 6){
				System.out.println("Its Summer!");
				System.out.println("Month is June.");
			}
		}else if(monthIndex >= 7 && monthIndex <= 9){
			System.out.println("\nThis is Q3 quarter.");
			if(monthIndex ==7){
				System.out.println("Its Mansoon!");
				System.out.println("Month is July.");
			}else if(monthIndex == 8){
				System.out.println("Its Mansoon!");
				System.out.println("Month is August.");
			}else if(monthIndex == 9){
				System.out.println("Its Mansoon!");
				System.out.println("Month is September.");
			}
		}else if(monthIndex >= 10 && monthIndex <= 12){
			System.out.println("\nThis is Q4 quarter.");
			if(monthIndex ==10){
				System.out.println("Its Autumn!");
				System.out.println("Month is October.");
			}else if(monthIndex == 11){
				System.out.println("Its Autumn!");
				System.out.println("Month is November.");
			}else if(monthIndex == 12){
				System.out.println("Its Autumn!");
				System.out.println("Month is December.");
			}
		}else{
			System.out.println("\nInvalid month index!");
		}
	}
	
	public static void main(String[] args){
		MonthCheck monthcheck = new MonthCheck();
		monthcheck.processData(1);
		monthcheck.processData(2);
		monthcheck.processData(12);
	}
}