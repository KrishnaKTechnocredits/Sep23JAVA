package subramanium;
class Days{
	
	void displayDays(int dayIndex){
		if(dayIndex>0 && dayIndex<6){
		System.out.println("Its Weekday");
			
			if(dayIndex==1){
			System.out.println("Its Monday");
			}
			else if(dayIndex==2){
			System.out.println("Its Tuesday");
			}
			else if(dayIndex==3){
			System.out.println("Its Wednesday");
			}
			else if(dayIndex==4){
			System.out.println("Its Thursday");
			}
			else if(dayIndex==5){
			System.out.println("Its Friday");
			}
		}
		else if(dayIndex==6 || dayIndex==7){
		System.out.println("Its Weekend");
			if(dayIndex==6){
				System.out.println("Its Saturday");
			}
			else if(dayIndex==7){
				System.out.println("Its Sunday");
			}
		}
		else{
		System.out.println("Invalid Day Index");
		}
	}
		public static void main(String[]args){
		Days days=new Days();
		days.displayDays(2);
		days.displayDays(4);
		days.displayDays(5);
		days.displayDays(7);
		days.displayDays(9);
		}
	}	
		