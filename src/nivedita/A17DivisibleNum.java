/* Assignment 17
On user defined range print second last, third last, forth last number which is divisible by 2 & 3.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 100
Output : 90
         84		 
	     78*/

package nivedita;
class A17DivisibleNum{		 
	void proccessData(int startRange, int endRange){
		int count = 1;
		int temp = 1;
		for(int num=endRange;num>=startRange;num--){
			if(num%2==0 && num%3==0){
				if(count>=2){
					System.out.println(num);
					if(temp==3)
						break;
					temp++;
				}
				count++;
			}
		}
	}
	public static void main(String[] args){
		A17DivisibleNum divisibleNum = new A17DivisibleNum();
		System.out.println("The numbers divisible by 2 and 3: which are at second last,third last,fourth last place are:");
		divisibleNum.proccessData(10,100);
	}
}		 