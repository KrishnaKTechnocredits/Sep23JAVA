package sakshi;

class Assignment18{

	void getSumAvg(int startRange, int endRange){
		int count=0;
		int sum =0;
		int avg=0;
		System.out.println("The number which is diviible by 5 & 7 are: ");
		for(int num=startRange; num<=endRange; num++){
			if(num%5==0 && num%7==0){
				sum=sum+num;
				count++;
			}
		}
		avg = sum/count;
		System.out.println("The sum of numbers are: " + sum + " and average is "+avg);	
		
	}
	
	public static void main(String[] args){
		Assignment18 assignment18 = new Assignment18();
		assignment18.getSumAvg(1,110);
	}
}