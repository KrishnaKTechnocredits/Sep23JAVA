/*
 Assignment - 10 : 6th Sep'2023
Print information about the Month based on the Monday index. [Nested If else]

input : 1
output :
Quarter -> Q1
Season -> Winter
Month Name -> January
----------------------
input : 2
output : 
Quarter -> Q1
Season -> Winter
Month Name -> February
--------------------
input : 12
Quarter -> Q4
Season -> Winter
Month Name -> December

 */

package nivedita;
class A10MonthDetails{
	void proccessData(int monthIndex){
		if(monthIndex >=1 && monthIndex<=12){
		if(monthIndex >=1 && monthIndex<=4){
			System.out.println("This is quarter 1 & monthIndex is :" +monthIndex);
			 if(monthIndex==1){
			    System.out.println("January Month : Winter Season");
			 }else if(monthIndex==2){
			    System.out.println("February Month : Winter Season");
			 }else if(monthIndex==3){
			    System.out.println("March Month : Summer Season");
			 }else if(monthIndex==4){
			    System.out.println("April Month : Summer Season");
			 }
		}			
		if(monthIndex >=5 && monthIndex<=8){
			System.out.println("This is quarter 2 & monthIndex is : " +monthIndex);
			 if(monthIndex==5){
			    System.out.println("May Month : Summer Season");
			 }else if(monthIndex==6){
			    System.out.println("June Month : Summer Season");
			 }else if(monthIndex==7){
			    System.out.println("July Month : Rainy Season");
			 }else if(monthIndex==8){
			    System.out.println("August Month : Rainy Season");
			}
		}
		if(monthIndex >=9 && monthIndex<=12){
			System.out.println("This is quarter 3 & monthIndex is : " +monthIndex);
			if(monthIndex==9){
			System.out.println("September Month : Rainy Season");
			}else if(monthIndex==10){
			System.out.println("October Month : Rainy Season");
			}else if(monthIndex==11){
			System.out.println("November Month : Winter Season");
			}else if(monthIndex==12){
			System.out.println("December Month : Summer Season");
			}
		}
		}
		else{ 
			System.out.println("Invalid Month Index :" +monthIndex);
		}
	}
	public static void main(String[] args){
		A10MonthDetails monthdetails = new A10MonthDetails();
		monthdetails.proccessData(3);
		monthdetails.proccessData(8);
		monthdetails.proccessData(11);
		monthdetails.proccessData(17);
		}
}	
