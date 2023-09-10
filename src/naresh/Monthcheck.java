package naresh;

class Monthcheck{
	
	
	void month1(int value){
		if(value>=1 && value<=12)
		{
			if(value>=1 && value<=3)
			{
				System.out.println("Q1 Quarter");
				System.out.println("Winter");
					if(value==1)
					{
					System.out.println("January");
					}
					else if(value==2)
					{
					System.out.println("February");
					}
					else if(value==3)
					{
					System.out.println("March");
					}
			}
			else if (value>=4 && value<=6)
			{
			System.out.println("Q2 Quarter");
			System.out.println("Summer");
				if (value==4)
				{
				System.out.println("April");
				}
				if (value==5)
				{
				System.out.println("May");
				}
				if (value==6)
				{
				System.out.println("June");
				}
			}	
			else if (value>=7 && value<=9)
			{
			System.out.println("Q3 Quarter");
			System.out.println("Rainy");
				if (value==7)
				{
				System.out.println("July");
				}
				if (value==8)
				{
				System.out.println("August");
				}
				if (value==9)
				{
				System.out.println("Sept");
				}
			}
			else if (value>=10 && value<=12)
			{
			 System.out.println("Q4 Quarter");
			 System.out.println("Winter");
				if (value==10)
				{
				 System.out.println("Oct");
				}
				if (value==11)
				{
				 System.out.println("Nov");
				}
				if (value==12)
				{
				 System.out.println("Dec");
				}
			}
				
		}
		else 
		{
		System.out.println("invalid month")	;
		}
			
	}					
	public static void main(String[] args){
	Monthcheck m=new Monthcheck();
	m.month1(1);
	m.month1(2);
	m.month1(12);
	m.month1(13);
			
	}
	}	
			
			
			
			
			
			
			