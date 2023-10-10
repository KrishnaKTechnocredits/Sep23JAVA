package aditya.Inheritance;

public class Assignment37 {
	
	void case1() {
		System.out.println("Case - 1");
		MAssignment37 case1 = new MAssignment37();//Parent Class Object
		System.out.println(case1.x);//Manager class x varaible=10
		System.out.println(case1.y);//Manager class y varaible=20
		//System.out.println(case1.z); Employee class z=40, varaible is the children class member so we can not access z when we create object of parent class.
		case1.m1(); //Manager class method MM1
		case1.m2(); //Manager class method MM2
		//case1.m3(); m3() is child class method, so we can not access the child class method when we create the object of parent class.
	}
	
	void case2() {
		System.out.println("Case - 2");
		EAssignment37 case2 = new EAssignment37();//created children class objet
		System.out.println(case2.x);//it will take Parent class(Manager) value x=10
		System.out.println(case2.y);//Will take the Child class(Employee) Y variable value=30
		System.out.println(case2.z);//will take the Child class(Emploee) Z variable value=40
		case2.m1();//display the output of parent class m1 method output=MM1
		case2.m2();//display the output of child class m2 method output that is = EM2
		case2.m3();//display the output of child class m3 method output that is = EM3
	}
	
	void case3() {
		System.out.println("Case 3 Dynamic Polymorphism");
		MAssignment37 case3 = new EAssignment37();// creating a object of child class and assigning it reference type of parent class
		System.out.println(case3.x);
		System.out.println(case3.y);
		//System.out.println(case3.z);
		case3.m1();
		case3.m2();
		//case3.m3();
	}
	
	void case4() {
		System.out.println("Case 4");
		//EAssignment37 case4 = new MAssignment37();can not assign parent class object to children
	}
	
	void case5(){
		MAssignment37 a = new MAssignment37();
		EAssignment37 b = new EAssignment37();
		a=b;
		//Same as case 3 if we solve the expression its like MAssignment37 case3 = new EAssignment37() Dynnaic ploymorphism compile time assignee and runtime assignee		
	}
	
	void case6() {
		MAssignment37 a = new EAssignment37();
		EAssignment37 b = new EAssignment37();
		a=b;
		//Same as case 3 if we solve the expression its like MAssignment37 case3 = new EAssignment37() Dynnaic ploymorphism compile time assignee and runtime assignee		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment37 as37 =new Assignment37();
		as37.case1();
		as37.case2();
		as37.case3();
	}

}
