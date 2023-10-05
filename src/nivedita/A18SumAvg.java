/* Assignment 18
On user defined range print sum and average of numbers which is divisible by 5 & 7.
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

package nivedita;

class A18SumAvg{

		void sumAvg(int startIndex, int endIndex){
			int sum=0;
			int avg=0;
			
			
			for(int num=startIndex ; num<=endIndex ; num++){
				if(num%5==0 && num%7==0){
					System.out.println("Number of division by 5 and 7 is : "+num);
					sum= sum+num;
					avg++;
					
				}
			}
			System.out.println("Sum of number is : "+sum);
			System.out.println("Average of number is : "+ (sum / avg));
		}
		
		public static void main(String[] args){
			A18SumAvg a18sumAvg = new A18SumAvg();
			a18sumAvg.sumAvg(1,110);
		}
}