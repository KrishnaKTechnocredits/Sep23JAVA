package naresh;

/*Assignment - 14 : 7th Sep'2023		 
On user defined range print last number which is divisible by 5 & 9.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 100
Output : Last number divisible by 5 & 9 is 90*/



class Practise4{
int index;
  void proccessData(int num1,int num2){
  for (int i =num2 ;i>=num1;i--){
  
  if (i%5==0 && i%9==0){
  index=i;
   break;
   }
  }
  System.out.println("Last number divisible by 5 & 9 is"+index);
  }
  public static void main(String[]args){
	  Practise4 practise = new Practise4();
	  practise.proccessData(5,100);
	  
	  
  }  
  }
  