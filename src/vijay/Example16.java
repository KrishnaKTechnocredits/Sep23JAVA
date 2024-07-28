package vijay;

class Example16{

	void verifyNumber(int num){
		if (num%2==0){
			System.out.println(num + " is Even");
		}else{
			System.out.println(num + " is odd");
		}
	}
	
	public static void main (String[] args){
		Example16 example16 = new Example16();
		example16.verifyNumber(15);
	}
}