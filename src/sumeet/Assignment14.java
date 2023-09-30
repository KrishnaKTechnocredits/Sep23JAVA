package sumeet;

public class Assignment14 {
	
	void lastNumberDivByFiveAndNine(int startNum, int endNum){
		for(int num=endNum; num>=startNum; num--) {
			if(num%5==0 && num%9==0) {
				System.out.println("Last number divisible by 5 & 9 is "+ num);
				break;
			}
		}
	}
	
	public static void main(String[] arg) {
		Assignment14 lastNum= new Assignment14();
		lastNum.lastNumberDivByFiveAndNine(5, 100);
	}

}
