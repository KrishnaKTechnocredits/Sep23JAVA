package nikita;

public class Divisible {

	void div(int startindex, int endindex) {
		for(int i=endindex; i>=startindex;i--) {
			if(i%5==0 && i%9==0) {
				System.out.println("The last number divisible by 5 and 9 in the range of 5 to 100 is :"+i);
				break;
			}
		}
	}
	
public static void main(String[] args) {
	Divisible divisible= new Divisible();
	divisible.div(5, 100);
}
}
