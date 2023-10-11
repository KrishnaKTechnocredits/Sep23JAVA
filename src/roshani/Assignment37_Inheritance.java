package roshani;

public class Assignment37_Inheritance {
		//we have one parent class Manager and child class Employee
		//Manager class's variables and methods are x,y,m1 and m2
		//Employee class's variables and methods are y,z,m2 and m3
	void case1() {
		System.out.println("Case1");
		//Case 1: creating parent class Manager object .When we create an object of parent class then we can access/call parent class data members only.
		Assignment37_Manager case1 = new Assignment37_Manager();
		System.out.println(case1.x);
		System.out.println(case1.y);
		//Will throw compilation error on below line as variable z is not present in parent class Manger
		//System.out.println(case1.z);
		case1.m1();
		case1.m2();
		//case3.m3(); //CE, as members of child class is not accessible to parent class.
	}
	
	void case2() {
		System.out.println("Case2");
		//Case 2: creating object of child class Employee .When we create an object of child class then we can access/call both parent and child class data members.
		Assignment37_Employee case2 = new Assignment37_Employee();
		System.out.println(case2.x);
		System.out.println(case2.y);
		System.out.println(case2.z);
		case2.m1();
		case2.m2();
		case2.m3();
	}
	
	void case3() {
		System.out.println("Case3: Dynamic Polymorphism");
		//Case3: Creating object of child class Employee and of reference type parent.
		/*In this case, variables(methods) do not change from compile time to run time but 
		 method(behaviour) will change while compile to run time this is called dynamic polymorphism */
		Assignment37_Manager case3 = new Assignment37_Employee();
		System.out.println(case3.x);
		System.out.println(case3.y);
		//System.out.println(case3.z); //CE as parent class is unaware about variable z
		case3.m1();
		case3.m2();
		//case3.m3(); //CE, as parent class is unaware about this method	
	}
	
	void case4() {
		System.out.println("Case4");
		//Assignment37_Employee case4 = new Assignment37_Manager(); //CE, as parent class can't accomodate in child class
		//Creating object of parent class with child class reference
		// CE at time of object creation, as we cannot assign parent to child
		// Explicit type casting is required, compiler will allow but JVM will through exception error
		//Assignment37_Employee case4 = (Assignment37_Employee) new Assignment37_Manager();
	}
	
	void case5() {
		System.out.println("Case5");
		//Case 5: We can acheive dynamic polymorphism, by using variables also. This is similar to case 3
		Assignment37_Manager case5_Parent = new Assignment37_Manager();
		Assignment37_Employee case5_Child = new Assignment37_Employee();
		case5_Parent = case5_Child;
		System.out.println(case5_Parent.x);
		System.out.println(case5_Parent.y);
		//System.out.println(case5_Parent.z); //CE, as z is unknown to parent class
		case5_Parent.m1();
		case5_Parent.m2();
		//case5_Parent.m3(); //CE, as m3 is unknown to parent
	}
	
	void case6() {
		System.out.println("Case6");
		//case6_child = case6_parent;	//(Type casting required as below)
		//case6_child = (B)case6_parent; 
		Assignment37_Manager case6_Parent = new Assignment37_Employee();
		Assignment37_Employee case6_Child = new Assignment37_Employee();
		case6_Child = (Assignment37_Employee) case6_Parent;  //b = (B)a;
		System.out.println(case6_Child.x);
		System.out.println(case6_Child.y);
		System.out.println(case6_Child.z);
		case6_Child.m1();
		case6_Child.m2();
		case6_Child.m3();
	}
	
	public static void main(String[] args) {
		Assignment37_Inheritance assignment37_Inheritance = new Assignment37_Inheritance();
		assignment37_Inheritance.case1();
		assignment37_Inheritance.case2();
		assignment37_Inheritance.case3();
		assignment37_Inheritance.case4();
		assignment37_Inheritance.case5();
		assignment37_Inheritance.case6();
	}
}
