package shrutika;
//Assignment 10
class MonthIndex{
	
	void index(int month){
		if (month >=1 && month <=4){
			System.out.println("Your are in Q1 Quarter and in Summer reason");
			if(month==1){
				System.out.println("Your are in January Month");
			}
			if(month==2){
				System.out.println("Your are in February Month");
			}
			if(month==3){
				System.out.println("Your are in March Month");
			}
			if(month==4){
				System.out.println("Your are in April Month");
			}
		}else if(month >4 && month <=8){
			System.out.println("Your are in Q2 Quarter and in Rainy reason");
			if(month==5){
				System.out.println("Your are in May Month");
			}
			if(month==6){
				System.out.println("Your are in June Month");
			}
			if(month==7){
				System.out.println("Your are in July Month");
			}
			if(month==8){
				System.out.println("Your are in August Month");
			}
		}else if(month >8 && month <=12){
			System.out.println("Your are in Q3 Quarter and in Winter reason");
			if(month==9){
				System.out.println("Your are in September Month");
			}
			if(month==10){
				System.out.println("Your are in October Month");
			}
			if(month==11){
				System.out.println("Your are in November Month");
			}
			if(month==12){
				System.out.println("Your are in December Month");
			}
		} else {
			System.out.println("Invalid Month entered");
		}
	}
	
	public static void main(String[] args){
		MonthIndex	monthIndex = new MonthIndex();
		monthIndex.index(1);
		monthIndex.index(7);
		monthIndex.index(12);
		monthIndex.index(15);
	}
}