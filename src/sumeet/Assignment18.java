package sumeet;

public class Assignment18 {
	
	void printSumAndAverage(int startNum, int endNum) {
		int sum=0;
		int count=0;
		System.out.println("Numers div by 5 and 7 are:");
		for(int num=startNum; num<=endNum; num++) {
			if(num%5==0 && num%7==0) {
				sum=sum+num;
				count++;
				System.out.println(num);
			}
		}
		System.out.println("Sum =" + sum);
		double average=sum/count;
		System.out.println("Average =" + average);
	}
	
	public static void main(String[] args) {
		Assignment18 sumAndAverage= new Assignment18();
		sumAndAverage.printSumAndAverage(1, 110);
	}

}
