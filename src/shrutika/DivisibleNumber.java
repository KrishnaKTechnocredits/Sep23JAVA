package shrutika;
//Assignment - 12
class DivisibleNumber{
	
	void divisible(int startNum, int endNum){
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int num=startNum; num<=endNum; num++){
			if(num%5==0 && num%3==0){
				System.out.println(+num);
			}
		}
	}
	
	public static void main(String[] args){
		DivisibleNumber divisibleNumber= new DivisibleNumber();
		divisibleNumber.divisible(5,40);
	}
}