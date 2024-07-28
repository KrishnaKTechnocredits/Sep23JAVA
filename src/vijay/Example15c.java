package vijay;

class Example15c{

	void processData(int dayIndex){
		if (dayIndex>=1 && dayIndex<=5){
			System.out.println("Weekday");
		}else if(dayIndex==6 || dayIndex==7){
			System.out.println("Weekend");
		}
		
		if (dayIndex==1){
			System.out.println("Monday");
		}else if(dayIndex==2){
			System.out.println("Tuesday");
		}else if(dayIndex==3){
			System.out.println("Wednesday");
		}else if (dayIndex==4){
			System.out.println("Thursday");
		}else if(dayIndex==5){
			System.out.println("Friday");
		}else if(dayIndex==6){
			System.out.println("Saturday");
		}else if(dayIndex==7){
			System.out.println("Sunday");
		}
	}
	
	public static void main (String[] args){
		Example15c example15c = new Example15c();
		example15c.processData(2);
	}
}

// for more than one SOP statements {} are compulsory in if elase block.
// in above Example15c example comparizon is twice, but the quality of code is good.