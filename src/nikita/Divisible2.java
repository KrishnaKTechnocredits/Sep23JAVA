package nikita;

public class Divisible2 {
	
	int count=1;
	
	void div(int startindex, int endindex) {
		for(int i=endindex; i>=startindex;i--) {
			if(i%2==0 && i%3==0) {
				if(count>=2 && count<=4) {
				System.out.println("The secondlast, thirdlast and last number divisible by 2 and 3 are :"+i);
				
			}
				count++;
		}
		}
	}
	
	public static void main(String[] args) {
		Divisible2 divisible2= new Divisible2();
		divisible2.div(10, 100);
	}
}
