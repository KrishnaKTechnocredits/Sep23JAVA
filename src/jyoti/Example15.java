class Example15{

	/*void processData(int dayIndex){
		
		if(dayIndex==1){
			System.out.println("Monday");
			//System.out.println("2 Credits");//else without if block complilation ero
		}
		else	
			System.out.println("Techno");
			System.out.println("Credits");
		
	}
	*/
	
	//1 to 5 weekday ,6-7 weekend
	
	void processData1(int dayIndex){
		if(dayIndex >=1 && dayIndex<=5){
			System.out.println("Weekday");
			if(dayIndex==1){ // nested if
				System.out.println("Monday");
			}else if(dayIndex==2){
				System.out.println("Tuesday");
			}else if(dayIndex==3){
				System.out.println("Wednesday");
			}
		}else if(dayIndex>= 6 && dayIndex <=7){
			System.out.println("weekend");
			if(dayIndex==6){ // nested if
				System.out.println("Saturday");
			}else
				System.out.println("Sunday");
		}else{
			System.out.println("Invalid Index");
		}
	}	
		
		
		/*if(dayIndex==1){
			System.out.println("Monday");
			//System.out.println("2 Credits");//else without if block complilation ero
		}
		else	
			System.out.println("Techno");
			System.out.println("Credits");
		*/
	
	
	
	public static void main(String[] args)
	{
		Example15 example15 = new Example15();
		example15.processData1(1);
		example15.processData1(6);
		
	}

}