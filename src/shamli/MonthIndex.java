/* Assignment - 9 : 6th Sep'2023
Print information about the Month based on the Month index. [Nested If else]
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
Month Name -> December */

package shamli;

class MonthIndex{
	
	void processData(int monthIndex){
		if(monthIndex>=1 && monthIndex<=3){
			System.out.println("Q1");
				if(monthIndex==1){
					System.out.println("Season : Winter");
					System.out.println("Month Name: January");
				}else if(monthIndex==2){
					System.out.println("Season : Summer");
					System.out.println("Month Name: February");
				}else if(monthIndex==3){
					System.out.println("Season : Summer");
					System.out.println("Month Name: March");
				}
		}else if(monthIndex>=4 && monthIndex<=6){
			System.out.println("Q2");
				if(monthIndex==4){
					System.out.println("Season : Summer");
					System.out.println("Month Name: April");
				}else if(monthIndex==5){
					System.out.println("Season : Summer");
					System.out.println("Month Name: May");
				}else if(monthIndex==6){
					System.out.println("Season : Rainy");
					System.out.println("Month Name: June");
				}
		}else if(monthIndex>=7 && monthIndex<=9){
			System.out.println("Q3");
				if(monthIndex==7){
					System.out.println("Season : Rainy");
					System.out.println("Month Name: July");
				}else if(monthIndex==8){
					System.out.println("Season : Rainy");
					System.out.println("Month Name: August");
				}else if(monthIndex==9){
					System.out.println("Season : Rainy");
					System.out.println("Month Name: Sept");
				}
		}else if(monthIndex>=10 && monthIndex<=12){
			System.out.println("Q4");
				if(monthIndex==10){
					System.out.println("Season : Winter");
					System.out.println("Month Name: Octobar");
				}else if(monthIndex==11){
					System.out.println("Season : Winter");
					System.out.println("Month Name: November");
				}else if(monthIndex==12){
					System.out.println("Season : Winter");
					System.out.println("Month Name: December");
				}
		}
		else{
			System.out.println("Invalid dayIndex");
		}
	}
	public static void main(String[] args){
		MonthIndex monthindex = new MonthIndex();
		monthindex.processData(4);
		monthindex.processData(12);
		monthindex.processData(-4);
		monthindex.processData(13);
	}
}