//Assignment 10

package yogesh;
class Month{
	void quarter(int q){
		if(q==1||q==2||q==3)
		{
			System.out.println("Q1");
			if(q==1)
			{
				System.out.println("January");
				System.out.println("Winter Season");
			}
			else if(q==2)
			{
				System.out.println("February");
				System.out.println("Winter Season");
			}
			else if(q==3)
			{
				System.out.println("March");
				System.out.println("Winter Season");
			}
		}
		else if(q==4||q==5||q==6)
		{
			System.out.println("Q2");
				if(q==4)
			{
				System.out.println("April");
				System.out.println("Summer Season");
			}
			else if(q==5)
			{
				System.out.println("May");
				System.out.println("Summer Season");
			}
			else if(q==6)
			{
				System.out.println("June");
				System.out.println("Rainy Season");
			}
		}
		else if(q==7||q==8||q==9)
		{
			System.out.println("Q3");
				if(q==7)
			{
				System.out.println("July");
				System.out.println("Rainy Season");
			}
			else if(q==8)
			{
				System.out.println("August");
				System.out.println("Rainy Season");
			}
			else if(q==9)
			{
				System.out.println("September");
				System.out.println("Rainy Season");
			}
		}
		else if(q==10||q==11||q==12)
		{
			System.out.println("Q4");
				if(q==10)
			{
				System.out.println("October");
				System.out.println("Winter Season");
			}
			else if(q==11)
			{
				System.out.println("November");
				System.out.println("Winter Season");
			}
			else if(q==12)
			{
				System.out.println("December");
				System.out.println("Rainy Season");
			}
		}
		else 
			System.out.println("Invalied input");
}
		public static void main(String[] args){
			Month month=new Month();
			month.quarter(1);
			month.quarter(2);
			month.quarter(12);
			month.quarter(13);
		}
}