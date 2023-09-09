package swati;

//Assignment 10
class IndetifyMonth{
	
	void processData(int MonthIndex){
		if(MonthIndex>=1 && MonthIndex<=3){
			System.out.print("You are in QUARTER 1");
			if(MonthIndex==1){
				System.out.println(" JANUARY month and the season is WINTER");
			}else if(MonthIndex==2){
				System.out.println(" FEBRUARY month and the season is WINTER");
			}else{
				System.out.println(" MARCH month and the season is SUMMER");
			}
			
		}else if(MonthIndex>=4 && MonthIndex<=6){
			System.out.print("You are in Quarter 2");
			if(MonthIndex==4){
				System.out.println(" APRIL month and the season is SUMMER");
			}else if(MonthIndex==5){
				System.out.println(" MAY month and the season is SUMMER");
			}else{
				System.out.println(" JUNE month and the season is RAINY");
			}
			
		}else if(MonthIndex>=7 && MonthIndex<=9){
			System.out.print("You are in Quarter 3");
			if(MonthIndex==7){
				System.out.println(" JULY month and the season is RAINY");
			}else if(MonthIndex==8){
				System.out.println(" AUGUST month and the season is RAINY");
			}else{
				System.out.println(" SEPTEMBER month and the season is RAINY");
			}
			
		}else if(MonthIndex>=10 && MonthIndex<=12){
			System.out.print("You are in Quarter 4");
			if(MonthIndex==10){
				System.out.println(" OCTOBER month and the season is AUTUMN");
			}else if(MonthIndex==11){
				System.out.println(" NOVEMBER month and the season is AUTUMN");
			}else{
				System.out.println(" DECEMBER month and the season is WINTER");
			}
		}else{
			System.out.println("Invalid Month value privided");
		}
	}
	
	public static void main(String[] args){
		IndetifyMonth indetifymonth = new IndetifyMonth();
		indetifymonth.processData(1);
		indetifymonth.processData(5);
		indetifymonth.processData(7);
		indetifymonth.processData(10);
	}
}