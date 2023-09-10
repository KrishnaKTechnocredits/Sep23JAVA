package shrutika;
//Assignment - 15
class DivisibleNumber2{
	
	void divisible(int startNum, int endNum){
		int sum=0;
		for(int num=startNum; num<=endNum; num++){
			if(num%5==0 && num%10==0){
				sum = sum+num;
			}
		}
		System.out.println("sum is " +sum);
	}
	
	public static void main(String[] args){
		DivisibleNumber2 divisibleNumber2 = new DivisibleNumber2();
		divisibleNumber2.divisible(10,50);
	}
}