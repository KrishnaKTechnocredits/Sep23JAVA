package sakshi;

class IdentifyMonthIndex{
	
	void monthIndex(int monthIndex){
		if(monthIndex>=1 && monthIndex<=12){
			if(monthIndex>=1 && monthIndex<=4){
				System.out.println("Quarter -> Q1");
				if(monthIndex==1){
					System.out.println("Month is -> January and Season is Winter ");
				}else if(monthIndex==2){
					System.out.println("Month is -> Febuary and Season is Winter ");
				}else if(monthIndex==3){
					System.out.println("Month is -> March and Season is Summer ");
				}else if(monthIndex==4){
					System.out.println("Month is -> April and Season is Summer ");
				}
			}else if(monthIndex>=5 && monthIndex<=8){
				System.out.println("Quarter -> Q2");
				if(monthIndex==5){
					System.out.println("Month is -> May and Season is Summer ");
				}else if(monthIndex==6){
					System.out.println("Month is -> June and Season is Summer ");
				}else if(monthIndex==7){
					System.out.println("Month is -> July and Season is Rainy ");
				}else if(monthIndex==8){
					System.out.println("Month is -> August and Season is Rainy ");
				}
			}else if(monthIndex>=9 && monthIndex<=12){
				System.out.println("Quarter -> Q3");
				if(monthIndex==9){
					System.out.println("Month is -> September and Season is Rainy ");
				}else if(monthIndex==10){
					System.out.println("Month is -> October and Season is Rainy ");
				}else if(monthIndex==11){
					System.out.println("Month is -> November and Season is Winter ");
				}else if(monthIndex==12){
					System.out.println("Month is -> December and Season is Winter ");
				}
			}
				
		}else{
			System.out.println("Invalid month index");
		}
	}
	
	public static void main(String[] args){
		IdentifyMonthIndex identifyMonthIndex = new IdentifyMonthIndex();
		identifyMonthIndex.monthIndex(1);
		identifyMonthIndex.monthIndex(5);
		identifyMonthIndex.monthIndex(12);
		identifyMonthIndex.monthIndex(123);
	}

}