package technoCredits.exceptionDemo;

public class Example4 {

	void m1(int y) {
		try {
			try {
				System.out.println("Hi");
				try {
					int x = 10 / y;
					System.out.println(x);
				} catch (NullPointerException ne) {
					System.out.println("ok");
				} finally {
					System.out.println("good");
				}
				System.out.println("hello");
			} catch (StringIndexOutOfBoundsException ae) {
				System.out.println("techno");
			} finally {
				System.out.println("credits");
			}
			System.out.println("done");
		} catch (ArithmeticException ae) {
			System.out.println("India");
		}
		System.out.println("exit");
	}

	public static void main(String[] args) {
		new Example4().m1(0);
		System.out.println("end");
	}
}
