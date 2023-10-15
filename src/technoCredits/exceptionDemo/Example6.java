package technoCredits.exceptionDemo;

public class Example6 {
	
	void m1() {
		try {
			System.out.println("m1 start");
			m2(1);
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
			System.out.println(arr[x]);
		}catch(StringIndexOutOfBoundsException se) {
			System.out.println("m2 execption");
			
		}finally {
			System.out.println(m3(x));
			System.out.println("m2 finally");
		}
		System.out.println("m2 end");
	}
	char m3(int x) {
		String str = "technocredits";
		x = x + 12;
		return str.charAt(x);
	}
	
	public static void main(String[] args) {
		new Example6().m1();
	}
}
