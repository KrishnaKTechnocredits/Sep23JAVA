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
	void proccessData1(int startRange, int endRange){
		int count = 0;
		int sum = 0;
		for(int num=endRange;num>=startRange;num--){
			if(num%5==0 && num%7==0){
				sum = sum + num;
				count++;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		A17DivisibleNum divisibleNum = new A17DivisibleNum();
		System.out.println("The numbers divisible by 5 and 7 are : ");
		divisibleNum.proccessData(1,100);
		}
}		 