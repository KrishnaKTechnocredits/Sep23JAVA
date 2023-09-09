// WAP to find weekdays or weekends based on dayIndex.

package sayali;

class IdentifyDay{
	
	void processData(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 5){
			System.out.println("\n It's a Weekday");
			
			if(dayIndex == 1){
				System.out.println("Monday");
			}
			if(dayIndex == 2){
				System.out.println("Tuesday");
			}
			if(dayIndex == 3){
				System.out.println("Wednesday");
			}
			if(dayIndex == 4){
				System.out.println("Thursday");
			}
			if(dayIndex == 5){
				System.out.println("Friday");
			}
		} else if(dayIndex == 6 || dayIndex == 7){
			System.out.println("\n Yeah, it's a Weekend !!");
			if(dayIndex == 6 ){
				System.out.println("It's a Saturday");
			}
			if(dayIndex == 7){
				System.out.println("It's a Sunday");
			}
		} else 
			System.out.println(dayIndex +  " is an Invalid Index");
	}
	
	public static void main(String[] args){
		IdentifyDay day =  new IdentifyDay();
		day.processData(2);
		day.processData(6);
		day.processData(11);
		day.processData(-3);
		day.processData(3);
		day.processData(-5);
	}
}