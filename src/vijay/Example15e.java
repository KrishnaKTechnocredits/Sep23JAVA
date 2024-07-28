package vijay;

class Example15e{

	void processData(int dayIndex){
	
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Weekday");
			if(dayIndex==1){
				System.out.println("Monday");
			}else if(dayIndex==2){
				System.out.println("Tuesday");
			}else if(dayIndex==3){
				System.out.println("Wednesday");
			}else if(dayIndex==4){
				System.out.println("Thursday");
			}else if(dayIndex==5){
				System.out.println("Friday");
			}
		}else if(dayIndex==6 || dayIndex==7){
			System.out.println("Weekend");
			if(dayIndex==6)
				System.out.println("Saturday");
			else if(dayIndex==7)
				System.out.println("Sunday");
		}else{
			System.out.println("Invalid dayIndex");
		}
	}
	
	public static void main (String[] args){
		Example15e example15e = new Example15e();
		example15e.processData(1);
	}
}

// above Example15e is the example of nested if else.