package aditya;	
class Example11{

	void displayMonth(int monthNo){
		if(monthNo>12 || monthNo<1){
			System.out.println(+monthNo+ " not in Range");
		}
			if(monthNo>0 && monthNo<4){
				System.out.println(" Month is in Quarter 1");
			}else if(monthNo>3 && monthNo<7){
				System.out.println(" Month is in Quarter 2");
			}else if(monthNo>6 && monthNo<10){
				System.out.println(" Month is in Quarter 3");
			}else if(monthNo>9 && monthNo<13){
				System.out.println(" Month is in Quarter 4");
			}
					if(monthNo==1){
						System.out.println("January month");
					}else if(monthNo==2){
						System.out.println("Feb Month");
					}else if(monthNo==3){
						System.out.println("March Month");
					}
					else if(monthNo==4){
						System.out.println("March month");
					}else if(monthNo==5){
						System.out.println("May Month");
					}else if(monthNo==6){
						System.out.println("June Month");
					}else if(monthNo==7){
						System.out.println("July month");
					}else if(monthNo==8){
						System.out.println("August Month");
					}else if(monthNo==9){
						System.out.println("September Month");
					}else if(monthNo==10){
						System.out.println("October month");
					}else if(monthNo==11){
						System.out.println("November Month");
					}else if(monthNo==12){
						System.out.println("December Month");
					}
		}
			
		public static void main(String[] args){
			Example11 example11 = new Example11();
			example11.displayMonth(13);
			example11.displayMonth(2);
			example11.displayMonth(5);
			example11.displayMonth(8);
			example11.displayMonth(10);
			example11.displayMonth(0);
		
	}	
}