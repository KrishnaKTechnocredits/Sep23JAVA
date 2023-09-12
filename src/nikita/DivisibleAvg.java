package nikita;

public class DivisibleAvg {

	int sum;
	int avg;
	int count;

	void div(int startindex, int endindex) {
		for(int i=startindex; i<=endindex;i++) {
			if(i%5==0 && i%7==0) {
				System.out.println("the numbers are :"+i);
				count++;
				sum=sum+i;				
			}
		}
		avg=sum/count;
		System.out.println("The average of number divisible by 5 and 7 are :"+avg);
	}

	public static void main(String[] args) {
		DivisibleAvg divisibleavg=new DivisibleAvg();
		divisibleavg.div(1,110);
	}
}
