/*Assignment - 14 : 7th Sep'2023		 
On user defined range print last number which is divisible by 5 & 9.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 100
Output : Last number divisible by 5 & 9 is 90
*/

package jyoti;
class DivLastNum{

	void processData(int startRange, int endRange){
		for(int num=endRange;num>=startRange;num--){
			if(num%5==0 && num%9==0){
				System.out.println(num);
				break;
			}
		}
	}
	public static void main(String[] args){
		DivLastNum divl= new DivLastNum();
		divl.processData(5,100);
	}
}	