package nikita;

public class DivisibleSum {
int sum;
	void div(int startindex, int endindex) {
		for(int i=startindex; i<=endindex;i++) {
			if(i%5==0 && i%10==0) {
				System.out.println("The numbers divisible by 5 and 10 are :"+i);
				sum=sum+i;
				System.out.println("The su, of all the numbers divisible by 5 and 10 in the range of 10 to 50 is "+sum);
			}
		}
	}
	
	public static void main(String[] args) {
		DivisibleSum divisiblesum= new DivisibleSum();
		divisiblesum.div(10,50);
		
	}
}
