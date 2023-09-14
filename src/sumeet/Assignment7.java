package sumeet;

class Assignment7{
	void findMaximum(int num1, int num2){
		if(num1>num2){
			System.out.println(num1 +" is greater than "+ num2);
		}else{
			System.out.println(num2 +" is greater than "+ num1);
		}
	}
	
	void findMinimum(int num1, int num2){
		if(num1<num2){
			System.out.println(num1 +" is smaller than "+ num2);
		}else{
			System.out.println(num2 +" is smaller than "+ num1);
		}
	}
	
	public static void main(String[] args){
		Assignment7 compare=new Assignment7();
		compare.findMaximum(10, 20);
		compare.findMinimum(10, 20);
	}
}