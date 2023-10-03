//Assignment 1


package akshay;

public class calculator {
	
	int a=10;
	int b=5;
	
	void add1() {
		int add=a+b;
		System.out.println(add);
	}
	void sub() {
		int sub=a-b;
		System.out.println(sub);
	}
	void mul() {
		int mul=a*b;
		System.out.println(mul);
	}
	void div() {
		int div=a/b;
		System.out.println(div);
	}

	public static void main(String[] args) {
		calculator cal= new calculator();
		cal.add1();
		cal.sub();
		cal.mul();
		cal.div();

	}

}
