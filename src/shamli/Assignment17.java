/*
 * On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
         12
         24
         36
 */

package shamli;

public class Assignment17 {

	void findFirst3NumDivisibleByGivenNum(int startIndex,int endIndex) {
		int count=0;
		for(int i=startIndex;i<=endIndex;i++) {
			if(i%3==0 && i%4==0)
			{
				System.out.println(i);
				if(count==2) {
					break;
				}
				count++;
			}
		}
	}

	public static void main(String[] args) {
		Assignment17 assignment17= new Assignment17();
		System.out.println("First 3 numbers which are Divisible by 3 and 4 from the given range are : ");
		assignment17.findFirst3NumDivisibleByGivenNum(10, 500);
	}
}
