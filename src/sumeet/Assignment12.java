package sumeet;

public class Assignment12 {
	
	void divisibleByFiveAndThree(int startNum, int endNum) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int num=startNum; num<=endNum; num++) {
			if(num%5==0 && num%3==0) {
				System.out.println(num);
			}
		
		}
	}
	
	public static void main(String[] args) {
		Assignment12 div= new Assignment12();
		div.divisibleByFiveAndThree(5, 40);		
	}

}

