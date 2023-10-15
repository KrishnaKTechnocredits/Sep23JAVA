package technoCredits.exceptionDemo;

public class Example3 {

	void m1(int y){
		try{
			System.out.println("Hi");
			try{
				int x = 10/y;
				System.out.println(x);
			}catch(ArrayIndexOutOfBoundsException ne){
				System.out.println("ok");
			}finally{
				System.out.println("good");
			}
			System.out.println("hello");
		}catch(StringIndexOutOfBoundsException ae){
			System.out.println("techno");
		}finally{
			System.out.println("credits");
		}
		System.out.println("done");
	}
	
	public static void main(String[] args) {
		new Example3().m1(0);
	}
}
