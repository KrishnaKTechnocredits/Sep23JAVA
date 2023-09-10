package aditya;
class Example12{

		void DisplayInfo(int dayno){
				if(dayno >= 1 && dayno <= 5){
					System.out.println("This is the weekdays");
				}else if(dayno==6 || dayno==7){
					System.out.println("this is weekend");
				}
				
					if(dayno == 1){
						System.out.println("It is Monday");
					}
					else if(dayno==2){
						System.out.println(" This is Tuesday");
					}
					else if(dayno==3){
						System.out.println(" This is Wednesday");
					}
					else if(dayno==4){
						System.out.println(" This is Thursday");
					}
					else if(dayno==5){
						System.out.println(" This is Friday");
					}
					else if(dayno==6){
						System.out.println("This is saturday");
					}else if(dayno==7){
						System.out.println("This is sunday");
					}
				else{
					System.out.println("Invalid");
				}	
			}
		
			
		public static void main(String[] args){
		Example12 example12 =new Example12();
		example12.DisplayInfo(0);
		example12.DisplayInfo(2);
		example12.DisplayInfo(7);
		example12.DisplayInfo(4);
		example12.DisplayInfo(6);
		}
}