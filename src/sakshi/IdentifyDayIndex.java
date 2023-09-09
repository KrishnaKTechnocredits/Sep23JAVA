package sakshi;

class IdentifyDayIndex{
	
	void dayIndex(int dayIndex){
		if(dayIndex >=1 && dayIndex<=5){
			System.out.println("Weekday");
				if(dayIndex==1){
					System.out.println("It's a Monday");
				} else if(dayIndex==2){
					System.out.println("It's a Tuesday");
				}else if(dayIndex==3){
					System.out.println("It's a Wednesday");
				}
				else if(dayIndex==4){
					System.out.println("It's a Thursday");
				}else if(dayIndex==5){
					System.out.println("It's a Friday");
				}
			}else if(dayIndex ==6 || dayIndex==7){
				System.out.println("Weekday");	
				if(dayIndex==6){
					System.out.println("It's a Saturday");	
				}else if(dayIndex==7){
					System.out.println("It's a Sunday");
				}
			}else{
				System.out.println("Invalid Index");
			}
	}

	public static void main(String[] args){
		IdentifyDayIndex identifyDayIndex = new IdentifyDayIndex();
		identifyDayIndex.dayIndex(2);
		identifyDayIndex.dayIndex(6);
		identifyDayIndex.dayIndex(11);
		identifyDayIndex.dayIndex(-3);
	}
}

