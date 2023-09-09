package mayank;


class Assignment15{
	void sumOfNumber(int startIndex,int endIndex){
		int sum=0;
		System.out.println("The Sum of numbers Divisible by 5&10 is");
		for(int num=startIndex;num<=endIndex;num++){
			if(num%5==0 && num%10==0){
				sum=sum+num;
			}
		}	
		System.out.println("Sum is" + sum);
	}
	public static void main(String[] args){
		Assignment15 assignment15 = new Assignment15();
		assignment15.sumOfNumber(10,50);
	}
}