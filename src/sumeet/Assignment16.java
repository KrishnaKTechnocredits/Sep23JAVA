package sumeet;

public class Assignment16 {
	
	void firstThreeNumber(int startNum, int endNum) {
		int count=0;
		System.out.println("First 3 numbers divisible by 3 and 4 are :");
		for(int num=startNum; num<=endNum; num++) {
			if(num%3==0) {
				count=count+1;
				if(count>3) {
					break;
				}
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment16 assignment16= new Assignment16();
		assignment16.firstThreeNumber(10, 500);
	}

}
