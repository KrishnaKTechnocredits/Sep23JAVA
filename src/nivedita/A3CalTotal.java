/*
 Assignment - 3 : 
Write a program called CalculatorTricky, all 4 methods should be parameterized and write a method that will
print addition of answers get from all the methods.

int total;

void add(int num1, int num2){
	int ans = num1 + num2;
	total = total + ans;
}

void sub(int num1, int num2){
// 5
}

void display(){
	sop(total); //20
	}
 */


package nivedita;
class A3CalTotal{
	int total;
	
	void add(int num1,int num2){
		int answer=num1+num2;
		System.out.println("Addition is "+ answer);
		total=total+answer;
	}
	
	void sub(int num1,int num2){
		int answer=num1-num2;
		System.out.println("Substraction is "+ answer);
		total=total+answer;
	}
	
	void div(int num1,int num2){
		int answer=num1/num2;
		System.out.println("Division is "+ answer);
		total=total+answer;
	}
	
	void mul(int num1,int num2){
		int answer=num1*num2;
		System.out.println("Multiplication is "+ answer);
		total=total+answer;
	}
	
	void display(){
		System.out.println(total);
	}
	
	public static void main(String[]args){
		A3CalTotal calTotal = new A3CalTotal();
		calTotal.add(10,5);
		calTotal.sub(10,5);
		calTotal.div(10,5);
		calTotal.mul(10,5);
		calTotal.display();
	}
}