// Jaykumar  Bnakr - Assignment 10
package jaykumar;

class Month{
	
	void processMonth(int monthIndex){
		if(monthIndex>=1 && monthIndex<=3){
			System.out.println("\n"+"Quarter is Q1");
			if(monthIndex==2 || monthIndex==3){
				System.out.println("Season is Summer");
			}else{
				System.out.println("Season is Winter");
			}
			if(monthIndex==1){
				System.out.println("Month is January");
			}else if(monthIndex==2){
				System.out.println("Month is February");
			}else{
				System.out.println("Month is March");
			}
		}else if(monthIndex>=4 && monthIndex<=6){
			System.out.println("\n"+"Quarter is Q2");
			if(monthIndex==4 || monthIndex<=5){
				System.out.println("Season is Summer");
			}else{
				System.out.println("Season is Rainy");
			}
			if(monthIndex==4){
				System.out.println("Month is April");
			}else if(monthIndex==5){
				System.out.println("Month is May");
			}else{
				System.out.println("Month is June");
			}
		}else if(monthIndex>=7 && monthIndex<=9){
			System.out.println("\n"+"Quarter is Q3");
			System.out.println("Season is Rainy");
			if(monthIndex==7){
				System.out.println("Month is July");
			}else if(monthIndex==8){
				System.out.println("Month is August");
			}else{
				System.out.println("Month is September");
			}
		}else if(monthIndex>=10 && monthIndex<=12){
			System.out.println("\n"+"Quarter is Q4");
			System.out.println("Season is Winter");
			if(monthIndex==7){
				System.out.println("Month is October");
			}else if(monthIndex==8){
				System.out.println("Month is November");
			}else{
				System.out.println("Month is December");
			}
		}else{
			System.out.println("\n"+"Invalid month index");
		}
	}
	
	public static void main(String[] args){
		Month month = new Month();
		month.processMonth(1);
		month.processMonth(2);
		month.processMonth(6);
		month.processMonth(8);
		month.processMonth(12);
		month.processMonth(13);
	}
}
		

		