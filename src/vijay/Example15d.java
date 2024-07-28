package vijay;

class Example15d{

	void processData(int dayIndex){
		if (dayIndex==1){
			System.out.println("Weekday");
			System.out.println("Monday");
		}else if(dayIndex==2){
			System.out.println("Weekday");
			System.out.println("Tuesday");
		}else if(dayIndex==3){
			System.out.println("Weekday");
			System.out.println("Wednesday");
		}else if (dayIndex==4){
			System.out.println("Weekday");
			System.out.println("Thursday");
		}else if(dayIndex==5){
			System.out.println("Weekday");
			System.out.println("Friday");
		}else if(dayIndex==6){
			System.out.println("Weekend");
			System.out.println("Saturday");
		}else if(dayIndex==7){
			System.out.println("Weekend");
			System.out.println("Sunday");
		}
	}
	
	public static void main (String[] args){
		Example15d example15d = new Example15d();
		example15d.processData(2);
	}
}

// for more than one SOP statements {} are compulsory in if elase block.
// in above Example15d example comparizon is once, but the quality of code is not good as compare to Example15c.