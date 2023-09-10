package akshita;

class MonthIndex{
	void monthInfo(int month){
		if(month>0 && month<4){
			System.out.println("Quater is Q1");
			System.out.println("Season is Winter");
				if(month ==1){
					System.out.println("Month Name is January");
				}else if(month ==2){
					System.out.println("Month Name is February");
				}else
					System.out.println("Month Name is March");
		}else if(month>=4 && month<=6){
			System.out.println("Quater is Q2");
			System.out.println("Season is Summer");
				if(month == 4){
					System.out.println("Month Name is April");
				}else if(month == 5){
					System.out.println("Month Name is May");
				}else
					System.out.println("Month Name is June");
		}else if(month>=7 && month<=9){
			System.out.println("Quater is Q3");
			System.out.println("Season is Rainy");
				if(month == 7){
					System.out.println("Month Name is July");
				}else if(month == 8){
					System.out.println("Month Name is August");
				} else 
					System.out.println("Month Name is September");
		}else if(month>9 && month<=12){
			System.out.println("Quater is Q4");
			System.out.println("Season is Winter");
				if(month == 10){
					System.out.println("Month Name is October");
				}else if(month == 11){
					System.out.println("Month Name is November");
				} else 
					System.out.println("Month Name is December");
			}	 
    }
	public static void main(String[] args){
		MonthIndex monthIndex = new MonthIndex();
		monthIndex.monthInfo(1);
		monthIndex.monthInfo(2);
		monthIndex.monthInfo(12);
	}
}