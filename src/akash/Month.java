package akash;

class Month{
	
	void processMonth(int monthIndex){
		if(monthIndex>=1 && monthIndex<=3){
			System.out.println("This is Q1 quarter");
			System.out.println("Winter");
			if(monthIndex==1)
				System.out.println("Month is january\n");
			else if(monthIndex==2)
				System.out.println("Month is february\n");
			else if(monthIndex==3)
				System.out.println("Month is march\n");
		}else if(monthIndex>=4 && monthIndex<=6){
			System.out.println("This is Q2 quarter");
			System.out.println("Summer");
			if(monthIndex==4)
				System.out.println("Month is april\n");
			else if(monthIndex==5)
				System.out.println("month is may\n");
			else if(monthIndex==6)
				System.out.println("month is june\n");
		}else if(monthIndex>=7 && monthIndex<=9){
			System.out.println("This is Q3 quarter");
			System.out.println("Mansoon");
			if(monthIndex==7)
				System.out.println("Month is july\n");
			else if(monthIndex==8)
				System.out.println("Month is august\n");
			else 
				System.out.println("Month is september\n");
		}else if(monthIndex>=9 && monthIndex<=12){
			System.out.println("This is Q4 quarter");
			System.out.println("Autum");
			if(monthIndex==10)
				System.out.println("Month is october\n");
			else if(monthIndex==11)
				System.out.println("Month is novembern");
			else 
				System.out.println("Month is december\n");
		}
	}
	
	public static void main(String[] args){
		Month month = new Month();
		month.processMonth(2);
		month.processMonth(5);
		month.processMonth(9);
		month.processMonth(12);
		month.processMonth(10);
	} 
}