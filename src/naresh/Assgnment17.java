//assinment1
/*On user defined range print second last, third last, forth last number which is divisible by 2 & 3.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 100
Output : 90
         84		 
	     78		  
*/
package naresh;

class Assgnment17 {
int count=1;

		void divisible2_3(int startIndex, int endIndex){
			for (int st=endIndex; st>=startIndex; st--){
				if(st%2==0 && st%3==0){
					if(count>=2 && count<=4){
					  System.out.println(st);
					 }
					  count++;
					 if(count==5){
					  break;
					}
				}		
			}
		}
public static void main(String[] args){
	Assgnment17 assign=new Assgnment17();
	assign.divisible2_3(10,100);
}		
}

	