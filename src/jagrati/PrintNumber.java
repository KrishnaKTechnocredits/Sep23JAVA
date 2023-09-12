package jagrati;

//On user defined range print second last, third last, forth last number which is divisible by 2 & 3.
//Hint : pass start and end index as a parameter.

class PrintNumber{

	void printSequence(int passStart, int endIndex){
		int count=1;
		int temp=1;
		
		for(int num=endIndex;num>=passStart; num--){
			if(num%2==0 && num%3==0){
				count++;
				if(count>=2){
				System.out.print(num);
				if(temp == 3)
					break;
					temp++;
				}
			}
		}
	}
	public static void main(String [] args){
		PrintNumber printN = new PrintNumber();
		printN.printSequence(10,100);

	}	
}