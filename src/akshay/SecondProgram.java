package akshay;

public class SecondProgram {
	
  void ReverseData ( int start, int end) {
	  for(int num=end; num>=start;num--) {
		  if (num%7==0) {
			System.out.println("Number divisible"+"   "+  num);
		}
	  }
	  
  }
  
  public static void main(String[] args) {
	SecondProgram secondprogram=new SecondProgram();
	secondprogram.ReverseData(1, 100);
}
  
 
}
