package sumeet;

public class Assignment17 {
	
	void divByTwoAndThree(int startNum, int endNum) {
		int count=0;
		System.out.println("Second last, third last, forth last number which is divisible by 2 & 3 are :");
		for(int num=endNum; num>=startNum; num--) {
			if(num%2==0 && num%3==0) {
				count++;
				if(count>=2) {
					if(count>4) {
						break;
					}
					System.out.println(num);					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment17 divby2and3= new Assignment17();
		divby2and3.divByTwoAndThree(10, 100);
	}

}
