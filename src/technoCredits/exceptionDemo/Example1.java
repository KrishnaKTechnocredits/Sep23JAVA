package technoCredits.exceptionDemo;

public class Example1 {
	
	void m1(int y) {
		try {
			System.out.println(1);
			int x = 10/y;
			System.out.println(x);
			System.out.println(2);
		}catch(NullPointerException ne) {
			System.out.println(4);
		}finally{
			System.out.println("in finally");
		}
		System.out.println(3);
	}
	
	public static void main(String[] args) {
		new Example1().m1(0);
		System.out.println("End");
	}
}
