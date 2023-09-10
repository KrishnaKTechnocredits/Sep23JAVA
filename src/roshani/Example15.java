package roshani;

class Example15{
	
	void proccessData(int dayIndex){
		if(dayIndex==1){
			System.out.println("Monday");
		}
		if(dayIndex==2){
			System.out.println("Tuesday");
		}
		if(dayIndex==7){
			System.out.println("Sunday");
		}
	}
	
	void proccessData1(int dayIndex){
		if(dayIndex >=1 && dayIndex<=5){
			System.out.println("Weekday");
		}else if(dayIndex ==6 || dayIndex==7){
			System.out.println("Weekend");
		}
		
		if(dayIndex==1){
			System.out.println("Monday");
		}else if(dayIndex==2){
			System.out.println("Tuesday");
		}else if(dayIndex==7){
			System.out.println("Sunday");
		}
	}
	
	void proccessData2(int dayIndex){
		if(dayIndex >=1 && dayIndex<=5){
			System.out.println("Weekday");
		}else if(dayIndex ==6 || dayIndex==7){
			System.out.println("Weekend");
		}
		
		if(dayIndex==1){
			System.out.println("Weekday");
			System.out.println("Monday");
		}else if(dayIndex==2){
			System.out.println("Tuesday");
		}else if(dayIndex==7){
			System.out.println("Sunday");
		}
	}
	
	public static void main(String[] args){
		Example15 example15 = new Example15();
		example15.proccessData(1);
		example15.proccessData1(1);
	}
}