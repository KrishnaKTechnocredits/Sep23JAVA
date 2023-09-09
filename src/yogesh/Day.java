//Assignment 9
package yogesh;
class Day{
	
	void dayIndex(int num){
		if(num>=1 && num<=5){
			System.out.println("Weekday");
		if(num==1)
			System.out.println("Its a Monday");
		else if(num==2)
			System.out.println("Its a Tuesday");
		else if(num==3)
			System.out.println("Its a Wednesday");
		else if(num==4)
			System.out.println("Its a Thursday");
		else if(num==5)
			System.out.println("Its a Friday");
		}
		else if(num==6 || num==7){
			System.out.println("Weekend");
		if(num==6)
			System.out.println("Its a Saturday");
		else
			System.out.println("Its a Sunday");
		}
		else
			System.out.println("Invalied Input");
	}
	
		public static void main(String[] args){
			Day day=new Day();
			day.dayIndex(2);
			day.dayIndex(6);
			day.dayIndex(-3);
			day.dayIndex(11);
		}

}