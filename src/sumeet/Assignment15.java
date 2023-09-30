package sumeet;

public class Assignment15 {
	
	void sumOfNumderDivByFiveAndTen(int startNum, int endNum){
		int sum=0;
		for(int num=endNum; num>=startNum; num--) {
			if(num%5==0 && num%10==0) {
				sum =sum+num;
			}
		}
		System.out.println("Expected sum is "+ sum);
	}
	
	public static void main(String[] args) {
		Assignment15 sumOfNum=new Assignment15();
		sumOfNum.sumOfNumderDivByFiveAndTen(10, 50);
	}

}
