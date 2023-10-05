package rahul;

public class Assignment37_1_Case6 {

	public static void main(String[] args) {
		System.out.println("------ Case 6 ------");
		Assignment37_1_ClassA a = new Assignment37_1_ClassB();
		Assignment37_1_ClassB b = new Assignment37_1_ClassB();
		b = (Assignment37_1_ClassB) a;
		System.out.println(b.num1);
		System.out.println(b.num2);
		System.out.println(b.num3);
		b.m1();
		b.m2();
		b.m3();
	}
}
