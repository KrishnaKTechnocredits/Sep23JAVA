// WAP on user defined range,print sum and average of numbers which is divisible by 5 & 7.
package sayali;

class SumAndAverage{
	int sum=0;
	int count=0;
	
	void printNumber(int startRange, int endRange){
		for(int num=startRange; num<=endRange; num++){
			if(num%5==0 && num%7==0){
				System.out.println(num);
				sum=sum + num;
				count++;
				if(count==3)
					break;
			}
		}
		System.out.println("Sum = " +sum);
		System.out.println("Average = " +sum/count);
	}
	
	public static void main(String[] args){
		SumAndAverage sumAndAverage = new SumAndAverage();
		sumAndAverage.printNumber(1,110);
	}
}