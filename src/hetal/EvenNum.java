package hetal;

class EvenNum{
	
	void printevennum(int num1, int num2){
		for (int i = num1; i <= num2; i++){
			if(i % 2 == 0)
				System.out.println("Even numbers are" + i);
		}
	}
	
	public static void main(String args[]){
        EvenNum evenNum = new EvenNum();
        evenNum.printevennum(10,15);
	}  		
}