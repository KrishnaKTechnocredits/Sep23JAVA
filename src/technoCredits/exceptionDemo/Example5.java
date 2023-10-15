package technoCredits.exceptionDemo;

public class Example5 {
	
	void m1() {
		try {
			System.out.println("m1 start");
			m2(5);
			System.out.println(1);
		}catch(NullPointerException ne) {
			System.out.println("ne");
		}catch(ArithmeticException ae) {
			System.out.println("ae");
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("aie");
		}finally {
			System.out.println(2);
		}
		System.out.println("m1 end");
	}
	
	void m2(int x) {
		try {
			System.out.println("m2 start");
			String[] arr = {"Maulik", "Kanani"};
			System.out.println(arr[arr.length]);
		}catch(StringIndexOutOfBoundsException se) {
			System.out.println("m2 execption");
		}
		System.out.println("m2 end");
	}
	
	public static void main(String[] args) {
		new Example5().m1();
	}
}
