//Assignment - 9 : 6th Sep'2023
//Print information about the Month based on the Monday index. [Nested If else]
//
//input : 1
//output :
//Quarter -> Q1
//Season -> Winter
//Month Name -> January
//----------------------
//input : 2
//output : 
//Quarter -> Q1
//Season -> Winter
//Month Name -> February
//--------------------
//input : 12
//Quarter -> Q4
//Season -> Winter
//Month Name -> December
package harshada;
class MonthIndex{
	void processMonth(int month){
		if(month>=1 && month<=12){
			if(month>=1 && month<=3){
				System.out.println("Q1");
				if(month==1)
					System.out.println("January");
				else if(month==2)
					System.out.println("February");
				else if(month==3)
					System.out.println("March");
			}	
			else if(month>=4 && month<=6){
				System.out.println("Q2");
				if(month==4)
					System.out.println("April");
				else if(month==5)
					System.out.println("May");
				else if(month==6)
					System.out.println("June");
			}
			else if(month>=7 && month<=9){
				System.out.println("Q3");
				if(month==7)
					System.out.println("July");
				else if(month==8)
					System.out.println("August");
				else if(month==9)
					System.out.println("September");
			}
			else if(month>=10 && month<=12){
				System.out.println("Q4");
				if(month==10)
					System.out.println("October");
				else if(month==11)
					System.out.println("November");
				else if(month==12)
					System.out.println("December");			
			}	
		
			if(month>=3 && month<=6)
				System.out.println("Summer");
			else if(month>=7 && month<=10)
				System.out.println("Rainy");
			else if(month>=11|| month<=2)
				System.out.println("Winter");	
		}			
	}
	
	public static void main(String[]args){
		MonthIndex monthIndex=new MonthIndex();
		monthIndex.processMonth(1);
		monthIndex.processMonth(2);
		monthIndex.processMonth(12);
		monthIndex.processMonth(8);
	}
}