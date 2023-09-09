/*Assignment - 9 : 6th Sep'2023
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
Month Name -> December*/
//Assignment 10
class MonthsIndex{
	int index;
	String quarter;
	String season;
	void months(int index){
		if(index<=0 || index>12){
			System.out.println(index + " : Invalid data,Please check your data");
		}
		if(index>=1 && index<=12){		
				if(index>=1 && index<=4){
					quarter="Q1";
					season="Spring";
					if(index==1){
							System.out.println("1st month :" + index + " January" + quarter + " : Quarter and Enjoy-" + season +" Season");
					}else if(index==2){
							System.out.println("2nd month :" + index + " February" + quarter + " : Quarter and Enjoy-" + season + " Season");
					}else if(index==3){
							System.out.println("3rd month :" + index + " March" + quarter + " : Quarter and Enjoy-" + season + " Season");
					}else if(index==4){
							System.out.println("4th month :" + index + " April" + quarter + " : Quarter and Enjoy-" + season + " Season");
					}	
				}
				}if(index>=5 && index<=8){
						quarter="Q2";
						season="Rainy";
						if(index==5){
								System.out.println("5th month :" + index + " May" + quarter + " : Quarter and Enjoy-" + season + " Season");
						}else if(index==6){
								System.out.println("6th month :" + index + " June" + quarter +" : Quarter and Enjoy-" + season + " Season");
						}else if(index==7){
								System.out.println("7th month :" + index + " July" + quarter + " : Quarter and Enjoy-" + season + " Season");
						}else if(index==8){
								System.out.println("8th month :" + index + " August" + quarter + " : Quarter and Enjoy-" + season + " Season");
						}	
				}if(index>=9 && index<=12){
							quarter="Q3";
							season="Winter";
						//System.out.println("Weekday :" + index);
						if(index==9){
								System.out.println("9th month :" + index + " September" + quarter + " : Quarter and Enjoy-" + season + " Season");
						}else if(index==10){
								System.out.println("10th month :" + index + " Octuber" + quarter + " : Quarter and Enjoy-" + season + " Season");
						}else if(index==11){
								System.out.println("11th month :" + index + " November" + quarter + " : Quarter and Enjoy-" + season + " Season");
						}else if(index==12){
								System.out.println("12th month :" + index + " December" + quarter + " : Quarter and Enjoy-" + season + " Season");
						}
				}
	}
	public static void main(String[] args){
				MonthsIndex mnthIn = new MonthsIndex();
				mnthIn.months(1);
				mnthIn.months(2);
				mnthIn.months(3);
				mnthIn.months(4);
				mnthIn.months(5);
				mnthIn.months(6);
				mnthIn.months(7);
				mnthIn.months(8);
				mnthIn.months(9);
				mnthIn.months(10);
				mnthIn.months(11);
				mnthIn.months(12);
				mnthIn.months(-9);
			}
			
		}	