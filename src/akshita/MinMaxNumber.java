package akshita;

class MinMaxNumber{
	int num1 = 10;
	int num2 = 17;
	void smallerNumber(int num3){
		if(num1>=num3 && num3<= num2){
			System.out.println(num3 + " is smaller between " + num1 + "and " + num2);
        }
	}
	
	void biggerNumber(int num4){
		if(num1<=num4 && num4<= num2){
			System.out.println(num4 + " is bigger between " + num1 + "and " + num2);
		}
	}

	public static void main(String[] args){
	MinMaxNumber minMaxNumber = new MinMaxNumber();	
	minMaxNumber.smallerNumber(10);
	minMaxNumber.biggerNumber(17);
	}
}