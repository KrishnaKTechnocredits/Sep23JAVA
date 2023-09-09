//Assignment 9
package mayank;


class monthSeason{
	
	void month(int monthIndex){
		if(monthIndex>=1 && monthIndex<=3){
			System.out.println("This is Quarter Q1 ");
			if(monthIndex == 1){
				System.out.println(" Month is January");
				System.out.println(" Its winter season ");
			}else if (monthIndex == 2){
				System.out.println(" Month is Feburary");
				System.out.println(" Its winter season ");
			}else if (monthIndex == 3){
				System.out.println(" Month is march");
				System.out.println(" Its summer season ");
			}
		}else if (monthIndex>=4 && monthIndex<=6){
				System.out.println(" This is Quarter Q2");
				if (monthIndex==4){
						System.out.println(" Month is April");
						System.out.println(" Its Summer season");
				}else if (monthIndex==5){
						System.out.println(" Month is May");
						System.out.println(" Its Summer season");		
				}else if (monthIndex==6){
						System.out.println(" Month is Lune");
						System.out.println(" Its rainy season");
				}	
		}else if (monthIndex>=7 && monthIndex<=9){
				System.out.println(" This is Quarter Q3");
				if (monthIndex==7){
						System.out.println(" Month is July");
						System.out.println(" Its Rainy season");
				}else if (monthIndex==8){
						System.out.println(" Month is August");
						System.out.println(" Its Rainy season");		
				}else if (monthIndex==9){
						System.out.println(" Month is Sepetember");
						System.out.println(" Its Rainy season");
				}
		}else if (monthIndex>=10 && monthIndex<=12){
				System.out.println(" This is Quarter Q4");
				if (monthIndex==10){
						System.out.println(" Month is Octomber");
						System.out.println(" Its Autumn season");
				}else if (monthIndex==11){
						System.out.println(" Month is November");
						System.out.println(" Its Winter season");		
				}else if (monthIndex==6){
						System.out.println(" Month is December");
						System.out.println(" Its Winter season");
				}					
		}else{
			System.out.println(" Invalid Input plz enter Valid input");
		}
	}
	
	public static void main(String[] args){
		monthSeason monthseason = new monthSeason();
		monthseason.month(3);
		monthseason.month(2);
		monthseason.month(5);
		monthseason.month(9);
		monthseason.month(13);
	}
}	
