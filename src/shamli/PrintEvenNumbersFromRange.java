/*
Write only one program having the following methods.
1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	
*/

package shamli;

class PrintEvenNumbersFromRange{
		int num;
		void print(int startIndex,int endIndex){
			for(int num=startIndex; num<=endIndex;num++)
			{
				if(num%2==0)
				{
					System.out.println(num);
					//break;
				}
			}
		}
		
		public static void main(String[]args)
		{
			PrintEvenNumbersFromRange p1=new PrintEvenNumbersFromRange();
			p1.print(10,15);
		}
		
}