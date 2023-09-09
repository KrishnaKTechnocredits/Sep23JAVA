/* On user defined range print sum and average of numbers which is divisible by 5 & 7.
Hint : pass start and end index as a parameter.
Input : Range -> 1 to 110
Output : Numbers are,
                35
		 70
                105
		 Found 3 numbers which are divible by 5 & 7.
		 sum = 210
		 Avearge = 70
		 
		 */
	package naresh;
	
		 class Assgnment18 {
			int count=0;
			int sum=0;
			int avg;
		void sumAvg(int startIndex, int endIndex){
			System.out.println("Number are");
			 for (int st=startIndex; st<=endIndex; st++){
				if(st%5==0 && st%7==0){
					System.out.println(st);
					sum=sum+st;
					count=count+1;
				}		 
			}
			     avg=sum/count;
				 System.out.println("Sum ="+sum);	
				 System.out.println("Average ="+avg);
		}	
				
public static void main(String[] args){
	Assgnment18 assign=new Assgnment18();
	assign.sumAvg(1,110);
}		
}
