package sumeet;

public class Assignment11 {
	
	void evenNumberFromRange(int startNum, int endNum) {
		for(int num=startNum; num<=endNum; num++) {
			if(num%2==0) {
				System.out.println(num);
			}
		
		}
	}
	
	public static void main(String[] args) {
		Assignment11 evenNumber= new Assignment11();
		evenNumber.evenNumberFromRange(10,15);		
	}

}
