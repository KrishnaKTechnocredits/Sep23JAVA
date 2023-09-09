package nikita;

public class DivisibleBy7 {

	void div(int startindex, int endindex) {
		for(int i=endindex;i>=startindex;i--){
			if(i%7==0) {
				System.out.println("The numbers divisible by 7 in range of 1 to 100 is :"+i);
			}
		}
	}

	public static void main(String[] args) {
		DivisibleBy7 divisibleby7=new DivisibleBy7();
		divisibleby7.div(1, 100);
	}
}
