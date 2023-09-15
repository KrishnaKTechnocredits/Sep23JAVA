package nikita;

class MaxMin{
	
	int num1;
	int num2;
	
	void maxnumber(int num1, int num2){
		if(num1>num2){
			System.out.println("The maximum number is"+num1);
		}
		else
			System.out.println("The maximum number is "+num2);
	}
	
	void minnumber(int num1, int num2){
		if(num1<num2){
			System.out.println("The minimum number is "+num1);
		}
		else
			System.out.println("The minimum number is "+num2);
	}
	
	public static void main(String[] args){
		MaxMin maxmin=new MaxMin();
		maxmin.maxnumber(10,17);
		maxmin.minnumber(10,17);
	}
}
