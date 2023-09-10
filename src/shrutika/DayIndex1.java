package shrutika;
//Assignment 9
class DayIndex1{
	
	void index(int num){
		if(num >= 1 && num <=5){
			System.out.println("\nIts a Weekday");
		}else if(num==6 || num==7){
			System.out.println("\nIts a Weekend");
		}
		if(num == 1){
			System.out.println(num+" Its Monday");
			}else if(num == 2){
				System.out.println(num+" Its Tuesday");
			}else if(num == 3){
				System.out.println(num+" Its Wednesday");
			}else if(num == 4){
				System.out.println(num+" Its Thursday");
			}else if(num == 5){
				System.out.println(num+" Its Friday");
			}else if(num == 6){
				System.out.println(num+" Its Saturday");
			}else if(num == 7){
				System.out.println(num+" Its Sunday");
			}else {
			System.out.println("\n"+num + " its Invalid Index");
		}
	}
	
	public static void main(String[] args){
		DayIndex1 dayIndex1 = new DayIndex1();
		dayIndex1.index(1);
		dayIndex1.index(6);
		dayIndex1.index(11);
		dayIndex1.index(-3);
	}
}
