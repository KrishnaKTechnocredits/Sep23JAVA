package hetal;

class Weekday{

        void printData(int dayIndex){
			if(dayIndex == 1){
				System.out.println("weekday");
				System.out.println("its monday");
			}else if(dayIndex == 2){
				System.out.println("weekday");
				System.out.println("its tuesday");
			}else if(dayIndex == 3){
				System.out.println("weekday");
				System.out.println("its wednesday");
		    }else if(dayIndex == 4){
				System.out.println("weekday");
				System.out.println("its thursday");
			}else if(dayIndex == 5){
				System.out.println("weekday");
				System.out.println("its friday");
			}else if(dayIndex == 6){
				System.out.println("weekend");
				System.out.println("its saturday");
			}else if(dayIndex == 7){
				System.out.println("weekend");
				System.out.println("its sunday");
			}else{
			     System.out.println("invalid day index");
			}
		}
		public static void main(String[] args){
			Weekday weekday = new Weekday();
			weekday.printData(2);
			weekday.printData(6);
			weekday.printData(11);
			weekday.printData(-3);
			
		}
			
					
}



