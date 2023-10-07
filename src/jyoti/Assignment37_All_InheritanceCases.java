//Inheritance 6 cases

package jyoti;

public class Assignment37_All_InheritanceCases {
	// When we create an object of parent class then we can access/call parent class
	// data members only.
	void case1() {
		System.out.println("**********CASE-1**************");
		Assignment37_Manager case1 = new Assignment37_Manager();
		System.out.println(case1.x); // 10
		System.out.println(case1.y); // 20
		// System.out.println(case1.z); // here CE, as Manager class does not have this
		// employee class variable
		case1.m1(); // Manager - m1
		case1.m2(); // Manager - m2
		// case1.m3(); //CE, as Manager class does not have this employee class method
	}

	// When we create an object of child class then we can access/call parent class
	// and child class data members.
	void case2() {
		System.out.println("**********CASE-2**************");
		Assignment37_Employee case2 = new Assignment37_Employee();
		System.out.println(case2.x); // 10
		System.out.println(case2.y); // 30
		System.out.println(case2.z); // 40
		case2.m1(); // Manager - m1
		case2.m2(); // Employee - m2
		case2.m3(); // Employee - m3
	}

	// When we create an object of child class with parent class reference, it is
	// known as dynamic polymorphism.
	// Here, property(same variable) of parent class does not change but
	// behavior(Same method) of parent class method changes on run-time.
	void case3() {
		System.out.println("**********CASE-3**************");
		Assignment37_Manager case3 = new Assignment37_Employee();
		System.out.println(case3.x); // 10
		System.out.println(case3.y); // 20
		// System.out.println(case3.z); //CE, because Parent class reference is not
		// aware of this variable.
		case3.m1(); // Manager - m1
		case3.m2(); // Employee - m2
		// case3.m3(); //CE, as manager class is not aware of employee class method.
	}

	/*
	 * We get CE, if we try to create parent class object using child class
	 * reference. Also if we type cast then runtime exception will be triggered.
	 */
	void case4() {
		System.out.println("*****************CASE-4: TypeCasting********************");
		// In this section --Assignment37_Employee case4 = new Assignment37_Manager(); //CE, type Casting
		// correct casting is required.
		// Assignment37_Employee case4 = (Assignment37_Employee) new
		// Assignment37_Manager(); // RunTime Error - java.lang.ClassCastException
	}

	// We can acheive dynamic polymorphism, by using variables also. This is similar
	// to case 3.
	void case5() {
		System.out.println("CASE-5");
		Assignment37_Manager case5_parent = new Assignment37_Manager();
		Assignment37_Employee case5_child = new Assignment37_Employee();
		case5_parent = case5_child;
		System.out.println(case5_parent.x); // 10
		System.out.println(case5_parent.y); // 20
		// System.out.println(case5_parent.z); //CE,as manager class is not aware of
		// this employee class variable.
		case5_parent.m1(); // Manager - m1
		case5_parent.m2(); // Employee - m2, as behavior changes on run time.
		// case5_parent.m3(); //CE, as manager class is not aware of this emloyee class
		// method.
	}

	void case6() {
		System.out.println("*****************CASE-6: TypeCasting*********************");
		Assignment37_Manager case6_parent = new Assignment37_Manager();
		System.out.println("*********************CASE-6: Similar to Case-2***********************");

		Assignment37_Employee case6_child = new Assignment37_Employee();
		// case6_child = case6_parent; // CE, Type casting required
		// case6_child = (Assignment37_Employee)case6_parent; // RunTime Error -
		// java.lang.ClassCastException

		case6_child = (Assignment37_Employee) case6_parent; // CE, Type casting required

		System.out.println(case6_child.x); // 10
		System.out.println(case6_child.y); // 30
		System.out.println(case6_child.z); // 40
		case6_child.m1(); // Manager - m1
		case6_child.m2(); // Employee - m2
		case6_child.m3(); // Employee - m3

	}

	public static void main(String[] args) {
		Assignment37_All_InheritanceCases cases = new Assignment37_All_InheritanceCases();
		cases.case1();
		cases.case2();
		cases.case3();
		cases.case4();
		cases.case5();
		cases.case6();
	}
}