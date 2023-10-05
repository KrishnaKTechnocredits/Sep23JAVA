package rahul;

public class Assignment37_1_Case3 {

	public static void main(String[] args) {

		Assignment37_1_ClassA c3 = new Assignment37_1_ClassB();
		System.out.println(c3.num1);
		System.out.println(c3.num2);
		System.out.println(Assignment37_1_ClassA.str);
		c3.m1();
		c3.m2();
		// c3.num3; CE // properties cant be accessed
		// c3.m3(); CE // method can be accessed if its name is same & parameters are
		// same
	}
}
