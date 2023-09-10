package shrutika;
class AverageOfNumber{
	
	void index(int startNum, int endNum){
		int sum=0;
		int average=0;
		int count=0;
		System.out.println("Numbers are:");
		for(int num=startNum; num<=endNum; num++){
			if(num%5==0 && num%7==0){
				System.out.println(num);
				count++;
				sum = sum + num ;
				average = sum / count;
			}
		}
		System.out.println("Found 3 numbers which are divible by 5 & 7.");
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+average);
	}

	public static void main(String[] args){
		AverageOfNumber averageOfNumber = new AverageOfNumber();
		averageOfNumber.index(1,110);
	}
}