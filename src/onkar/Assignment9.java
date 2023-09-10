package onkar;

class Assignment9{
	
	void findMonth(int monthIndex){
		if (monthIndex == 1 || monthIndex == 2 || monthIndex ==11 || monthIndex == 12){
			System.out.println("It is Winter Season");
			if (monthIndex == 1 || monthIndex == 2){
				System.out.println("It is Q1");
				if(monthIndex == 1)
					System.out.println("It is January month");
				else
					System.out.println("It is February month");
			}else{
				System.out.println("It is Q4");
				if(monthIndex == 11)
					System.out.println("It is November month");
				else
					System.out.println("It is December month");
			}
		}
		if (monthIndex >= 3 && monthIndex <= 6){
			System.out.println("It is Summer Season");
			if (monthIndex == 3){
				System.out.println("It is Q1");
				System.out.println("It is March month");
			}else{
				System.out.println("It is Q2");
				if(monthIndex == 4)
					System.out.println("It is April month");
				else if(monthIndex == 5)
					System.out.println("It is May month");
				else 
					System.out.println("It is June month");
			}
		}
		if (monthIndex >= 7 && monthIndex <= 10){
			System.out.println("It is Rainy Season");
			if (monthIndex == 10){
				System.out.println("It is Q4");
				System.out.println("It is October month");
			}else{
				System.out.println("It is Q3");
				if(monthIndex == 7)
					System.out.println("It is July month");
				else if(monthIndex == 8)
					System.out.println("It is August month");
				else 
					System.out.println("It is September month");
			}
		}
	}
	
	public static void main(String[] args){
		Assignment9 assignment9 = new Assignment9();
		assignment9.findMonth(2);
		assignment9.findMonth(12);
		assignment9.findMonth(4);
		assignment9.findMonth(8);
		assignment9.findMonth(10);
	}
}