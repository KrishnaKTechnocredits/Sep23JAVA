/*On user defined range print second last, third last, forth last number which is divisible by 2 & 3.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 100
Output : 90
         84		 
	     78*/

package jaykumar;

public class Assignment17 {
	
	void div2And3(int startRange, int endRange) {
		int count=1;
		int temp=1;
		for(int index=endRange; index>=startRange; index--) {
			if(index%2==0 && index%3==0) {
				if(count>=2) {
					System.out.println(index);
					if(temp==3) {
						break;
					}
					temp++;
				}
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.div2And3(10, 100);
	}
}

