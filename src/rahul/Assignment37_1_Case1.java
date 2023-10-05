// A a = new A();

package rahul;

public class Assignment37_1_Case1 {

	public static void main(String[] args) {
		Assignment37_1_ClassA c1 = new Assignment37_1_ClassA();
		System.out.println("------ Case 1 ------");
		System.out.println(c1.num1);
		System.out.println(Assignment37_1_ClassA.str);
		// System.out.println(cA.numB); // CE (int numB is not accessible in ClassA )
		c1.m1();
		c1.m2();
		// c.A.m1ClassB(); // CE (method m2ClassB() is not accessible in ClassA)
	}
}
