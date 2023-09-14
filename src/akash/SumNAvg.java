package akash;

class SumNAvg{
	
	void findSumNAvg(int startRange, int endRange){
		System.out.println("Found 3 numbers which are divible by 5 & 7 : ");
		int sum=0;
		int count=0;
		//int avg=0;
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0 && num%7==0){
				System.out.println(num);
				sum=sum+num;
				count++;
			}
		}
		
		System.out.println("Sum And Average of this numbers are: ");
		System.out.println(sum);
		int avg=(sum/count);
		System.out.println(avg);
	}
	
	public static void main(String[] args){
		SumNAvg sumnavg = new SumNAvg();
		sumnavg.findSumNAvg(1,110);
	}
}