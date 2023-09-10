package shrutika;
class EvenOdd{
	
	void evenOddNumbers(int stratNum, int endNum){
		for(int num=stratNum; num<=endNum; num++){
			if(num%2==0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		EvenOdd	evenOdd = new EvenOdd();
		evenOdd.evenOddNumbers(10,15);
	}
}