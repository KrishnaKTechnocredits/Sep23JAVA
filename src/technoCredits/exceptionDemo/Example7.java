package technoCredits.exceptionDemo;

// Child to parent catch up hierarchy should be followed otherwise its a compilation error.
public class Example7 {
	
	void m1() {
		try {
			
		}catch(IndexOutOfBoundsException e) {
			
		}
		/*catch(ArrayIndexOutOfBoundsException fe) { // CE
			
		}*/finally {
			System.out.println("Hi");
		}
		System.out.println("Hello");
	}
}
