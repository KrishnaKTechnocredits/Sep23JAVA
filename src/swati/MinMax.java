package swati;

//ASSIGNMENT 7
class MinMax{
	
	void smaller(int number1,int number2){
		if(number1<number2){
			System.out.println(number1+" is smaller between "+number1+" and "+number2);
		}else {
			System.out.println(number2+" is smaller");
		}
	}
	
	void Bigger(int number1,int number2){
		if(number2>number1){
		System.out.println(number2+" is bigger between "+number1+" and "+number2);
		}else{
			System.out.println(number1+" is bigger");
		}
	}
	
	public static void main(String[] args){
		MinMax minmax = new MinMax();
		minmax.smaller(10,17);
		minmax.Bigger(10,17);
	}
}
