package nikita;

public class EvenNumbers {

	void evenNumb(int startindex, int endindex) {
		for(int i= startindex; i<=endindex;i++) {
			if(i%2==0) {
				System.out.println("Even numbers in the range of 5 to 40 are :"+i);
			}
		}	
	}
	
	public static void main(String[] args) {
		EvenNumbers evennumbers= new EvenNumbers();
		evennumbers.evenNumb(10,15);
	}
}
