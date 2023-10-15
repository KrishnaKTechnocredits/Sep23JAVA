package shamli.inheritance;

public class Assignment37InheritanceCases {

	void case1() {
		System.out.println("CASE 1:");
		//Creating object of parent class and access members of both parent and child class
		Assignment37Manager case1 = new Assignment37Manager();
		System.out.println(case1.x);
		System.out.println(case1.y);
		//System.out.println(case1.z);	// CE, as members of child class not accessible to parent class
		case1.m1();
		case1.m2();
		//case1.m3(); //CE, as members of child class not accessible to parent class
	}
	
	void case2() {
		System.out.print("\n");
		System.out.println("CASE 2: Static Polymorphism");
		//Creating object of child class and access members of both parent and child class
		Assignment37Employee case2 = new Assignment37Employee();
		System.out.println(case2.x);
		System.out.println(case2.y);
		System.out.println(case2.z);
		case2.m1();
		case2.m2();
		case2.m3();
	}
	
	void case3() {
		System.out.print("\n");
		System.out.println("CASE 3: Dynamic Polymorphism");
		//Creating object of child class and of reference type parent 
		//and access members of both parent and child class
		/*In this case, from compile time to run time,
		properties (variables) does not change, but behaviors (methods) does change.*/
		Assignment37Manager case3 = new Assignment37Employee();
		System.out.println(case3.x);
		System.out.println(case3.y);
		//System.out.println(case3.z); //CE, this variable is unknown to parent class reference
		case3.m1();
		case3.m2();
		//case3.m3(); //CE, this method is unknown to parent class reference
	}
	
	void case4() {
		System.out.print("\n");
		System.out.println("CASE 4:");
		System.out.println("Creating object of parent class with child class reference");
		System.out.println("CE at time of object creation, Parent can not be assigned to child");
		System.out.println("To avoid CE, explicit typecast parent reference in child reference");
		System.out.println("but, JVM will through exception error");
		//Creating object of parent class with child class reference
		// CE at time of object creation, as we cannot assign parent to child
		// Explicit type casting is required, compiler will allow but JVM will through exception error
		//Assignment37_Employee case4 = (Assignment37_Employee) new Assignment37_Manager();
	}
	
	void case5() {
		System.out.print("\n");
		System.out.println("CASE 5: same as case3 - DP");
		Assignment37Manager case51 = new Assignment37Manager();
		Assignment37Employee case52 = new Assignment37Employee();
		case51 = case52; // A a = new B(); same as case3, DP
		System.out.println(case51.x);
		System.out.println(case51.y);
		//System.out.println(case51.z); //CE, this variable is unknown to parent class reference
		case51.m1();
		case51.m2();
		//case51.m3(); //CE, this method is unknown to parent class reference
	}
	
	void case6() {
		System.out.print("\n");
		System.out.println("CASE 6: Typecase parent reference type to child reference type");
		Assignment37Manager case61 = new Assignment37Employee();  //A a = new B();
		Assignment37Employee case62 = new Assignment37Employee(); //B b = new B();
		//case62 = case61; // b = a; 
		//CE at above line, type mismatch, need to type cast,
		//as parent reference type cannot be stored in child reference type
		
		case62 = (Assignment37Employee) case61; //b = (B)a;
		System.out.println("Output same as case 2"); //Methods called on case62 object
		System.out.println(case62.x);
		System.out.println(case62.y);
		System.out.println(case62.z);
		case62.m1();
		case62.m2();
		case62.m3();
		
	}
	
	public static void main(String[] args) {
		Assignment37InheritanceCases cases = new Assignment37InheritanceCases();
		cases.case1();
		cases.case2();
		cases.case3();
		cases.case4();
		cases.case5();
		cases.case6();
	}
}
