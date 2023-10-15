package technoCredits.exceptionDemo;

public class Example {

	void m1(int x,Test temp) {
		try {
			System.out.println("Hi");
			int ans = 10/x;
			System.out.println(ans);
			System.out.println(1);
			Test test = temp;
			System.out.println(2);
			test.m2();
			System.out.println("Techno");
		}catch(NullPointerException ne) {
			System.out.println(3);
		}catch(ArithmeticException ae) {
			System.out.println(4);
		}
		System.out.println(5);
	}

	public static void main(String[] args) {
		System.out.println("start");
		Test temp =null;
		new Example().m1(10, temp);
		System.out.println("end");
	}

}
