package rabish;
class Months {
	
	void monthYear(int monthIndex){
		if(monthIndex>=1 && monthIndex<=4){
			System.out.println("Q1");
			System.out.println("Winter Month");
				if(monthIndex==1)
				System.out.println("January");
			}
				if(monthIndex>=9 && monthIndex<=12){
					System.out.println("Q4");
					System.out.println("Winter Month");
				}
					if(monthIndex==12){
						System.out.println("December");
				}
		}
	
	public static void main(String[] args){
	Months m=new Months();
	m.monthYear(1);
	m.monthYear(12);
	}
}