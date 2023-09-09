package denish;

class Assignment10{
	
	void month(int index){
		if(index>=1 && index<=3){
			System.out.println("Q1 quarter");
			System.out.println("Winter");
			
			if(index==1)
				System.out.println("January");
			else if(index==2)
				System.out.println("February");
			else if(index==3)
				System.out.println("March");
		}
		
		else if(index>=4 && index<=6){
			System.out.println("Q2 quarter");
			System.out.println("Summer");
			
			if(index==4)
				System.out.println("April");
			else if(index==5)
				System.out.println("May");
			else if(index==6)
				System.out.println("June");
		}
		
		else if(index>=7 && index<=9){
			System.out.println("Q3 quarter");
			System.out.println("Moonsoon");
			
			if(index==7)
				System.out.println("July");
			else if(index==8)
				System.out.println("August");
			else if(index==9)
				System.out.println("September");
		}
		
		else if(index>=10 && index<=12){
			System.out.println("Q4 quarter");
			System.out.println("Autum");
			
			if(index==10)
				System.out.println("October");
			else if(index==11)
				System.out.println("November");
			else if(index==12)
				System.out.println("December");
		}
	}
	
	public static void main(String[] args){
		Assignment10 assignment10 = new Assignment10();
		assignment10.month(1);
		assignment10.month(2);
		assignment10.month(5);
		assignment10.month(8);
		assignment10.month(10);
		assignment10.month(12);
	}
}