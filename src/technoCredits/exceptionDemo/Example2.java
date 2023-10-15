package technoCredits.exceptionDemo;

public class Example2 {
	
	void m1() {
		int y = 1;
		try{
			int x = 10/y;
			y--;
			System.out.println(x);
		}catch(ArithmeticException ae){
			System.out.println("Hello");
		}finally{
			System.out.println("Hi");
			try{
				int ans = 10/y;
				System.out.println(ans);
			}catch(ArithmeticException ae){
				System.out.println("pune");
			}finally {
				System.out.println("valid");
			}
			System.out.println("credits");
		}
		System.out.println("Techno");
	}
	
	void m2() {
		int y = 1;
		try{
			int x = 10/--y;
			y++;
			System.out.println(x);
		}catch(ArithmeticException ae){
			System.out.println("Hello");
			int ans = 10/y--;
			System.out.println(ans);
		}finally{
			System.out.println("Hi");
			System.out.println("credits");
		}
	}
	
	void m3() {
		int y = 1;
		try{
			int x = 10/--y;
			y++;
			System.out.println(x);
		}catch(ArithmeticException ae){
			System.out.println("Hello");
			try{
				int ans = 10/y--;
				System.out.println(ans);
			}catch(ArithmeticException ae1){
				System.out.println("india");
			}finally{
				System.out.println("pune");
			}
		}finally{
			System.out.println("Hi");
			System.out.println("credits");
		}
		System.out.println("All good");
	}
	
	public static void main(String[] args) {
		new Example2().m3();
	}
}
