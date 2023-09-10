package onkar;

class Assignment7{
	
	void maximumNum(int num1, int num2){
		if(num1>num2){
			System.out.println(num1+" is bigger between "+num1+" and "+num2);
		}else{
			System.out.println(num2+" is bigger between "+num1+" and "+num2);
		}
	}
	
	void minimumNum(int num1, int num2){
		if(num1<num2){
			System.out.println(num1+" is smaller between "+num1+" and "+num2);
		}else{
			System.out.println(num2+" is smaller between "+num1+" and "+num2);
		}
	}
	
	public static void main(String[] args){
		Assignment7 assignment7 = new Assignment7();
		assignment7.maximumNum(10,17);
		assignment7.minimumNum(10,17);
	}
}