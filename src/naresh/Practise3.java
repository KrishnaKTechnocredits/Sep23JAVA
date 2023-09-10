package naresh;

/*   
Assignment - 13 : 7th Sep'2023		 
On user defined range print all numbers which are divisible by 7 or 13 in reverse order.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 39 is divisible by 13
		 
		 28 is divisible by 7
		 26 is divisible by 13
		 21 is divisible by 7
		 14 is divisible by 7
		 13 is divisible by 13
		 7 is divisible by 7*/





class Practise3{

  void processData(int num1 ,int num2){
  for (int index = num2;index>=num1;index--){
	  if(index%7==0)
		  System.out.println(index +"is divisible by 7");
	  else if(index%13==0)
		  System.out.println(index +"is divisible by 13");
			   }
           }
	public static void main(String[] args)	{
		 Practise3 practise =new Practise3();
		 practise.processData(5,40);
		
		}
	}
	