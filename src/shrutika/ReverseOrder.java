package shrutika;
//Assignment - 13
class ReverseOrder{
	
	void reverse(int stratNum, int endNum){
		System.out.println("Divisible by 7 or 13, numbers are:");
		
		for(int num=endNum; num>=stratNum; num--){
			if(num%7==0){
				System.out.println(num+ " is divisible by 7");
			}else if(num%13==0){
				System.out.println(num+ " is divisible by 13");
			}
		}
	}
	
	public static void main (String[] args){
		ReverseOrder reverseOrder= new ReverseOrder();
		reverseOrder.reverse(5,40);
	}
}