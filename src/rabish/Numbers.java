package rabish;
class Numbers {
	
	void smallerNumber(int num1,int num2){
		if(num1<num2){
			System.out.println(num1 +" is smaller between "+num1+ " and " +num2);
		}
	}
	
	void greaterNumber(int num1,int num2){
		if(num2>num1){
			System.out.println(num2 +" is greater between "+num1+ " and "+ num2);
		}
	}
	
	public static void main(String[] args){
		Numbers num = new Numbers();
		num.smallerNumber(10,17);
		num.greaterNumber(10,17);
	}
}