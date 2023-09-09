package sakshi;

class DivNumber {
	
	void divNumber(int startRange, int endRange){
		System.out.println("Divisible by 7 & 13, numbers are: ");
		for(int num=endRange; num>=startRange; num--){
			if(num%7==0){
				System.out.println(num + " is divisible by 7");
			}else if(num%13==0){
				System.out.println(num + " is divisible by 13");
			}
		}
	}
	
	public static void main(String[] args){
		DivNumber divNum = new DivNumber();
		divNum.divNumber(5, 40);
	}
}