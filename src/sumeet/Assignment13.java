package sumeet;

public class Assignment13{
	
	void divBySevenOrThirteenReverse(int startNum, int endNum) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		for(int num=endNum; num>=startNum; num--) {
			if(num%7==0 || num%13==0){
				if(num%7==0) {
					System.out.println(num +" is divisible by 7");
				}else {
					System.out.println(num +" is divisible by 13");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment13 div7or13= new Assignment13();
		div7or13.divBySevenOrThirteenReverse(5, 40);
	}
}
	
	
	
