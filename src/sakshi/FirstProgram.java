package sakshi;

public class FirstProgram {
	
	void getNum(int startRange, int endRange) {
		System.out.println("The number which are divisible by 7 are - ");
		for(int num=endRange; num>=startRange; num--) {
			if(num%7==0) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		FirstProgram firstProgram = new FirstProgram();
		firstProgram.getNum(1,100);
	}
}