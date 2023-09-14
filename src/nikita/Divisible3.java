package nikita;

public class Divisible3 {

	void div(int startindex, int endindex) {
		for(int i=endindex; i>=startindex;i--) {
			if(i%7==0 || i%13==0) {
				System.out.println("The numbers divisible by 7 and 13 in reverse order are :"+i);

			}
		}
	}

	public static void main(String[] args) {
		Divisible3 divisible3= new Divisible3();
		divisible3.div(5,40);
	}
}
