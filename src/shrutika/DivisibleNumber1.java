package shrutika;
//Assignment - 14
class DivisibleNumber1{
	
	void devisible(int startNum, int endNum){
		for(int num=endNum; num>=startNum; num--){
			if(num%5==0 && num%9==0){
				System.out.println("Last number divisible by 5 & 9 is " +num);
				break;
			}
		}
		
	}
	
	public static void main(String[] args){
		DivisibleNumber1 divisibleNumber1 = new DivisibleNumber1();
		divisibleNumber1.devisible(5,100);
	}
}