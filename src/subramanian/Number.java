package subramanian;
class Number{

	void MaxNum(int Num1, int Num2){
		if(Num1>Num2){
		System.out.println(Num1+" is Greater between "+Num1+" and "+Num2);
		}
		else{
		System.out.println(Num1+" is Smaller between "+Num1+" and "+Num2);
		}
	}
	
	void MinNum(int Num1, int Num2){
		if(Num1<Num2){
		System.out.println(Num1+" is Smaller between "+Num1+" and "+Num2);
		}
		else{
		System.out.println(Num1+" is Greater between "+Num1+" and "+Num2);
		}
	}
	
	public static void main(String[] args){
	Number number=new Number();
	number.MaxNum(20,10);
	number.MinNum(10,20);
	}
}