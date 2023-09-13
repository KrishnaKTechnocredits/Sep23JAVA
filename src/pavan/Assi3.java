package pavan;


class Assi3{
		int pavan;
	
	void add(int num1 ,int num2){
		int num = num1 + num2;
		System.out.println(num);
		pavan = pavan + num;
		}
		
	void mul(int num1 ,int num2){
		int num = num1 * num2;
		System.out.println(num);
		pavan = pavan + num;
		}
		
	void div(int num1 ,int num2){
		int num = num1 / num2;
		System.out.println(num);
		pavan = pavan + num;
		}
		
	void total(){
		System.out.println("Addition of all methods  "+pavan);
	}

	public static void main (String[] args){
		Assi3 assi3 = new Assi3();
		assi3.add(898,89);
		assi3.mul(54,4);
		assi3.div(54,4);
		assi3.total();
	}
}