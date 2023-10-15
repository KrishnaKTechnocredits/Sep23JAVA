package technoCredits.exceptionDemo;
class Test{
	//stacktrace
	void m1(int x){
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println("Gaurang");
			int ans = 10/x;
			System.out.println(ans);
			x--;
			ans = 10/x;
			System.out.println("Now ans is " + ans);
		}catch(NullPointerException ne) {
			ne.printStackTrace();
			System.out.println("5");
		}catch(ArithmeticException ae) {
			System.out.println("6");
		}catch(StringIndexOutOfBoundsException se) {
			System.out.println("7");
		}
		
		System.out.println("Hetal");
		System.out.println("3");
		System.out.println("4");
	}
	
	void m2() {
		System.out.println("Test m2");
	}
	
	public static void main(String[] args){
		System.out.println("Hi");
		Test test = new Test();
		test.m1(1);
		System.out.println("Hello");
	}
}