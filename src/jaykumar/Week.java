// Jaykumar Bankar - Assignment9
package jaykumar;

class Week{
	
	void processDay(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Weekday");
			if(dayIndex==1){
				System.out.println("Its Monday");
			}else if(dayIndex==2){
				System.out.println("Its Tuesday");
			}else if(dayIndex==3){
				System.out.println("Its Wednesday");
			}else if(dayIndex==4){
			System.out.println("Its Thursday");
			}else{
				System.out.println("Its Friday");
			}
		}else if(dayIndex==6 || dayIndex==7){
			System.out.println("Weekend");
			if(dayIndex==6){
				System.out.println("Its Saturday");
			}else{
				System.out.println("Its Sunday");
			}
		}else{
			System.out.println("Invalid Index");
		}
	}
	
	public static void main(String[] args){
		Week week = new Week();
		week.processDay(2);
		week.processDay(6);
		week.processDay(5);
		week.processDay(7);
		week.processDay(11);
		week.processDay(-3);
	}
}				