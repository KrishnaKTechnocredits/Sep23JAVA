package shrutika;
//Assignment 9
class DayIndex{
	
	void index(int num){
		if(num >= 1 && num <=5){
			System.out.println("\nIts a Weekday");
			if(num ==1){
				System.out.println("Its Monday");
			}
			if(num ==2){
				System.out.println("Its Tuesday");
			}
			if(num ==3){
				System.out.println("Its Wednesday");
			}
			if(num ==4){
				System.out.println("Its Thursday");
			}
			if(num ==5){
				System.out.println("Its Friday");
			}
		}else if(num==6 || num==7){
			System.out.println("\nIts a Weekend");
			if(num==6){
				System.out.println("Its Saturday");
			}
			if(num==7){
				System.out.println("Its Sunday");
			}
		} else {
			System.out.println("\n"+num + " its Invalid Index");
		}
	}
	
	public static void main(String[] args){
		DayIndex dayIndex = new DayIndex();
		dayIndex.index(1);
		dayIndex.index(6);
		dayIndex.index(11);
		dayIndex.index(-3);
	}
}