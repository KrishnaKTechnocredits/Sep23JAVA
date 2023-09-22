package sumeet;

public class Assignment10{
	
	void monthIndex(int index) {
		if(index<=12) {
			if(index>=1 && index<=3) {
				System.out.print("You are in Q1.");
				if(index==1)
					System.out.println("It is January and season is winter.");
				else if(index==2)
					System.out.println("It is February and season is Summer.");
				else
					System.out.println("It is March and season is Summer.");
			}else if(index>=4 && index<=6) {
				System.out.print("You are in Q2.");
				if(index==4)
					System.out.println("It is April and season is Summer.");
				else if(index==5)
					System.out.println("It is May and season is Summer.");
				else
					System.out.println("It is June and season is Monsoon.");
			}else if(index>=7 && index<=9) {
				System.out.print("You are in Q3.");
				if(index==7)
					System.out.println("It is July and season is Monsoon.");
				else if(index==8)
					System.out.println("It is August and season is Monsoon.");
				else
					System.out.println("It is September and season is Monsoon.");
			}else if(index>=10 && index<=12) {
				System.out.print("You are in Q4.");
				if(index==10)
					System.out.println("It is Octomber and season is Winter.");
				else if(index==11)
					System.out.println("It is November and season is Winter.");
				else
					System.out.println("It is December and season is Winter.");
		    }
	}else
		System.out.println("Invalid Index");
		
	}
	
	public static void main(String[] args) {
		Assignment10 month=new Assignment10();
		month.monthIndex(5);
		month.monthIndex(2);
		month.monthIndex(8);
		month.monthIndex(13);
	}
	

}
