package gaurang;

class Maxmin{

	
	void printNum(int num1,int num2){
		if(num1<num2){
			System.out.println(num1+" is smaller between "+num1+" and " +num2);
		}else{
			System.out.println(num2+" is bigger between "+num1+ " and " +num2);
		}
	}
	
	void printNumb(int num1,int num2){
		if(num1<num2){
			System.out.println(num2+" is bigger between "+num1+" and " +num2);
		}else{
			System.out.println(num1+" is smaller between "+num1+ " and " +num2);
		}
	}
	public static void main(String[] args){
		Maxmin maxmin = new Maxmin();
		maxmin.printNum(10,17);
		maxmin.printNumb(10,17);
	}
}
