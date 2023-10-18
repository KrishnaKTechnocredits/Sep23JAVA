package technoCredits.exceptionDemo.throwthrows;

public class Maulik {

	void m1() throws RuntimeException,ArithmeticException,NullPointerException{
		System.out.println("Maulik m1");
		try {
			new Krishna().processData(1500);
			System.out.println(3);
		}catch(RuntimeException ae) {
			System.out.println("Handled");
		}
		System.out.println("done");
	}
	
	public static void main(String[] args) throws NullPointerException{
		try {
			new Maulik().m1(); 
			System.out.println(4);
		}catch(ArithmeticException ae) {
			System.out.println("in main catch");
		}
	}
}
