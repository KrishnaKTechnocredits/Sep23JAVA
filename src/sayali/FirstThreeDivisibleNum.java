/* WAP on user defined range print first 3 numbers which is divisible by 3 & 4
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36 */

package sayali;

class FirstThreeDivisibleNum{
	
	void processData(int startIndex, int endIndex){
		int num = 0;
		System.out.println("\nFirst 3 numbers divisible by 3 and 4 is :");
		for(int index=startIndex; index<=endIndex; index++){
			if(index%3==0 && index%4==0){
				num = num + 1;
				if(num<=3){
					System.out.println(index);
				}
			}
		}
	}
	
	public static void main(String[] args){
		FirstThreeDivisibleNum firstThreeDivisibleNum= new FirstThreeDivisibleNum();
		firstThreeDivisibleNum.processData(10,500);
	}	
}