package jagrati.oops.inheritance;

public class Test {
	public static void main(String[] args) {
		
		// Pre-requiestes we have one parent class A and child class B 
		// A class Variable and method is = x y and m1 and m2
		// B class Variable y and z method m2 and m3
		
	//Case 1= creating parent class A object .When we create an object of parent class then we can access/call parent class data members only.
		// we cannot access/call child class to parent class data. 
		System.out.println("===========Case1============");
		A case1 = new A();
		System.out.println(case1.x);// print 10 from parent class A. as variable x has in parent class 
		System.out.println(case1.y);// print 20 from parent class A . as variable y has in parent class
		//System.out.println(case1.z); complie error as variable z is not present in parent class A so we can not call it while creating parent class object
		case1.m1();// A m1
		case1.m2();// A m2 
		//case1.m3();// compile error as m3 z is not present in parent class so we can call it while creating parent class object .
		
	//Case 2 = Creating child class B object.When we create an object of child class then we can access/call parent class and child class data members.
		
		System.out.println("===========Case2============");
		B case2 = new B();
		System.out.println(case2.x);// its going to print 10 from parent class A 
		System.out.println(case2.y);// 30 as B class have already y variable so. it will take from own class.
		System.out.println(case2.z);// its going to print 40 from Child class B  
		case2.m1(); //its going to print A m1 from parent class A.
		case2.m2();// its going print "B m2 " from child class B
		case2.m3();// its going to print "B m3" from child class B.
		
	//Case 3= When we create an object of child class with parent class reference, it is known as dynamic polymorphism.
	//Here, property(same variable) of parent class does not change but behavior(Same method) of parent class method changes on run-time.
	//here during compile time compiler look method m2 from Class A and run time execute method m2 from class B 
		
		System.out.println("===========Case3============");
		A case3 = new B();
		System.out.println(case3.x); // it is going to print 10 from parent class A 
		System.out.println(case3.y);// it is going to print 20 as property value not going to change 
		//System.out.println(case3.z);// CE 
		case3.m1(); // it is going to print "A m1" from parent class A
		case3.m2();// it is going to print B m2. as its method thn behaviour going to be changes in dynamic polymorphism 
		//case3.m3();CE
		
	//Case 4 = We try to create parent class object in child class . it will give CE during compile time
		System.out.println("===========Case4 typecasting required ============");
		//B case4 = new A(); CE B not convert into Class A 
		
	//Case 5 = We can acheive dynamic polymorphism, by using variables also. This is similar to case 3
		
		System.out.println("===========Case5============");
		A case5_parent = new A();
		B case5_child = new B();
		
		case5_parent = case5_child;
		
		System.out.println(case5_parent.x); // 10
		System.out.println(case5_parent.y);// 20
		//System.out.println(case5_parent.z);// CE error Parent class not able to see variable 
		
		case5_parent.m1(); // A m1
		case5_parent.m2();// B m2 Behavior change in run time it is going to print 
		//case5_parent.m3();CE 
		
	// Case 6
		System.out.println("===========Case6============");
		A case6_parent = new A();
		B case6_child = new B();
		//case6_child = case6_parent;	//(Type casting required )
		//solution
		//case6_child = (B)case6_parent;
		System.out.println(case6_child.x);
		System.out.println(case6_child.y);
		System.out.println(case6_child.z);
		
		case6_child.m1();
		case6_child.m2();
		case6_child.m3();
	
		
	}

}
