package shamli;

public class Assignment14 {

	void numDivisibleInReverseOrder(int startIndex,int endIndex) {
		for(int i=endIndex;i>startIndex;i--) {
			if(i%7==0) {
				System.out.println(i+" is divisible by 7");
			}
			else if(i%13==0) {
				System.out.println(i+" is divisible by 13");
			}
		}
	}
	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		assignment14.numDivisibleInReverseOrder(5, 40);
	}

}
