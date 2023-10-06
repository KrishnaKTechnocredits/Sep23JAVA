package rahul;

public class Assignment37_1_Case5 {
	
	public static void main(String[] args) {
		System.out.println("------ Case 5 ------");
		Assignment37_1_ClassA a = new Assignment37_1_ClassA();
		Assignment37_1_ClassB b = new Assignment37_1_ClassB();
		a = b; // Assignment37_1_ClassA a1 = new Assignment37_1_ClassB();
		System.out.println(a.num1);
		System.out.println(a.num2);
		System.out.println(Assignment37_1_ClassA.str);
		a.m1();
		a.m2();
		// System.out.println(a.num3);
		// a.m3();
	}

}
